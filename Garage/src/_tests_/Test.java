package _tests_;

import buildings.Garage;
import enums.Education;
import enums.Rank;
import enums.Specialization;
import people.Manager;
import people.Master;
import people.Worker;

public class Test {

	public static void main(String[] args) {
		Garage g = new Garage();
		System.out.println(g);
		
		System.out.println("------------------------------------------------------");
		
		
		Manager ka = new Manager("Klara");
		System.out.println(ka);
		
		Master si = new Master("Sima");
		System.out.println(si);
		
		Master le = new Master("Leila");
		System.out.println(le);
		
		Manager li = new Manager("Luba",
				                Education.BSC,
				                Rank.Director,
				                Specialization.Engines,
				                null
				                );
		
		Worker[] masters_team = new Master[] {si, le};
		li.setMasters(masters_team);
				
		System.out.println(g);
		System.out.println("------------------------------------------------------");

		
		
	}

}
