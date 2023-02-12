package jobs;

public class Tanker extends Job {

	private void skillSet() {

		skill.get(0).name = "단단해지기";
		skill.get(1).name = "포탄 던지기";
		skill.get(2).name = "정의의 주먹";
		skill.get(3).name = "판 뒤엎기";

		skill.get(0).damege = 100;
		skill.get(1).damege = 200;
		skill.get(2).damege = 300;
		skill.get(3).damege = 400;

	}
	
	public Tanker() {
		id = 2;
		Jobname = "탱커";
	}
}
