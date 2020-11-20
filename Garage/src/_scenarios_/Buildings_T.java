package _scenarios_;

import buildings.Address;
import buildings.Garage;
import enums.Education;
import enums.Level;
import enums.Rank;
import enums.Specialization;
import people.Master;
import people.Worker;

public class Buildings_T {

	public static void main(String[] args) {
		Address a = new Address("Beer Sheva", "Trumpeldor 10");
		Garage g = new Garage("Alufot20", a);
		System.out.println(g);
		
		Worker w1 = new Master("Klara", Education.BTECH, Rank.Senior, Specialization.Painting, Level.Moderate, Level.High);
		Worker w2 = new Master("Viola", Education.BSC,   Rank.Senior, Specialization.Engines,  Level.High,     Level.Moderate);
		Worker w3 = new Master("Lea",   Education.BSC,   Rank.Junior, Specialization.Engines,  Level.Moderate, Level.Moderate);
		
		Worker[] t = {w1, w2, w3};
		g.setTeam(t);	
		System.out.println(g);


	}

}
