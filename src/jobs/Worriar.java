package jobs;

public class Worriar extends Job {

	private void skillSet() {

		skill.get(0).name = "궁수의 집중";
		skill.get(1).name = "일대 포격";
		skill.get(2).name = "화염궁";
		skill.get(3).name = "최종병기 활";

		skill.get(0).damege = 100;
		skill.get(1).damege = 200;
		skill.get(2).damege = 300;
		skill.get(3).damege = 400;

	}
	public Worriar() {
		id = 3;
		Jobname = "전사";
		hp = 300;
	}
}
