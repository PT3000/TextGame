package maps;
import Core.Database;
import Core.User;
import monster.Monster;
import java.util.Scanner;
public class Dungeon   {
    public void goDungeon() {

        Scanner scan = new Scanner(System.in);
        Monster monster = Database.getInstance().findMonster(1);

        System.out.println("-------------------");
        System.out.println("던전에 입성하였습니다.");
        System.out.println("당신을 던전을 가던 도중," + monster.name + "와 만났습니다.");
        System.out.println(monster.name + "의 체력: " + monster.hp);
        System.out.println(monster.name + "의 공격력: " + monster.damege);
        System.out.println("어떻게 하시겠습니까?");
        System.out.println("-------------------");
        System.out.println("1. 싸운다");
        System.out.println("2. 도망간다");
        System.out.println(("3. 던전에서 나간다"));
        int a = scan.nextInt();
        if (a == 1) {
            try {
                fightMonster();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        } else if (a == 2) {
            goDungeon();
        } else if (a == 3) {
            Mapmaneger.getInstance().whenGo();
        }
    }
    private void fightMonster() throws CloneNotSupportedException {
        User user = Database.getInstance().findUser();
        Monster monster = Database.getInstance().findMonster(1);
        Monster copyMonster = monster.clone();
        User copyUser = user.clone();
        while (true) {
            int random = (int)(Math.random()*4);
            int select = (int)(Math.random() * 3) + 1;
            switch (select) {
                case 1:  System.out.println(copyUser.job.Jobname + "가 " + copyUser.job.skill.get(random).name + "을 사용하여 좀비에게 피해" + copyUser.job.skill.get(random).damege + "을 입혔습니다.");
                    System.out.println("-------------------");
                    copyMonster.hp -= copyUser.job.skill.get(random).damege;
                    System.out.println("좀비의 체력:" + copyMonster.hp);
                    System.out.println(copyUser.job.Jobname + "의 체력:" + copyUser.hp);
                    System.out.println("-------------------");
                    try {
                        Thread.sleep(1000); //1초 대기
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2: System.out.println(copyMonster.name + "가 피해 " + copyMonster.damege + "를 " + copyUser.job.Jobname + "에게 입혔습니다.");
                    System.out.println("-------------------");
                    copyUser.hp -= copyMonster.damege;
                    System.out.println("좀비의 체력:" + copyMonster.hp);
                    System.out.println("궁수의 체력:" + copyUser.hp);
                    System.out.println("-------------------");
                    try {
                        Thread.sleep(1000); //1초 대기
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
            }

            if (copyMonster.hp <= 0) {
                System.out.println("게임에서 승리했습니다.");
                System.out.println("경험치: " + monster.death_exp + "exp 와 골드: " + monster.death_gold +"point 를 얻었습니다");
                System.out.println("-------------------");
                copyUser.money += monster.death_gold;
                copyUser.exp += monster.death_exp;
                System.out.println(copyUser.nickname + "님의 골드: " + copyUser.money);
                System.out.println(copyUser.nickname + "님의 exp: " + copyUser.exp );
                Mapmaneger.getInstance().whenGo();
                break;
            } else if (copyUser.hp <= 0) {
                System.out.println("게임에서 패배했습니다.");
                Mapmaneger.getInstance().whenGo();
                break;
            }
        }
    }
}
