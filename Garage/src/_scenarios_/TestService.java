package _scenarios_;

import enums.Status;
import reports.Report;
import services.Job;
import services.Pool;

public class TestService {

	public static void main(String[] args) {
		Job j = new Job();
		System.out.println(j);
		
		Pool p = new Pool();
		p.pushJob(j);		
		j.setStatus(Status.Assigned);
		
        System.out.println("===================");		
		Report r = new Report(p);
		r.print();
		

	}

}
