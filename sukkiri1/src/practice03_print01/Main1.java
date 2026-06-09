package practice03_print01;

public class Main1 {

	public static void main(String[] args) {

		int weight = 60;//int型の変数を宣言して、60を代入

		boolean a = (weight == 60);
		System.out.println(a);

		if (weight == 60) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		int age1 = 20;
		int age2 = 30;

		boolean b = ((age1 + age2) * 2 > 60);
		System.out.println(b);

		if ((age1 + age2) * 2 > 60) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		int age =12;
		boolean c = (age%2 ==1);//これだとーが判定できない
		boolean d = (age%2 !=0);//余りが０じゃなかったら奇数
		boolean e = (age%2 ==1 || age %2 == -1);//余り１か　あまりー１
		boolean f = (Math.abs(age % 2)==1 );//これはあまりの絶対値が１の場合
		
		System.out.println(c);
		System.out.println(d);
		
		String name = "湊";
		boolean g =(name.equals("港"));
		boolean h =(("港").equals(name));//逆でも可
		System.out.println(g);
		
		
	}

}
