package sukkiri1.code16.code09;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		var a = 30;//右辺の型をもとに型を決めてくれる　型推論
		var b = "a";
		//型がここで確定しないので不可　メソッドもダメ　右辺がわからないので
//		var c; 
//		var d = null;
		var e = new int[] { 330, 20 };
//		var f = {30,20};

		
		var list = new ArrayList<Integer>();//型が明らかなので
		for(var v :list) {//ダイヤモンド記号を短くしたいと使われることある
			
			
			
		}
	}

}
