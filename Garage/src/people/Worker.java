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

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the edct
	 */
	public Education getEdct() {
		return edct;
	}

	/**
	 * @param edct the edct to set
	 */
	public void setEdct(Education edct) {
		this.edct = edct;
	}

	/**
	 * @return the rank
	 */
	public Rank getRank() {
		return rank;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(Rank rank) {
		this.rank = rank;
	}

	/**
	 * @return the spec
	 */
	public Specialization getSpec() {
		return spec;
	}

	/**
	 * @param spec the spec to set
	 */
	public void setSpec(Specialization spec) {
		this.spec = spec;
	}

	/**
	 * @return the managerName
	 */
	public String getManagerName() {
		return managerName;
	}

	/**
	 * @param managerName the managerName to set
	 */
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return String.format("Worker [name=%s, edct=%s, rank=%s, spec=%s, managerName=%s]", name, edct, rank, spec,
				managerName);
	}
		
}
