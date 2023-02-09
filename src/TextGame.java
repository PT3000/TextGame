import maps.*;

import java.util.*;
public class TextGame {
    public static void main(String[] args) {

        Database database = new Database();
        User user = new User();
        Dungeon dungeon = new Dungeon();
        Scanner start = new Scanner(System.in);

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
        int a = start.nextInt();
        user.job = database.findJob(a);
        System.out.println("-------------------");
        System.out.println("직업 "  + user.job.Jobname + "를(을) 선택하셨습니다.");
        System.out.println("-------------------");
        System.out.println("이제부터 게임을 시작하겠습니다.");
        System.out.println("-------------------");

        System.out.println("가고 싶은 곳을 선택하세요.");
        System.out.println("-------------------");
        System.out.println("1. 상점");
        System.out.println("2. 던전");
        System.out.println("3. 도박장");
        System.out.println("4. 나가기");

        int start3 = start.nextInt();

        if(start3 == 1) {
            System.out.println("상점으로 이동");
        } else if(start3 == 2) {
            dungeon.gdDungeon();
        } else if(start3 == 3) {
            System.out.println("도박장으로 이동");
        }  else if(start3 == 4) {
            System.out.println("나가기");
        }

        start.close();
    }

}