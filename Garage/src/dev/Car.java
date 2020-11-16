package dev;

public class Car extends Vehicle {
	private Body body;
	private Engine engine;
	
	public Car(int id, Brand brand, Body body, Engine engine) {
		super(id, brand);
		this.body = body;
		this.engine = engine;
	}
	
	
}
