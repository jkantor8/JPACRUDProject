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
		// TODO Auto-generated method stub
		return null;
	}

	
	//REMINDER
	//NO begin/commit
	//NO em.close();
	@Override
	public Team update(int id, Team team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
