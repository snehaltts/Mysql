package com.ltts.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.text.SimpleDateFormat;

import com.ltts.Dao.PlayerDao;
import com.ltts.Dao.TeamDao;
import com.ltts.model.Player;
import com.ltts.model.Team;

public class Main {

	public static void main(String[] args) throws Exception {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Player t= new Player();
Team t1 = new Team();

System.out.println("Choose: ");

System.out.println("1.Insert into table player : ");

System.out.println("2.Search Player by PlayerId");

System.out.println("3.Search Player by PlayerName");

System.out.println("4.Update the table Player/Team");

System.out.println("5.View All the players");

System.out.println("6.View All the players based on Team");

System.out.println("7.View All the players based on Team and Skill");

System.out.println("8.Delete Player");


int id =Integer.parseInt(br.readLine());
PlayerDao td=new PlayerDao();
TeamDao ttd=new TeamDao();


if(id==1){
	System.out.println("Enter Player Details: ");
	System.out.println("Enter Player ID: ");
	     int pno=Integer.parseInt(br.readLine());
	System.out.println("Enter Player Name:");
	     String name=br.readLine();
	     System.out.println("Enter DateOfBirth() in yyyy/mm/dd");
	     String ppno=br.readLine();
	     Date date1=new SimpleDateFormat("yyyy/mm/dd").parse(ppno); 
	     
	     System.out.println(ppno);
	     System.out.println("Enter Skill(batting/bowling/allrounder)");
	     String nname=br.readLine();
	     if(nname.equalsIgnoreCase("Batting") || nname.equalsIgnoreCase("Bowling")||nname.equalsIgnoreCase("All Rounder"))
	     {}
	     else
	     {
	    	 System.out.println("Please Enter the correct skill(batting/bowling/allrounder");
	     }
	     System.out.println("Enter Number Of Matches");
	     int pppno=Integer.parseInt(br.readLine());
	System.out.println("Enter Player Runs:");
	     int nnname=Integer.parseInt(br.readLine());
	     System.out.println("Enter Player Wickets");
	     int ppppno=Integer.parseInt(br.readLine());
	System.out.println("Enter Player Nationality");
	     String nnnname=br.readLine();
	     System.out.println("Enter Player PowerRating");
	     int pppppno=Integer.parseInt(br.readLine());
	System.out.println("Team Details: ");   
	    ttd.displayTeams();
	System.out.println("Enter Team Details: ");
	System.out.println("Enter Team ID: ");
	     int tno=Integer.parseInt(br.readLine());
	      t= new Player(pno,name,ppno,nname,pppno,nnname,ppppno,nnnname,pppppno,tno);
}
if(id==2)		  
		  {	
	
		  System.out.println("Enter player id: ");
		  int pid = Integer.parseInt(br.readLine());
		  t= new Player(pid, null, null, null, 0, 0, 0, null,0, 0);
		  
		  td.searchPlayer(t);
		  
		  }

if(id==3)		  
{		
System.out.println("Enter player playerName: ");
String pname = br.readLine();
t= new Player(0, pname, null, null, 0, 0, 0, null,0, 0);

 
td.searchPlayerbyname(t);

}

	if(id==4)
	{
		System.out.println("Choose 1/2 ");
		System.out.println("1.Player Update");
		System.out.println("2.Team Update");
		int y=Integer.parseInt(br.readLine());
		if(y==1){
			System.out.println("Choose 1/2 ");
			System.out.println("1.Player Update runs");
			System.out.println("2.Player Update wkts");
			
			int z=Integer.parseInt(br.readLine());
			if(z==1)
			{	

				  System.out.println("Enter player id: ");
				  int pid = Integer.parseInt(br.readLine());
				  
				  System.out.println("Enter player runs : ");
				  
				  int pruns = Integer.parseInt(br.readLine());
				  
				  t= new Player(pid, null, null, null, 0, pruns, 0, null,0, 0);
				  
				   
				  td.updatePRuns(t);
			
				
			}
			if(z==2)
			{
				System.out.println("Enter player id: ");
				 int pid = Integer.parseInt(br.readLine());
				  
				 System.out.println("Enter player wickets : ");
				  
				  int pwiks = Integer.parseInt(br.readLine());
				  
				  t= new Player(pid, null, null, null, 0, 0, pwiks, null,0, 0);			  
				   
				  td.updatePWickets(t);
			}
		}
			if(y==2)
			{
				System.out.println("Choose 1/2 ");
				System.out.println("1.Team Update owner");
				System.out.println("2.Team Update coach");
				
				int x=Integer.parseInt(br.readLine());
				if(x==1){	

					  System.out.println("Enter Team id: ");
					  int pid = Integer.parseInt(br.readLine());
					  
					  System.out.println("Enter Team owner name : ");
					  
					  String towner = br.readLine();
					  
					  t1= new Team(pid, null,towner, null,0);
					  				   
					  ttd.updateTOwner(t1);				
					
				}
				if(x==2)
				{
					System.out.println("Enter Team id: ");
					 int pid = Integer.parseInt(br.readLine());
					  
					 System.out.println("Enter Team Coach : ");
					  
					  String  tcoach = br.readLine();
					  
					  t1= new Team(pid, null,null, tcoach,0);					  
					   
					  ttd.updateTCoach(t1);				
					
				}

			}
			
		}
	if(id==5)
	{
		t= new Player(0, null, null, null, 0, 0, 0, null,0, 0);
		     
		  td.displayallPlayer(t);
	
	}

	if(id==6)
	{
		t= new Player(0, null, null, null, 0, 0, 0, null,0, 0);
		  
		System.out.println("View All the players based on Team");
			
		System.out.println("Enter team name");
		
		String  tname = br.readLine();
		t1= new Team(0, tname,null, null,0);  
			
		td.displayPlayeronTeam(t,t1);
	
	}
	
	if(id==7)
	{
	
		System.out.println("View All the players based on Team and skill");
		
		
		System.out.println("Enter team name");
		
		String  tname = br.readLine();
			
		System.out.println("Enter player skill");
		
		String  pskill = br.readLine();
		
		
		t=  new Player(0, null, null, pskill, 0, 0, 0, null,0, 0);
		
		t1= new Team(0, tname,null, null,0);  
				
		td.displayPlayeronTeamandskill(t,t1);
	
	}
	if(id==8)
	{
		System.out.println("Enter player name to be deleted");
		
		String  ppname = br.readLine();
		
		t= new Player(0, ppname, null, null, 0, 0, 0, null,0, 0);		  
		   
		  td.deletePlayer(t);
	
	}

	}
		
}