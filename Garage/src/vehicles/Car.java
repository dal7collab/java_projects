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

	@Override
	public String toString() {
		return String.format("Car [body=%s, engine=%s, id=%s, brand=%s]", body, engine, id, brand);
	}
	
	
	
	
}
