package com.skilldistillery.footballbowlsubdivision.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.footballbowlsubdivision.entities.Team;

@Service
@Transactional
public class FootballBowlSubdivisionDAOImpl implements FootballBowlSubdivisionDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Team findById(int id) {
		return em.find(Team.class, id);
	}

	@Override
	public List<Team> findAll() {
		String jpql = "SELECT team FROM Team team";
		return em.createQuery(jpql, Team.class).getResultList();
	}

	@Override
	public Team create(Team team) {

		em.persist(team);

		return team;
	}

	// REMINDER
	// NO begin/commit
	// NO em.close();
	@Override
	public Team update(int id, Team team) {

		Team managed = em.find(Team.class, id);
		
		if (managed != null) {
		managed.setSchool(team.getSchool());
		managed.setTeamName(team.getTeamName());
		managed.setMascot(team.getMascot());
		managed.setConference(team.getConference());
		managed.setLogo(team.getLogo());
		managed.setNationalChampionships(team.getNationalChampionships());
		
		em.persist(managed);
		em.flush();
		}
		
		return managed;
	}

	@Override
	public boolean deleteById(int id) {
		boolean success = false;

		Team toDelete = em.find(Team.class, id);
		if (em.contains(toDelete)) {
	
			em.remove(toDelete);
			

		} else {
			success = false;
		}
		return success;
	}

}
