import java.util.ArrayList;

import jobs.*;
import monster.Monster;
import monster.Zombie;


public class Database {

	private static Database instance = new Database();
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

	private Database() {
		addJob();
		addMonster();
	}

	public static Database getInstance() {
		return instance;
	}

	public Job findJob(int id) {
		for(Job i: job) {
			if(i.id == id) {
				return i;
			}
		}
		return null;
	}
	ArrayList<Monster> monster = new ArrayList<Monster>();
	Zombie zombie = new Zombie();

	private void addMonster() {
		monster.add(zombie);
	}


}



