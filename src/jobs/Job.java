package jobs;
import java.util.ArrayList;
import java.util.Random;
public class Job {

	public Random random = new Random();
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
