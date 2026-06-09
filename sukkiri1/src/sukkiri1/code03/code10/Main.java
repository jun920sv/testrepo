package sukkiri1.code03.code10;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {// 完了回数
			System.out.println("現在" + (i + 1) + "週目->");
		}
		//System.out.println(i);このiはスコープ範囲外
		//ブロック外なので　また使うとき便利だよ↓↓
		
		for (int i = 1; i < 3;i++) {//　現在の周回回数
			System.out.println("現在" + i  + "週目->");
		
		//	for (int i = 0; i < 3; i++) { 同じスコープ範囲なのでiは使えない
		//		System.out.println("現在" + (i + 1) + "週目->");
		
		}
		for(;;) { //無限ループ 5555555555
	//		System.out.println(a);
		}
		/*for (int i = 0; i < 10;) {//　現在の周回回数
			System.out.println("現在" + i  + "週目->");
		}
		*/
	}

}
