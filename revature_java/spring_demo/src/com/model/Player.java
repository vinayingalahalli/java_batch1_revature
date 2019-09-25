package com.model;

import java.util.List;

public class Player {
	public Player() {
		// TODO Auto-generated constructor stub
	}

	private int id;
	private String name;
	private List<Team> teamList;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Team> getTeamList() {
		return teamList;
	}


	public void setTeamList(List<Team> teamList) {
		this.teamList = teamList;
	}


	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", teamList=" + teamList + "]";
	}
	
	

}
