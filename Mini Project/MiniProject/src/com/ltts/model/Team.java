package com.ltts.model;

public class Team {
	
	private int tId;
	private String tName;
	private String ownerName;
	private String coach;
	private int captainId;
	
	public Team() {
		super();
	}
	public Team(int tId, String tName, String ownerName, String coach, int captainId) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.ownerName = ownerName;
		this.coach = coach;
		this.captainId = captainId;
	}
	public int getTId() {
		return tId;
	}
	public void setTId(int tId) {
		this.tId = tId;
	}
	public String getTName() {
		return tName;
	}
	public void setTName(String tName) {
		this.tName = tName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public int getCaptainId() {
		return captainId;
	}

	public void setCaptainId(int captainId) {
		this.captainId = captainId;
	}
	
}
