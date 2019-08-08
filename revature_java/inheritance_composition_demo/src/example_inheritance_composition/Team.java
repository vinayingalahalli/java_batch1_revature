package example_inheritance_composition;

public class Team {

	private int teamid;
	private String teamName;
	private String coachName;
	public Team() {
		// TODO Auto-generated constructor stub
	}
	public Team(int teamid, String teamName, String coachName) {
		super();
		this.teamid = teamid;
		this.teamName = teamName;
		this.coachName = coachName;
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
	
	public void printTeam() {
		System.out.println("Team Details are");
		System.out.println("Team Id : "+teamid);
		System.out.println("Team Name : "+teamName);
		System.out.println("Coach Name : "+coachName);
	}
}
