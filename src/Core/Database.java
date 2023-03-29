package Core;
import java.util.ArrayList;
import jobs.*;
import monster.*;
public class Database {
	private static Database instance = new Database();
	ArrayList<Job> job = new ArrayList<Job>();
	ArrayList<Monster> monster = new ArrayList<Monster>();
	User user = new User();
	public User findUser() {
		return user;
	}
	private void addJob() {
		job.add(new Wizzard());
		job.add(new Tanker());
		job.add(new Worriar());
		job.add(new Archer());
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

	private void addMonster() {
		monster.add(new Zombie());
		monster.add(new Frankenstein());
	}

	public Monster findMonster(int id) {
		for (Monster i : monster) {
			if (i.id == id) {
				return i;
			}
		}
		return null;
	}
}





