package jobs;
import java.util.Random;
public class Tanker extends Job {

	int damege1 = (random.nextInt(100)+50);
	int damege2 = (random.nextInt(200)+100);
	int damege3 = (random.nextInt(300)+200);
	int damege4 = (random.nextInt(400)+300);
	private void skillSet() {

		skill.get(0).name = "단단해지기";
		skill.get(1).name = "포탄 던지기";
		skill.get(2).name = "정의의 주먹";
		skill.get(3).name = "판 뒤엎기";

		skill.get(0).damege = damege1;
		skill.get(1).damege = damege2;
		skill.get(2).damege = damege3;
		skill.get(3).damege = damege4;

	}
	public Tanker() {
		id = 2;
		Jobname = "탱커";
		hp = 1000;
		skillSet();
	}
}
