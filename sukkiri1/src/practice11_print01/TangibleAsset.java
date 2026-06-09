package practice11_print01;

public abstract class TangibleAsset extends Asset {
	
	String name;
	int price;
	String color;
	double weight;
	
	//コンストラクタ
	public TangibleAsset(String name,int price,String color) {
		this.name=name;
		this.price=price;
		this.color=color;
		
	}
	
	//メソッド
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public String getColor() {
		return this.color;
	}
	public double getWeight() {
		return weight;
	}
	public void  setWeight (double weight) {
		return;
	}
	
}
	
	
