package Core;

import jobs.*;
import monster.Monster;

public class User implements Cloneable {
	public String nickname;
	public Job job;
	public int hp;
	public int money;
	public int mana;
	public int exp;
	public int level;

	@Override
	public User clone() throws CloneNotSupportedException {
		return (User) super.clone();
	}


}

