package sukkiri1.code14.code08;

import static java.lang.Math.*;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Hero h1 = new Hero();
	Hero h2 = new Hero();
	Hero.money =100;
	System.out.println(h1.hp);
	System.out.println(Hero.money);
	System.out.println(h1.money);
	h1.money =300;
	System.out.println(Hero.money);
	System.out.println(h2.money);
	
	Scanner sc;
	Math.max(100, 20);
	max(100,20);
	
	h1.command(Hero.ATTCK);
	h1.command(Hero.RUN);
}
}

class Hero {
	String name;
	int hp;
	static int money;
	static final int ATTCK =0;
	static final int RUN =1;
	
	
	public static void setRandomMoney() {
		Hero.money=(int)Math.random()*1000;
//		System.out.println(this.name);staticないだからthisは呼べない
	}//static 内は staticからしか見れない

	void command(int command) {
		this.money =100;//static ないからまだ使える
		switch(command) {
		case ATTCK->{
			System.out.println("攻撃した");
	}
		case RUN->{
			System.out.println("逃げ出した");	
		}
		default ->{
			System.out.println("踊った");
		}
		}

	}
	
	
}
