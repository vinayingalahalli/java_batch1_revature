package com.model;

public class Player {
	public Player() {
		// TODO Auto-generated constructor stub
	}

	private int id;
	private String name;
	private Team team;
	
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
	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", team=" + team + "]";
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	

}
