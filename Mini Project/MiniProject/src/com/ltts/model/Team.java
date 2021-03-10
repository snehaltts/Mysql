package com.ltts.model;

public class Team {
	private int tid;
	private String tname;
    private String ownername;
    private String coachname;
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Team(int tid, String tname, String ownername, String coachname) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.ownername = ownername;
		this.coachname = coachname;
	}
	public int getT_id() {
		return tid;
	}
	public void setT_id(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getCoachname() {
		return coachname;
	}
	public void setCoachname(String coachname) {
		this.coachname = coachname;
	}
	
	public String toString() {
		return "Team [tid=" + tid + ", tname=" + tname + ", ownername=" + ownername + ", coachname="
				+ coachname + "]";
	}
    
    
}
