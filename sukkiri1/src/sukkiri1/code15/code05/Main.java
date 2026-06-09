package sukkiri1.code15.code05;

public class Main {


	public static boolean isValidPalyerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
		//g[A-Z][A-Z0-9]{7}先頭は小文字のgでないといけない
		//."[A-Z][A-Z0-9]{7}
		//j"[A-Z][A-Z0-9]{7}
		//j*"[A-Z][A-Z0-9]{7}最初jであれば何文字続いてもいい
		//.* なんでもいい文字が0文字以上続く
		//[A-Z] 最初の文字はAーZ
		//[A-Z0-9] 次の文字はAーZ０ー９ ならOK
		//{7}7 回続きます
		//{7,}7文字以上
		//{7,10} 7文字以上10文字以下
		//[ABC][A-Z][A-Z0-9]{7}//先頭ABCならOK
		//[\\d][ABC][A-Z][A-Z0-9]{7}//\ を出力したかったら2回しなければいけない
		//[\n]エスケープシーケンスだから合体しちゃうから\\
	}
	
	
	public static void main(String[] args) {
		System.out.println("\\100");
		System.out.println("\\".matches("\\\\"));//"\\"をだすには\\ 1つ\\ ２つで
		
		
		
		
		
		
		
		

	}

}
