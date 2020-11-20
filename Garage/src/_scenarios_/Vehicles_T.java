package _scenarios_;

import enums.Body;
import enums.Brand;
import enums.Engine;
import vehicles.Car;
import vehicles.Truck;
import vehicles.Vehicle;

public class Vehicles_T {
	public static void main(String[] args) {
		Vehicle v1 = new Car(10200409,   Brand.Hiundai, Body.Sedan, Engine.Gasoline);		
		Vehicle v2 = new Car(20010087,   Brand.Kia,     Body.Sedan, Engine.Gasoline);
		Vehicle v3 = new Car(56723412,   Brand.Opel,    Body.Sedan, Engine.Diesel);
		Vehicle t1 = new Truck(56723412, Brand.Opel,    2000, 5);

		Vehicle[] a = {v1, v2, v3, t1};
		for (Vehicle v : a) {
			System.out.println(v);
		}

	}
}
