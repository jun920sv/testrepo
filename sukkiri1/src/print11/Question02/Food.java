package print11.Question02;

public class Food extends Product{

	 private int expireDay;	//賞味期限
	 
	 public Food(String name, int price,int expireDay) {
			super(name, price);
			this.expireDay=expireDay;
			
		}
	    /*
	     * コンストラクタ
	     * 引数：String name , int price , int expireDay
	     * 処理：nameとpriceは親クラスに渡す。
	     *       expireDayは子クラスのフィールドにセットする。
	     */
	    
	 @Override
	    public void showInfo() {
	        super.showInfo();
	        System.out.println(" 賞味期限:" + expireDay + "日");
	    }
	 
	    /*
	     * showInfoメソッド
	     * 処理：親クラスのメソッドをオーバーライドする。
	     * 　　　「商品名：　　価格：　　　賞味期限：　　　　日」の形で表示する。
	     */
	   

	
}
