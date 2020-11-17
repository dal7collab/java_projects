package vehicles;

import enums.Brand;

public class Truck extends Vehicle {
	private double weight;
	private double length;
	
	public Truck(int id, Brand brand, double weight, double length) {
		super(id, brand);
		this.weight = weight;
		this.length = length;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return String.format("Truck [weight=%s, length=%s, id=%s, brand=%s]", weight, length, id, brand);
	}	
	
}
