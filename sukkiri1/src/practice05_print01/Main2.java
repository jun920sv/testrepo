package practice05_print01;

public class Main2 {
	public static void email(String titl,String address,String text) {
		System.out.println("件名:"+titl );
		System.out.println(address+"に以下のメールを送信");
		System.out.println("本文:"+text);
	}
	
	public static void email(String address,String text) {
		email("無タイトル",address,text);	
	}
	
	public static void email(String titl) {
		email("月と老人","無アドレス","無本文");	
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		email("引数３つだとこれ","@abcdefg","こんにちは");
		System.out.println();
		email("@abc","おはよ");
		
		System.out.println();
		
		email("引数１つだと上の月と老人になるよ");
		
	
		
	}

}
