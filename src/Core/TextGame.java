package Core;

import maps.*;

import java.util.*;
public class TextGame {
    public int a;
    public static void main(String[] args) {

        User user = Database.getInstance().findUser();
        Dungeon dungeon = new Dungeon();
        Gamble gamble = new Gamble();
        Shop shop = new Shop();
        Scanner start = new Scanner(System.in);
        GameManeger gameManeger = new GameManeger();

        System.out.println("-------------------");
        System.out.println("    텍스트 기반게임");
        System.out.println("-------------------");
        System.out.println("이름을 입력하세요: ");
        System.out.println("-------------------");
        user.nickname = start.nextLine();
        System.out.println("-------------------");
        System.out.println(user.nickname + "님 안녕하세요");
        System.out.println("지금부터 게임을 시작하겠습니다.");
        System.out.println("아래의 4개의 직업 중 하나를 선택해주세요.");
        System.out.println("1. 법사");
        System.out.println("2. 탱커");
        System.out.println("3. 전사");
        System.out.println("4. 궁수");
        System.out.println("직업을 선택해 주세요.");
        System.out.println("-------------------");
        user.job = Database.getInstance().findJob(start.nextInt());
        System.out.println("-------------------");
        System.out.println("직업 "  + user.job.Jobname + "를(을) 선택하셨습니다.");
        user.hp = user.job.hp;
        System.out.println("-------------------");
        System.out.println("이제부터 게임을 시작하겠습니다.");
        System.out.println("-------------------");
        Mapmaneger.getInstance().whenGo();
    }

}