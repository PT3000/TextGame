package maps;

import Core.Database;

import java.util.Scanner;

public class Mapmaneger {

    private static Mapmaneger instance = new Mapmaneger();
    public Dungeon dungeon = new Dungeon();
    public Gamble gamble = new Gamble();
    public Shop shop = new Shop();
    public Mine mine = new Mine();

    public void whenGo() {
        Scanner start = new Scanner(System.in);
        System.out.println("가고 싶은 곳을 선택하세요.");
        System.out.println("-------------------");
        System.out.println("1. 상점");
        System.out.println("2. 던전");
        System.out.println("3. 도박장");
        System.out.println("4. 광산");
        System.out.println("5. 나가기");
        int start3 = start.nextInt();

        if (start3 == 1) {
            shop.goShop();
        } else if (start3 == 2) {
            dungeon.goDungeon();
        } else if (start3 == 3) {
            gamble.goGamble();
        } else if (start3 == 4) {
            mine.goMine();
        } else if (start3 == 5) {
            System.out.println("게임을 종료합니다.");
        }

    }
    public static Mapmaneger getInstance() {
        return instance;
    }
}

