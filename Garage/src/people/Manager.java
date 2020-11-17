package people;

import java.util.Arrays;

import enums.Education;
import enums.Rank;
import enums.Specialization;

public class Manager extends Worker {
	private Worker[] workers;
		
	public Manager(String name,
			       Education edct, 
			       Rank rank,
			       Specialization spec,
			       Worker[] workers) {
		super(name, edct, rank, spec);
		this.workers = workers;
	}

	public Manager(String name) {
		super(name);
	}

	public Worker[] getMasters() {
		return workers;
	}

	public void setMasters(Worker[] workers) {
		this.workers = workers;
	}

	@Override
	public String toString() {
		return String.format("Manager [workers=%s, name=%s, edct=%s, rank=%s, spec=%s]", Arrays.toString(workers), name,
				edct, rank, spec);
	}
	
}
