package com.ltts.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.config.MyConnection;
import com.ltts.model.Player;
import com.ltts.model.Team;

public class PlayerDao {
	public List<Player> getAllPlayers(){
		List<Player> li=new ArrayList<Player>();
		
		return li;

}
public Player getplayerById(int id) {
	Player p=new Player();	
	return p;
}

public boolean createPlayer() throws Exception {
	Connection mc= MyConnection.getConnection();
	
	PreparedStatement ps1=mc.prepareStatement("create table player(pId int(2) primary key , name varchar(20), date date, skill varchar(30), noOfmatches int, runs int, wickets int,nation varchar(30),power double,tId int,FOREIGN KEY (tId) REFERENCES Team(tid))");
	return ps1.execute();
	
}


public void insertPlayer(Player p) throws Exception {
	
	Connection mc=MyConnection.getConnection();
	Statement stmt = mc.createStatement();
	PreparedStatement ps=mc.prepareStatement("insert into player values(?,?,?,?,?,?,?,?,?,?);");
	  ps.setInt(1,p.getPId());
	  ps.setString(2,p.getName()); ps.setString(3,p.getDateOfBirth());
	  ps.setString(4,p.getSkill()); ps.setInt(5,p.getNumberOfMatches());
	  ps.setInt(6,p.getRuns()); ps.setInt(7,p.getWickets());
	  ps.setString(8,p.getNationality()); ps.setDouble(9,p.getPowerRating());
	  ps.setInt(10,p.getTId());
	 
	 System.out.println(p.getName());
	 ps.executeUpdate();	
	 System.out.println("Successfully Added");
}

public void searchPlayer(Player p) throws Exception{
	
	Connection mc=MyConnection.getConnection();
	Statement stmt = mc.createStatement();
	
	PreparedStatement ps = mc.prepareStatement("select p.name, t.tName, t.coachname, p.date, t.captainid from player p,team t  where p.tId=t.tId && p.pId = (?);");
	
	 ps.setInt(1,p.getPId());
	ResultSet rs = ps.executeQuery();
	
	while(rs.next()){
		System.out.println(rs.getString(1)+" " + rs.getString(2)+" " + rs.getString(3)+" " + rs.getString(4)+" " + rs.getString(5));
	}
	
	mc.close();	
}

public void searchPlayerbyname(Player p) throws Exception{
	
	Connection mc=MyConnection.getConnection();
	Statement stmt = mc.createStatement();
	
	PreparedStatement ps = mc.prepareStatement("select p.name, t.teamName, t.coachname, p.date, t.captainid from player p,team t  where p.tId=t.tId && p.name = (?);");
	
	 ps.setString(1,p.getName());
	ResultSet rs = ps.executeQuery();
	
	while(rs.next()){
		System.out.println(rs.getString(1)+" " + rs.getString(2)+" " + rs.getString(3)+" " + rs.getString(4)+" " + rs.getString(5));
	}
	
	mc.close();	
}

public void displayallPlayer(Player p) throws Exception{
	
	Connection mc=MyConnection.getConnection();
	Statement stmt = mc.createStatement();
	
	PreparedStatement ps = mc.prepareStatement("select * from player;");

	ResultSet rs = ps.executeQuery();
	
	while(rs.next()){
		System.out.println(rs.getInt(1)+" " + rs.getString(2)+" " +  rs.getString(3)+" " +  rs.getString(4) + " " + rs.getInt(5) + " " + rs.getInt(6) + " " + rs.getInt(7) + " " + rs.getString(8)+ " " + rs.getInt(9) + " " + rs.getInt(10));
	}
	
	mc.close();
		
}

public void displayPlayeronTeam(Player p,Team t) throws Exception{
	
	Connection mc=MyConnection.getConnection();
	Statement stmt = mc.createStatement();
	
	PreparedStatement ps = mc.prepareStatement("select * from player p,team t  where p.tId=t.tId && t.tName = (?);");
	
	 ps.setString(1,t.getTName());

	 
	ResultSet rs = ps.executeQuery();
	
	while(rs.next()){
		System.out.println(rs.getInt(1)+" " + rs.getString(2)+" " +  rs.getString(3)+" " +  rs.getString(4) + " " + rs.getInt(5) + " " + rs.getInt(6) + " " + rs.getInt(7) + " " + rs.getString(8)+ " " + rs.getInt(9) + " " + rs.getInt(10));
	}
	
	mc.close();
}

public void displayPlayeronTeamandskill(Player p,Team t) throws Exception{
	
	Connection mc=MyConnection.getConnection();
	Statement stmt = mc.createStatement();
	
	PreparedStatement ps = mc.prepareStatement("select * from player p,team t  where (p.tId=t.tId) && (p.skill = (?) && t.tName = (?)) ;");
	
	 ps.setString(2,t.getTName());
	 ps.setString(1,p.getSkill());
	 
	 ResultSet rs = ps.executeQuery();
	
	 while(rs.next()){
			System.out.println(rs.getInt(1)+" " + rs.getString(2)+" " +  rs.getString(3)+" " +  rs.getString(4) + " " + rs.getInt(5) + " " + rs.getInt(6) + " " + rs.getInt(7) + " " + rs.getString(8)+ " " + rs.getInt(9) + " " + rs.getInt(10));
		}
		
		mc.close();
	
}

public void updatePRuns(Player p) throws Exception {
	Connection mc=MyConnection.getConnection();
	
	Statement s = mc.createStatement();
	
	PreparedStatement ps=mc.prepareStatement("update player  set runs = (?)  where pId = (?); ");
	
	ps.setInt(1,p.getRuns());
	ps.setInt(2,p.getPId());
	
     
	boolean rs = ps.execute();
    
	if(rs)
	{
		
	}
	else{
		System.out.println("Player Runs successfully updated.");
	}
	
}

public void updatePWickets(Player p) throws Exception {
	Connection mc=MyConnection.getConnection();
	
	Statement s = mc.createStatement();
	
	PreparedStatement ps=mc.prepareStatement("update player set wickets = (?)  where pId = (?); ");
	
	ps.setInt(1,p.getWickets());
	ps.setInt(2,p.getPId());
	
	boolean rs = ps.execute();
    
	if(rs)
	{
		
	}
	else{
		System.out.println("Player Wickets successfully updated.");
	}
	
}

public void deletePlayer(Player p) throws Exception {
	Connection mc=MyConnection.getConnection();
	
	Statement s = mc.createStatement();
	
	PreparedStatement ps=mc.prepareStatement("delete from player where name = (?); ");
	
	ps.setString(1,p.getName());
	
	boolean rs = ps.execute();
    
	if(rs)
	{}
	else{
		System.out.println("Player sucessfully deleted.");
	}
	
}

}
