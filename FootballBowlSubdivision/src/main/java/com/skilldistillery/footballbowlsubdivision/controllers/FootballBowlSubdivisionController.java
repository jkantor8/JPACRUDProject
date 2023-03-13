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
	//Home mapping
	@RequestMapping (path = {"/", "home.do"})
	public String goHome(Model model) {
		model.addAttribute("teams", fbsDao.findAll());
		return "home";
	}
	
	@RequestMapping(path="getTeamById.do")
	public String showFilm(Integer id, Model model) {
		Team team = fbsDao.findById(id);
		model.addAttribute("team", team);
		return "show";
		// return "index"; // if using a ViewResolver.
		
	}

	
	@RequestMapping(path= "addTeamForm.do")
	public String create() {
		return "addTeamForm";
	
	
	}
	
	@RequestMapping(path="addTeam.do", method = RequestMethod.POST)
	public String createTeam(Model model, Team team) {
		Team newTeam = fbsDao.create(team);
			model.addAttribute("team", newTeam);
			return "addTeamResult";
			
	}
			
		@RequestMapping(path="deleteTeam.do")
		public String deleteTeam(int id, Model model) {
			boolean deleted =  fbsDao.deleteById(id);
			model.addAttribute("team", deleted);
			
		
			return "teamDeleted";
		}

		@RequestMapping(path="updateTeamForm.do")
		public String update(Model model, int id) {
			Team team = fbsDao.findById(id);
			model.addAttribute("team", team);
			return "updateTeam";
		}
		
		
		@RequestMapping(path="updateTeam.do", method = RequestMethod.POST)
		public String updateTeam(int id, Team team, Model model) {
			Team updatedTeam = fbsDao.update(team.getId(), team);
			model.addAttribute("team", updatedTeam);
			return "teamUpdated";
		}

	}

