package vehicles;

import enums.Body;
import enums.Brand;
import enums.Engine;

public class Car extends Vehicle {
	private Body   body;
	private Engine engine;
	
	public Car(int id, Brand brand, Body body, Engine engine) {
		super(id, brand);
		this.body = body;
		this.engine = engine;
	}
	
	
}
