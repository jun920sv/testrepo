package practice11_print01;

public class Computer {
	

	String name;
	int price;
	String color;
	String makerName;
	
	public Computer(String name,int price,String color,String makerName ) {
		this.name=name;
		this.price=price;
		this.color=color;
		this.makerName=makerName;
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
	public String getmakerName() {
		return this.makerName;
	}
	
}

