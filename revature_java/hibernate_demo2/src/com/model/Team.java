package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Team implements Serializable {
	
	@Id
	@GeneratedValue
	private int teamid;
	private String teamName;
	private String coachName;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public int getTeamid() {
		return teamid;
	}

	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public Team(String teamName, String coachName) {
		super();
		this.teamName = teamName;
		this.coachName = coachName;
	}

	@Override
	public String toString() {
		return "Team [teamid=" + teamid + ", teamName=" + teamName + ", coachName=" + coachName + "]";
	}
	
	
}
