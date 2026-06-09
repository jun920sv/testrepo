package sukkiri1.code12;


public abstract class Character {
	String name;
	int hp;
	public void run() {
		System.out.println(this.name+"逃げ出した");
	}
	
	public abstract void attack(Matango m);
	//abstractメソッドを持ってるクラスは必ずabstractつける
	//newができなくなくなり継承専用のクラスになる
}
