package maps;

import monster.Monster;

public class Dungeon {

    Monster monster = new Monster();

    public void gdDungeon() {
        System.out.println("-------------------");
        System.out.println("던전에 입성하였습니다.");
        System.out.println("당신을 던전을 가던 도중," +  + "와 만났습니다.");
        System.out.println("-------------------");
        System.out.println("1. 싸운다");
        System.out.println("2. 도망간다");


    }
    public Dungeon() {
        gdDungeon();
    }
}
