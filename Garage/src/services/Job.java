package services;

import enums.Status;
import enums.Work;
import people.Manager;
import people.Master;
import vehicles.Vehicle;

public class Job {
	private int     id;
	private Status  status;
	private Work    work;
	private Vehicle vehicle;
	private Manager manager;
	private Master  master;
	
	public Job(int id, 
			   Status status,
			   Work work,
			   Vehicle vehicle,
			   Manager manager,
			   Master master) {
		this.id = id;
		this.manager = manager;
		this.vehicle = vehicle;
		this.master  = master;
		this.status  = status;
		this.work    = work;
	}
	
	public Job() {
		this(0, Status.Undefined, Work.Other, null, null, null);
	}
	
	public Job(int id) {
		this(id, Status.Created, Work.Other, null, null, null);
	}
	
	public Job(int id, Manager manager) {
		this(id, Status.Created, Work.Other, null, manager, null);
	}
	
	
	public int getJobId() {
		return id;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return String.format("Job [id=%s, status=%s, work=%s, vehicle=%s, manager=%s, master=%s]", id, status, work,
				vehicle, manager, master);
	}

	
}
