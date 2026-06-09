package print15;

public class Question01 {

	public static void main(String[] args) {
		String str = "Hello World"; 
		System.out.println(str.length()); //strの文字数を出力 
		System.out.println("先頭の文字：" + str.charAt(0)); //strの先頭の文字を出力 
		System.out.println("最後の文字：" +str.charAt(str.length()-1) );//strの最後の文字を出力 
		System.out.println("大文字：" +str.toUpperCase());  //strの文字列を全て大文字にして出力 
		System.out.println("小文字：" +str.toLowerCase() ); //strの文字列を全て小文字にして出力 
		System.out.println(str.substring(0, 5));  //strの文字列からHelloだけ表示 
		System.out.println(str.substring(6)); //strの文字列からWorldだけ表示
		System.out.println(str.replaceAll("World","Java")); //strの文字列にあるWorldをJavaに置換して表示 
		}
}
