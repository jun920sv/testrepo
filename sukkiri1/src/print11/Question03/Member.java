package print11.Question03;

public class Member {

	protected String name;	//名前
	//コンストラクタ
    public Member(String name) {
        this.name = name;
    }
    //値段の1割をポイントとして返す。
    public int getPoint(int price) {
        return price / 10;
    }
    //名前の取得　getter
    public String getName() {
        return name;
    }

	
}
