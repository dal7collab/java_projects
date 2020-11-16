package dev;

public class Address {
	private String city;
	private String street;
	
	public Address(String city, String street) {
		this.city = city;
		this.street = street;
	}
	
	public Address (String street) {
		this("Yeruham", street);
	}
	
	public Address () {
		this("Yeruham", "Nachlieli 5");
	}

	@Override
	public String toString() {
		return String.format("Address [city=%s, street=%s]", city, street);
	}
	
	
	
	
	
}
