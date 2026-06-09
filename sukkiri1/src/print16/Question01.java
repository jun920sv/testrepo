package print16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Question01 {
	public static void main(String[] args) {
		//ArrayList<Integer>の宣言 変数名：ilist 
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//ilistの0番目：30 1番目：20 2番目:10 を、追加する 
		list.add(30);
		list.add(20);
		list.add(10);
		
		//ilistの要素数を表示 
		System.out.println("ilistの要素数：" + list.size() ); 
		
		//ilistを通常for文使って全て表示 
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//ilistの要素の中から、20のものを削除してください。 
		//list.remove(1);
		Integer integer =20;
		list.remove(integer);
		
		//ilistをソートする 
		Collections.sort(list);
		//list.sort(null); //ソート用のコンパレータを特に指定しない。自然順序
		//具体的に指定する
		list.sort(Comparator.naturalOrder());//昇順
		//list.sort(Comparator.reverseOrder());//降順
		//list.sort(Integer::compare);
		
		
		
		//ilistを拡張for文使って全て表示
		for(Integer a: list) {
			System.out.println(a);
		}
		
	}

}
