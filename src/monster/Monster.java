package monster;

public class Monster implements Cloneable {
    public String name;
    public int id;
    public int damege; //공격률(랜덤으로 할 예정, 스테이지가 올라갈 때마다, 약 3%씩 공격률 증가)
    public int hp; //스테이지가 올라갈 때마다, 3%씩 증가
    public int death_exp;
    public int death_gold;
    public int evasion; //회피율(랜덤으로 할 예정)

    @Override
    public Monster clone() throws CloneNotSupportedException {
        return (Monster) super.clone();
    }


}

