package sukkiri1.code10;

public class SuperHero extends Hero {
		
		boolean flying;
		
		public SuperHero() {
			//super();//書かなくても自動で挿入される
			super(1);//親クラスが引数ありのコンストラクタだったらこれ
			System.out.println("子クラスのインストラクタ");
		}
		
		/* いらなくなる
		//String name = "ミナト";
		//int hp = 100;
		
		//攻撃
		public void attack(Matango m) {
			System.out.println(this.name + "の攻撃!");
			m.hp -= 5;
			System.out.println("5ポイントのダメージを与えた");
		}
		//逃げる
		public void run() {
			System.out.println(this.name + "は逃げ出した！");
		}*/	
		
		//飛ぶ
		public void fly() {
			this.flying =true;
			System.out.println("飛び上がった！");
		}
		//着地
		public void land() {
			this.flying =false;
			System.out.println("着地した！");
		}
		
		@Override //オーバーライド 子クラスで上書きっぽい動き
		public void run() {
			System.out.println(this.name+"は撤退した");
		}
		
		@Override
		public void attack (Matango m) {
			super.attack(m);//親クラス呼びたいときはsuper
			if(flying) {
				super.attack(m);
			}
		}	
	}

	

