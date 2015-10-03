package models;

public class Counselor extends Role {
	
	private String team;

	public String getRole() {
		return role; // Seems pointless?
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	@Override
	public String toString() {
		return "Counselor";
	}
	
}
