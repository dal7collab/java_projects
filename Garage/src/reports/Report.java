package reports;

import services.Job;
import services.Pool;

public class Report {
	private Pool pool;

	public Report(Pool pool) {
		this.pool = pool;
	}
	
	public void print() {
		for (int i = 0; i < 100; i++) {
			Job t = pool.pullJob(i);
			if (t != null)
				System.out.println(t);
		}	
	}
	
	
}
