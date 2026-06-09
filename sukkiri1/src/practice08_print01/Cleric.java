package practice08_print01;

import java.util.Random;

public class Cleric {
	String name;
	final int maxHp = 1500;
	int hp =50;
	final int maxMp=10;
	int mp=10;
	
	public Cleric() {//コンストラクタ
		this.name = "クレ";
		System.out.printf("勇者%sを生み出しました"
				+ "\nhp:%d mp:%d\n",this.name,this.hp,this.mp);
	}
	
	public void selfAid() {
		if(this.mp>=5) {
		this.mp-=5;
		this.hp+=50;
		}
		if(hp>maxHp) {
			hp=maxHp;
		}
		System.out.printf("%sはホイミした\n%sはHPを回復した"
				+ "\nhp:%d mp:%d\n",this.name,this.name,this.hp,this.mp);
	}
	
	
	public int pray(int s) {
		Random rand = new Random();
		
		int total=0;
		for (int i = 0; i < s; i++) {
            int r = rand.nextInt(3); // 毎秒ランダム
            total += r;
        }
        this.mp += total;
        int inori =total;
        
		if(mp>maxMp) {
			mp=maxMp;
		}
        //inori = Math.min(this.maxMp-this.mp,inori);
        int difference =this.maxMp-this.mp;
        if(inori > difference ) {
        	inori=difference;
        	this.mp=this.maxMp;
        }else {
        	this.mp+=inori;
        }
		
		System.out.printf("%sは%d秒祈りを捧げた\n%sはMPを%d回復した\n",this.name,s,this.name,inori);
		return mp;
		
	}
	
	
	
}
