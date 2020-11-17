package buildings;

import java.util.Arrays;

import people.Worker;

public class Garage {
	private String   name;
	private Address  address;
	private Worker[] team;

	public Garage() {
		this.name = "Alufot2000";
		this.address = new Address();
	}
	
	public void setTeam(Worker[] team) {
		this.team = team;
	}
	
	@Override
	public String toString() {
		return String.format("Garage [name=%s, address=%s, team=%s]", name, address, Arrays.toString(team));
	}
	
}