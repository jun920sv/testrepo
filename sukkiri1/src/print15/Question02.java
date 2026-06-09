package print15;

import java.util.Scanner;

public class Question02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String strA = "Hello"; 
		//キーボードから文字列を入力 
		System.out.print("入力："); 
		String strB = sc.nextLine();
		//strAとstrBを比較 
				if(strA.equals(strB)) { 
					System.out.println("strAとstrBは等しいです"); 
				}else { 
					System.out.println("strAとstrBは等しくないです");
				} 
				String strC = "Hello Java Programming"; 
				//strCの中にJavaの文字列が含まれているか調べる 
				if(strC.contains("Java")) { 
					System.out.println("strCの中に文字列Javaはあります"); 
				}else { 
					System.out.println("strCの中に文字列Javaはないです"); 
				} 
				//strCを縦表示してください 
				for(int i=0; i<strC.length();i++) { 
					System.out.println(strC.charAt(i)); //charAt１文字抜き出す
				}
				for(char v: strC.toCharArray()) {
					System.out.println(v);
				}
				sc.close();
				
	}
}
