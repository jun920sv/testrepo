package sukkiri1.code11;

public interface Human extends Creature{
	default void talk() {
		System.out.println("話す");
	}
	//オーバーライドされなかったらこれになるdefault
	//super.talk は 親クラスが持ってるわけじゃないからコンパイルエラー
	void watch();
	void hear();
}
