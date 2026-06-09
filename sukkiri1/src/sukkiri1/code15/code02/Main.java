package sukkiri1.code15.code02;

public class Main {

	public static void main(String[] args) {
	String s1 = "Java and JavaScript";
	if(s1.contains("Java")) {//その文字を含んでいたら　true  その文字のまとまりを
		System.out.println("文字列s1はJavaを含んでいます");
	}
	String s2 = "Java and JavaScript";
	if(s2.endsWith("Script")) {
		System.out.println("文字列s1はScriptが末尾にあります");
	}
	
	String s3 = "Java and JavaScript";
	if(s3.startsWith("Java")) {
		System.out.println("文字列s1はJavaが先頭にあります");
	}
	System.out.println(s1.indexOf("Java"));//0から最初のJavaが始まっている
	System.out.println(s1.lastIndexOf("Java"));//インデックス9から最後のJavaが始まっている
	System.out.println(s1.lastIndexOf('J'));//キャラクターも対応している　
	System.out.println(s1.lastIndexOf("kava"));//ない場合－1
	
	

	}

}
