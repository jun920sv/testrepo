package practice02_print01;

public class Main4 {

	public static void main(String[] args) {
		
		//名前 , 年齢
		String name = "Bob"; int age = 10;
		System.out.println(name + "は、今年" + age + "歳です。");
		age--;
		System.out.println(name + "は、去年" + age + "歳でした。");
		age+=2;
		
		System.out.println(name + "は、来年" + age + "再来年は、"+ (++age) +"です。");
		//　（）は結果に影響を与えない　見やすさ重視 優先度上げで
	}

}
