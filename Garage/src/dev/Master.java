package dev;

public class Master extends Worker {
	private Specialization spec;
	private Education      edcn;
	
	public Master(String name, Rank rank, Specialization spec, Education edc) {
		super(name, rank);
		this.spec = spec;
		this.edcn = edc;
	}
	
	public Master(String name, Specialization spec) {
		this(name, Rank.Junior, spec , Education.BTECH);
	}
	
	public Master(String name) {
		this(name, Rank.Junior, Specialization.Assistance , Education.BTECH);
	}

	public Specialization getSpec() {
		return spec;
	}

	public void setSpec(Specialization spec) {
		this.spec = spec;
	}

	public Education getEdcn() {
		return edcn;
	}

	public void setEdcn(Education edcn) {
		this.edcn = edcn;
	}

	@Override
	public String toString() {
		return String.format("Master [spec=%s, edcn=%s, name=%s, rank=%s]", spec, edcn, name, rank);
	}
		
}
