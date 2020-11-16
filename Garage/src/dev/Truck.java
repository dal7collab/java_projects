package dev;

public class Truck extends Vehicle {
	private double weight;
	private double length;
	
	public Truck(int id, Brand brand, double weight, double length) {
		super(id, brand);
		this.weight = weight;
		this.length = length;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return String.format("Truck [weight=%s, length=%s, id=%s, brand=%s]", weight, length, id, brand);
	}
	
	
	
	
}
