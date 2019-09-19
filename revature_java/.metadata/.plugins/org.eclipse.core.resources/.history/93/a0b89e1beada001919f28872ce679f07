package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	private int age;
	private String team;
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public Player(String name, int age, String team) {
		super();
		this.name = name;
		this.age = age;
		this.team = team;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public Player(int id, String name, int age, String team) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.team = team;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", team=" + team + "]";
	}
	
}
