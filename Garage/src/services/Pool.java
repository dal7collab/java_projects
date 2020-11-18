package services;

public class Pool {
	private Job[] pool;
	private static int i = 0;
	
	public Pool() {
		this.pool = new Job[100];
	}
	
	public Job pullJob(int jobId) {
		for (Job job : pool) {
			if (job != null)
				if (job.getJobId() == jobId)
					return job;
		}
		return null;
	}
	
	public void pushJob(Job job) {
		for (Job j : pool) {
			if (j == null) 
				pool[i] = job;
				i++;
			return;
		}		
	}
					
}
