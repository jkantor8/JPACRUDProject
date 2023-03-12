package com.skilldistillery.footballbowlsubdivision.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skilldistillery.footballbowlsubdivision.data.FootballBowlSubdivisionDAO;
import com.skilldistillery.footballbowlsubdivision.entities.Team;

@Controller
public class FootballBowlSubdivisionController {

	
	@Autowired
	private FootballBowlSubdivisionDAO fbsDao;
	
	@RequestMapping (path = {"/", "home.do"})
	public String goHome(Model model) {
		model.addAttribute("teams", fbsDao.findAll());
		return "home";
	}
	
	@RequestMapping(path="getTeam.do")
	public String showFilm(Integer id, Model model) {
		Team team = fbsDao.findById(id);
		model.addAttribute("team", team);
		return "show";
		// return "index"; // if using a ViewResolver.
	}
	
	@RequestMapping(path="addTeam.do")
	public String createTeam(Model model, Team team) {
		Team newTeam = fbsDao.create(team);
		if (newTeam != null) {
			model.addAttribute("team", newTeam);
			return "show";
		} else {
			return null;
		}
	}
		@RequestMapping(path="deleteTeam.do", method = RequestMethod.POST)
		public String deleteTeam(Model model, Team team) {
			Team teamToDelete = fbsDao.findById(team.getId());
			boolean deleted = fbsDao.deleteById(team.getId());
			if (deleted) {
				model.addAttribute("message", teamToDelete.getSchool() + " deleted!");
			} else {
				model.addAttribute("message", "Unable to delete " + teamToDelete.getSchool());
			}
			return "delete";
		}

		
		@RequestMapping(path="updateTeam.do")
		public String updateTeam(Model model) {
			return "show";
		}

	}

