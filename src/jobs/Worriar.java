package jobs;

public class Worriar extends Job {

	private void skillSet() {

		skill1.name = "궁수의 집중";
		skill2.name = "일대 포격";
		skill3.name = "화염궁";
		skill4.name = "최종병기 활";

		skill1.damege = 100;
		skill2.damege = 200;
		skill3.damege = 300;
		skill4.damege = 400;

	}
	public Worriar() {
		id = 3;
		Jobname = "전사";
		hp = 300;
	}
}
