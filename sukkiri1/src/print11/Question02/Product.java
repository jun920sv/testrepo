package print11.Question02;

public class Product {

	protected String name; //商品名
    protected int price;	//価格

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    //商品情報表示
    public void showInfo() {
        System.out.print("商品名:" + name + " 価格:" + price);
    }

	
}
