package com.ltts.model;

import java.sql.Date;

public class Player {
	private int PId;
	private String name;
	private Date dateOfBirth;
	private String nationality;
	private String skills;
	private int runs;
	private int wickets;
	private int number_of_matches;
	private int tid;
	
	
	public Player() {
		super();
	}


	public Player(int p_id, String name, Date dateOfBirth, String nationality, String skills, int runs,
			int wickets, int number_of_matches, int t_id) {
		super();
		PId = p_id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
		this.skills = skills;
		this.runs = runs;
		this.wickets = wickets;
		this.number_of_matches = number_of_matches;
		this.tid = t_id;
	}


	public int getP_id() {
		return PId;
	}


	public void setP_id(int p_id) {
		PId = p_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public String getSkills() {
		return skills;
	}


	public void setSkills(String skills) {
		this.skills = skills;
	}


	public int getRuns() {
		return runs;
	}


	public void setRuns(int runs) {
		this.runs = runs;
	}


	public int getWickets() {
		return wickets;
	}


	public void setWickets(int wickets) {
		this.wickets = wickets;
	}


	public int getNumber_of_matches() {
		return number_of_matches;
	}


	public void setNumber_of_matches(int number_of_matches) {
		this.number_of_matches = number_of_matches;
	}


	public int getT_id() {
		return tid;
	}


	public void setT_id(int t_id) {
		this.tid = t_id;
	}

	public String toString() {
		return "Player [P_id=" + PId + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", nationality="
				+ nationality + ", skills=" + skills + ", runs=" + runs + ", wickets=" + wickets
				+ ", number_of_matches=" + number_of_matches + ", t_id=" + tid + "]";
	}
	

}
