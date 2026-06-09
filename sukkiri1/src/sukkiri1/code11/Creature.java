package sukkiri1.code11;

public interface Creature {
	public static final String name = "名前";
	String name1 ="名前";//public static finalが省略されている
	
	//インターフェースは フィールドを持てない
	//ただしfinal は許される 必ず初期化する 変数禁止　定数〇
	
	public  void run();//抽象クラスは本文を書けない ×｛ }
	//インターフェースはpublic abstract に自動でなる
	
	public default void run1() {
		//defaultなら本文書ける
		
	}
	
	public static void run2() {
		//インターフェースでも staticメソッドはOK
		//staticは「クラスに属する」メソッドだから]
		
	}
	
}

