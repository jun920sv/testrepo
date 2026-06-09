package print14.Question06;

import java.util.Comparator;

/*
 * Comparatorインターフェースを実装したクラス
 * Comparator<比較対象クラス>   対象クラス：Person
 */
public class NameComparator implements Comparator<Person>{
	
	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}	
	
	/*
	 * Comparatorインターフェースが持つ抽象メソッドの実装
	 * 比較対象のインスタンスが引数で与えられている。
	 * 戻り値：正の値、０，負の値を返す。
	 */

	
}

	