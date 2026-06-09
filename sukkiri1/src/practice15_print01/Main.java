package practice15_print01;

public class Main {
public static void main(String[] args) {
	String p1 = ".*";//正規表現　すべて文字列
	String p2 ="A[0-9]{1,2}";//最初１文字目A　２文字目は数字　３文字目は数字なし
	String p3 ="A[0-9]?";
	String p4 ="A[\\d]?";
	
	String p5="U[A-Z]{1,3}";//最初１文字目はU　２～４文字目は英大文字
	
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);
	System.out.println(p4);
	System.out.println(p5);
}
}
