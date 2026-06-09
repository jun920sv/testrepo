package sukkiri1.code15.code03;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java Proguraming";
		System.out.println(s1.charAt(3));//三文字目を切り取り　0から数える
		System.out.println(s1.substring(3));// 先頭(3)もじ目のインデックスを0にそれまでを切り取り
		System.out.println(s1.substring(3,8));//3から8まで最後含めない
		System.out.println(s1);//String のメソッドは中身を変えない
	
		System.out.println("Java".toLowerCase());//全部小文字
		System.out.println("Java".toUpperCase());//全部大文字
	
		String s2 = "       java   ";//半角スペースとTab (\t)のみ 全角スペースは残る
		System.out.println(s2.trim());//前後の空白を除去
		System.out.println(s2);
		
		String s3 = "	　　java \n   ";//半角スペースと改行 全角スペースは残る
		System.out.println(s3.trim());//前後の空白を除去
		
		System.out.println(s1.replace("Java","あああ"));//書き換え　
		System.out.println(s1.replace("Java",""));// スペースなら消せる	
	
	
		char[] charArray = s1.toCharArray();
		System.out.println(charArray);//1文字ずつ配列に入れる
		System.out.println(charArray[5]);
		
	
	
	
	}

}
