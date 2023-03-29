package jobs;

public class Worriar extends Job {
	int damege1 = (random.nextInt(100)+50);
	int damege2 = (random.nextInt(200)+100);
	int damege3 = (random.nextInt(300)+200);
	int damege4 = (random.nextInt(400)+300);
	private void skillSet() {

		skill.get(0).name = "검의 집중";
		skill.get(1).name = "전사의 칼날";
		skill.get(2).name = "최후의 일격";
		skill.get(3).name = "심판의 날";

		skill.get(0).damege = damege1; //50 ~ 100
		skill.get(1).damege = damege2; //100 ~ 200
		skill.get(2).damege = damege3; //200 ~ 300
		skill.get(3).damege = damege4; // 300 ~ 400

	}
	public Worriar() {
		id = 3;
		Jobname = "전사";
		hp = 300;
		skillSet();
	}
}
