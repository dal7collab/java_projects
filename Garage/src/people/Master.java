package people;

import enums.Education;
import enums.Rank;
import enums.Level;
import enums.Specialization;

public class Master extends Worker {
	private Level   electricalSkils;	
	private Level   programmingSkils;
	
	public Master(String name,
			Education edct, 
			Rank rank, 
			Specialization spec,
			Level electricalSkils,
			Level programmingSkils) {
		super(name, edct, rank, spec);
		this.electricalSkils  = electricalSkils;
		this.programmingSkils = programmingSkils;
	}
	
	public Master(String name) {
		super(name);
		this.electricalSkils  = Level.None;
		this.programmingSkils = Level.None;
	}

	@Override
	public String toString() {
		return String.format(
				"Master [electricalSkils=%s, programmingSkils=%s, name=%s, edct=%s, rank=%s, spec=%s, managerName=%s]",
				electricalSkils, programmingSkils, name, edct, rank, spec, managerName);
	}

}
