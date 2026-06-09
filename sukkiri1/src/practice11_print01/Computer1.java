package practice11_print01;

public class Computer1 extends TangibleAsset {
	String makerName;

	//追加分だけ
	public Computer1(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName=makerName;
		
	}
	
	public String makerName() {
		return this.makerName;
	}

}
