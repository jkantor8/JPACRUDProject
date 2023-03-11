package com.skilldistillery.footballbowlsubdivision.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.footballbowlsubdivision.data.FootballBowlSubdivisionDAO;

@Controller
public class FootballBowlSubdivisionController {

	
	@Autowired
	private FootballBowlSubdivisionDAO fbsDao;
	
	@RequestMapping (path = {"/", "home.do"})
	public String goHome(Model model) {
		model.addAttribute("teams", fbsDao.findAll());
		return "home";
	}
}
