package sukkiri1.code12;

public class Main2 {

	public static void main(String[] args) {
		Wizard w = new Wizard();
		Character c =w;
		Matango m = new Matango();
	
		c.name="asaka";
		c.attack(m);
		//c.fireball(m); 型がCharacterだから
		//コンパイルエラーCharacterにファイーボールのメソッドがないため
		//最初に型見る　メソッドは右見る
		
		//Wizard w2 =c; 親の型から子の型にできない　キャラクターからウィザード×
		
		Wizard w2 =(Wizard) c;//実行の方は実行時確認
		
		if(c instanceof Wizard w3 ) {//instanceof 代入可能ならtrue返る
			w3.fireball(m);
		}
		if(c instanceof Wizard ) {//上と一緒でキャストできるかチェックしてる
			Wizard w3 =(Wizard)c;
			w3.fireball(m);
		}
		
		
		switch(c) {
		case Wizard w3 ->{
			w3.fireball(m);
		}
		case Hero h->{
			
		}
		
		default ->{
			System.out.println("火の玉を打てない");
		}
			
		
		}
	}

}
