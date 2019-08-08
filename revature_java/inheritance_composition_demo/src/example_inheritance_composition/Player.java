package example_inheritance_composition;

public class Player extends Person {// is-a relationship(inheritance mapping)

	private Team team; //has-a relationship(composition mapping)
	private String position;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Player(int id, String name, Team team, String position) {
		super(id, name);
		this.team = team;
		this.position = position;
	}



	public Team getTeam() {
		return team;
	}



	public void setTeam(Team team) {
		this.team = team;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public void printPlayer() {
		System.out.println("Player details are");
		super.printPerson();
		team.printTeam();
		System.out.println("Position : "+position);
	}
}
