package sukkiri1.code09;

public class Hero {
	String name;
	int hp;
	Sword sword;

	Hero() {
		this("0");//先頭じゃないとダメ 25からOKだけど
		this.hp=100;
		this.name="ダミー";
		//this("ダミー");
		
		
	}//デフォルトコンストラクタ用

	public Hero(String name) {//コンストラクタ 引数あり
		this.name = name;
		this.hp=100;
		System.out.printf("勇者%sを生み出しました\n", this.name);
	}

	public void attack() {
	}

	public void sleep() {

		this.hp = 100;
		System.out.printf("%sは、眠って回復したHP%d\n", this.name, this.hp += 100);
	}

	public void sit(int sec) {

		this.hp += sec;
		System.out.printf("""
				%sは、%d秒座った!
				HPが%dポイント回復した
				""", this.name, sec, sec);

	}

	public void slip() {
		this.hp -= 5;
		System.out.printf("""
				%sは転んだ!
				5のダメージ!
				""", this.name);

	}

	public void run() {
		System.out.printf("""
				%sは逃げ出した。
				GAMEOVER
				最終HPは%dでした
				""", this.name, hp);

	}

}
