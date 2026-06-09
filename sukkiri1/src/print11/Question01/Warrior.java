package print11.Question01;

public class Warrior extends Character{

	//コンストラクタ
	
	public Warrior(String name) {
		super(name);
		
	}
	
	@Override
	public void attack() {
        System.out.println(super.name + "は剣で攻撃した！");
    }

    //メソッドのオーバーライド

}
