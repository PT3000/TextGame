package jobs;

public class Tanker extends Job {

	private void skillSet() {

		skill1.name = "단단해지기";
		skill2.name = "포탄 던지기";
		skill3.name = "정의의 주먹";
		skill4.name = "판 뒤엎기";

		skill1.damege = 100;
		skill2.damege = 200;
		skill3.damege = 300;
		skill4.damege = 400;

	}
	
	public Tanker() {
		id = 2;
		Jobname = "탱커";
	}
}
