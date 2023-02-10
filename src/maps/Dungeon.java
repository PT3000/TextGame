package maps;

import Core.Database;
import monster.Monster;

import java.util.Map;
import java.util.Scanner;

public class Dungeon {
    public void goDungeon() {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("던전에 입성하였습니다.");
        Monster monster = Database.getInstance().findMonster(1);
        System.out.println("당신을 던전을 가던 도중," + monster.name + "와 만났습니다.");
        System.out.println(monster.name + "의 체력: " + monster.hp);
        System.out.println(monster.name + "의 공격력: " + monster.damege);
        System.out.println("어떻게 하시겠습니까?");
        System.out.println("-------------------");
        System.out.println("1. 싸운다");
        System.out.println("2. 도망간다");
        System.out.println(("3. 던전에서 나간다"));
        int a = scan.nextInt();
        if(a == 1) {
            fightMonster();
        } else if(a == 2) {
            goDungeon();
        } else if(a == 3) {
            Mapmaneger.getInstance().whenGo();
        }
    }

    private void fightMonster() {

    }
}
