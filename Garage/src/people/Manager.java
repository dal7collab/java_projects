package people;

import java.util.Arrays;

import enums.Education;
import enums.Rank;
import enums.Specialization;

public class Manager extends Worker {
	private Worker[] masters;
		
	public Manager(String name,
			       Education edct, 
			       Rank rank,
			       Specialization spec,
			       Worker[] masters) {
		super(name, edct, rank, spec);
		setMasters(masters);
	}

	public Manager(String name) {
		super(name);
	}

	public Worker[] getMasters() {
		return masters;
	}

	public void setMasters(Worker[] masters) {
		this.masters = masters;
	}

	@Override
	public String toString() {
		return String.format("Manager [workers=%s,"
				                      + " name=%s,"
				                      + " edct=%s,"
				                      + " rank=%s,"
				                      + " spec=%s]", 
				                      Arrays.toString(masters), name, edct, rank, spec);
	}
	
}
