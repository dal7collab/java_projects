package dev;

public class Test {

	public static void main(String[] args) {
		Garage g = new Garage();
		System.out.println(g);
		
		System.out.println("------------------------------------------------------");
		Manager m = new Manager("Moshe");
		System.out.println(m);
		
		Master s = new Master("Sima");
		System.out.println(s);
		
		Master l = new Master("Leila");
		System.out.println(s);
		
		Worker[] team = new Worker[] {m,s};
		g.setTeam(team);
		System.out.println(g);
		System.out.println("------------------------------------------------------");

		
		
	}

}
