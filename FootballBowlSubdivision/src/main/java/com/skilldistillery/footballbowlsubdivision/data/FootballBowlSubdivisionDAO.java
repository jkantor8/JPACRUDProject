package com.skilldistillery.footballbowlsubdivision.data;

import java.util.List;

import com.skilldistillery.footballbowlsubdivision.entities.Team;

public interface FootballBowlSubdivisionDAO {
	Team findById(int id);
	List<Team> findAll();
	Team create(Team team);
	Team update(int id, Team team);
	boolean deleteById(int id);
}
