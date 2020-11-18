package services;

import enums.Status;
import people.Manager;
import people.Master;
import vehicles.Car;
import vehicles.Truck;
import vehicles.Vehicle;

public class Job {
	private int     id;
	private Manager manager;
	private Vehicle vehicle;
	private Master  master;
	private Status  status;
	
	public Job(int id, 
			   Manager manager,
			   Vehicle vehicle,
			   Master master,
			   Status status) {
		this.id = id;
		this.manager = manager;
		this.vehicle = vehicle;
		this.master = master;
		this.status = status;
	}
	
	public Job() {
		this(0, null, null, null, Status.Undefined);
	}
	
	public Job(int id, Manager manager) {
		this(0, manager, null, null, Status.Created);
	}
	
	public int getJobId() {
		return id;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return String.format("Job [id=%s, manager=%s, vehicle=%s, master=%s, status=%s]", id, manager, vehicle, master,
				status);
	}
	
	
	
}
