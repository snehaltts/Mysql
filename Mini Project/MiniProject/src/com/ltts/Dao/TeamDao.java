package com.ltts.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.config.MyConnection;
import com.ltts.model.Team;

public class TeamDao {
	public List<Team> getAllTeams(){
		List<Team> li=new ArrayList<Team>();
		
		return li;

}
	
public Team getTeamById(int id) {
	Team t = new Team(id, null,null, null, 0);
	
	return t;
}

public boolean createTeams() throws Exception {
	Connection mc=MyConnection.getConnection();
	
	PreparedStatement ps=mc.prepareStatement("create table if not exists team(tId int(2) primary key , tName varchar(20))");
	return ps.execute();
	
}
public void insertTeams() throws Exception {
	Connection mc=MyConnection.getConnection();
	
	Statement s = mc.createStatement();
	
	PreparedStatement ps=mc.prepareStatement("insert into team  (tId,tName) values (1,'CSK'),(2,'DC'),(3,'KKR'),(4,'KXIP'),(5,'MI'),(6,'RCB'),(7,'RR'),(8,'SRH')");
		
	System.out.println("Record is inserted");
	 ps.executeUpdate();
	
}

public void updateTOwner(Team t) throws Exception {
	Connection mc=MyConnection.getConnection();
	
	Statement s = mc.createStatement();
	
	PreparedStatement ps=mc.prepareStatement("update team  set ownername = (?)  where tId = (?); ");
	
	ps.setString(1,t.getOwnerName());
	ps.setInt(2,t.getTId());
	
	boolean rs = ps.execute();
    
	if(rs)
	{
		
	}
	else{
		System.out.println("Team Owner successfully updated.");
	}

}

public void updateTCoach(Team t) throws Exception {
	Connection mc=MyConnection.getConnection();
	
	Statement s = mc.createStatement();
	
	PreparedStatement ps=mc.prepareStatement("update team set coachname = (?)  where tid = (?); ");
	ps.setString(1,t.getCoach());
	ps.setInt(2,t.getTId());
	boolean rs = ps.execute();
	
	boolean rs1 = ps.execute();
    
	if(rs1)
	{}
	else{
		System.out.println("Team Coach successfully updated.");
	}
}
public void displayTeams() throws Exception {
	Connection mc=MyConnection.getConnection();
	
	Statement s = mc.createStatement();
	
	PreparedStatement ps = mc.prepareStatement("select * from Team");
	ResultSet rs = ps.executeQuery();
	
	while(rs.next()){
		System.out.println(rs.getString(1)+" " + rs.getString(2));
	}
	
	mc.close();
	
}

private int getPId() {
	return 0;
}
private String getPName() {
	return null;
}
public boolean updatePlayer(int id) {
	return true;
}

}
