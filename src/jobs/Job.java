package jobs;

import Core.Database;
import Core.User;

import java.util.ArrayList;

public class Job {

	public String job;
	public int id;
	public String Jobname;
	public int hp;

	public ArrayList<Skill> skill = new ArrayList<Skill>();

	private void setSkill() {
		skill.add(new Skill());
		skill.add(new Skill());
		skill.add(new Skill());
		skill.add(new Skill());
	}

	public Job() {
		setSkill();
	}



}
