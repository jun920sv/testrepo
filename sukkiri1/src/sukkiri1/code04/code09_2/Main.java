package sukkiri1.code04.code09_2;

public class Main {
	public static void main(String[] args) {
		int [] scores = {20,30,40,50,80};
		for(int value :scores) {//拡張for文
			value++; //scores には影響なし
			System.out.println(value);//ここのvalueは読み込み専用
		}
		for(int value :scores) {//拡張for文
			System.out.println(value);
		}

	}

}
