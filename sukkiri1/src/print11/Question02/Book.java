package print11.Question02;

public class Book extends Product{

	private String author;	//著者
	
	public Book(String name, int price, String author ) {
		super(name, price);
		this.author=author;
	}
    /*
     * コンストラクタ
     * 引数：String name , int price , String author
     * 処理：nameとpriceは親クラスに渡す。
     *       authorは子クラスのフィールドにセットする。
     */

	public void showInfo() {
		super.showInfo();
		System.out.print("著者:"+this.author);
	}
    /*
     * showInfoメソッド
     * 処理：親クラスのメソッドをオーバーライドする。
     * 　　　「商品名：　　価格：　　　著者:　　　　」の形で表示する。
     */

	
}
