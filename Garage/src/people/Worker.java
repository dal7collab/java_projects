package people;

import enums.Education;
import enums.Rank;
import enums.Specialization;

public abstract class Worker {
	protected String         name;
	protected Education      edct;
	protected Rank           rank;
	protected Specialization spec;
	protected String         managerName;
	
	public Worker(String name,
			      Education edct,
			      Rank rank,
			      Specialization spec) {
		this.name = name;
		this.edct = edct;
		this.rank = rank;
		this.spec = spec;
	}
	
	public Worker(String name) {
		this.name = name;
		this.edct = Education.SCHOOL;
		this.rank = Rank.Junior;
		this.spec = Specialization.Assistance;
	}
	
	public Worker(Worker o) {
		this(o.name,
			 o.edct,
			 o.rank,
			 o.spec);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Education getEdct() {
		return edct;
	}

	public void setEdct(Education edct) {
		this.edct = edct;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Specialization getSpec() {
		return spec;
	}

	public void setSpec(Specialization spec) {
		this.spec = spec;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return String.format("Worker [name=%s, edct=%s, rank=%s, spec=%s, managerName=%s]", name, edct, rank, spec,
				managerName);
	}		
}
