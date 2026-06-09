package dokkai15;

public class Main2{
	public static void main(String[] args) {
		String s = "AbCde";
		s.toLowerCase();
	
		System.out.println(s);//不変（immutable）」。
		//つまり 中身を変更できないクラス。
		//そのため"AbCde"
		
		String a = s.toLowerCase();
		System.out.println(a);
		//	変えるには直接表示の下か上の代入　
	
		System.out.println(s.toUpperCase());//ABCDE
	}
}
