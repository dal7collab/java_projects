package dev;

import java.util.Arrays;

public class Manager extends Worker {
	private Specialization spec;
	private Education      edcn;
	private Master[]       masters;
	
	public Manager(String name, Rank rank, Specialization spec, Education edcn, Master[] masters) {
		super(name, rank);
		this.spec = spec;
		this.edcn = edcn;
		this.masters = masters;
	}
	
	public Manager(String name) {
		super(name, Rank.Junior);
		this.spec = Specialization.Office;
		this.edcn = Education.BA;
		this.masters = null;
	}


	public Master[] getMasters() {
		return masters;
	}

	public void setMasters(Master[] masters) {
		this.masters = masters;
	}

	@Override
	public String toString() {
		return String.format("Manager [spec=%s, edcn=%s, masters=%s, name=%s, rank=%s]", spec, edcn,
				Arrays.toString(masters), name, rank);
	}
	
	
	
	
}
