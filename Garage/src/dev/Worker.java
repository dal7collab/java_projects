package dev;

public abstract class Worker {
	protected String name;
	protected Rank rank;
	
	public Worker(String name, Rank rank) {
		this.name = name;
		this.rank = rank;
	}
	
	public Worker(String name) {
		this(name, Rank.Junior);
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return String.format("Worker [name=%s, rank=%s]", name, rank);
	}
	
}
