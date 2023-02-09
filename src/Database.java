import java.util.ArrayList;

import jobs.*;

public class Database {
	
	ArrayList<Job> job = new ArrayList<Job>();
	
	Wizzard wizzard = new Wizzard();
	Tanker tanker = new Tanker();
	Worriar worriar = new Worriar();
	Archer archer = new Archer();
	private void addJob() {
		job.add(wizzard);
		job.add(tanker);
		job.add(worriar);
		job.add(archer);
	}
	
	public Database() {
		addJob();
	}
	
	public Job findJob(int id) {
		for(Job i: job) {
			if(i.id == id) {
				return i;
			} 
		}
		return null;
	}
}



