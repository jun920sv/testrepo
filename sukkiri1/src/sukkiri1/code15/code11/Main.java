package sukkiri1.code15.code11;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date now = new Date();
		//エポックの基準時間から何ミリ秒 1970年から
		//内部はlong型ラッピングして日付型
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1694984000000L);
		System.out.println(past);
		
		past =new Date(Long.MAX_VALUE);//エポックから1970年から64ビット安心
		System.out.println(past);
		
		past.setTime(Integer.MAX_VALUE*1000L);//2038年問題の日付は1970+秒
		System.out.println(past);

	}

}
