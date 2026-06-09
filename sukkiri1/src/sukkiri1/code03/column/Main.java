package sukkiri1.code03.column;

public class Main {

	public static void main(String[] args) {
		int age =15;
		String s = age >= 18 ? "成人":"未成年";
		System.out.println(s);
		
		char c = 'c';
		int i =0;
		System.out.println(false?i:c);//99がcがintにキャストされてしまう
		System.out.println(true?c:0);// c
		System.out.println(2.0 - 1.1 == 0.9);// 0.1は2進数では循環小数なので誤差が出てfalse
											
	}

}
