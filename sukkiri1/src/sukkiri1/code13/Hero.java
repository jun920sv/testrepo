package sukkiri1.code13;

public class Hero {

	private int hp;
	private String name;
	private boolean fly;
	private Sword sword;
	

	void sleep() {
		this.hp = 100;
		System.out.println(this.getName() + "は眠って回復した");

	}
	/*
		public int getHp() {
			return hp;
		}
		
		public void setHp(int hp) {
			this.hp = hp;
		}
		*/

	private void due() {
		System.out.println(this.getName() + "は死んでしまった");
		System.out.println("GAME OVER");
	}

	public void bye() {

	}

	public void attack() {

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断");
		}
		
		this.name = name;
	}

	public boolean isFly() { //真偽値型だけisFlyになる
		return this.fly;

	}

	public int getHp() {
		return 100;
	}

	public void setHp(int i) {

	}
	

}


class Sword{
	private String name;
	
	public String getSword() {
		return this.name;
		
	}
	
	public void setSword() {
		
	}
	
	
	
	
}
