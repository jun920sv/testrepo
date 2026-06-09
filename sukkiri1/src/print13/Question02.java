package print13;

import java.util.ArrayList;

public class Question02 {

	public static void main(String[] args) {
		String input = " 12345 ";//判定する文字列
		
		ArrayList<Validator> list = new ArrayList<Validator>();
		LengthValidator va = new LengthValidator(5);
		list.add(va);
		NumberValidator nv = new NumberValidator();
		list.add(nv);
		
		for(Validator v : list) {
		    boolean result = v.validate(input);

		    if(!result) {
		        System.out.println("NGで停止");
		        break;
		    }
		
		}
	
/*
 * チェックするクラスのインスタンスをArrayListに格納する。
 * 要素１：文字列の長さをチェックするインスタンス。判定基準は5文字
 * 要素２：文字列が全て数字で構成されているかチェックするインスタンス
 */
		  /*
         * 拡張for文を使って順番に判定する。
         * もしfalseの場合は「NGで停止」を表示し、ループをぬける。
         */
       
    }


		
}
