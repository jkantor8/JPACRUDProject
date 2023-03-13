package com.skilldistillery.footballbowlsubdivision.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String school;
	@Column(name = "team_name")
	private String teamName;
	private String mascot;
	private String conference;
//	@Column(name = "logo_url")
//	private String logo;
	@Column(name = "national_championships")
	private Integer nationalChampionships;

	public Team() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getMascot() {
		return mascot;
	}

	public void setMascot(String mascot) {
		this.mascot = mascot;
	}

	public String getConference() {
		return conference;
	}

	public void setConference(String conference) {
		this.conference = conference;
	}

//	public String getLogo() {
//		return logo;
//	}
//
//	public void setLogo(String logo) {
//		this.logo = logo;
//	}

	public Integer getNationalChampionships() {
		return nationalChampionships;
	}

	public void setNationalChampionships(Integer nationalChampionships) {
		this.nationalChampionships = nationalChampionships;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", school=" + school + ", teamName=" + teamName + ", mascot=" + mascot
				+ ", conference=" + conference + ", nationalChampionships=" + nationalChampionships
				+ "]";
	}

}
