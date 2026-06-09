package sukkiri1.code02.lesson03;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//1行目に書くことが多い
		
		System.out.println("ようこそ占いの館へ");

		System.out.print("あなたの名前を入力してください＞");
		String name = scanner.next();//next は空欄　受け付けられない
		

		System.out.print("あなたの年齢を入力してください＞");
		String ageString = scanner.next();
		int age = Integer.parseInt(ageString);

		Random random = new Random();
		int fortune = random.nextInt(4);
		++fortune;

		System.out.println("占い結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、"
				+ "あなたの運気番号は" + fortune + "です");
		IO.println("(1:大吉 2:中吉 3:吉 4:凶)");

		scanner.close();//しっかりおかたずけ　波線消える
	}

}
