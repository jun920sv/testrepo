package print15;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		
		System.out.print("郵便番号を入力してください（例: 123-4567）：");
		String zip = sc.nextLine(); 
		
		System.out.print("携帯電話番号を入力してください（例: 090-1234-5678）："); 
		String phone = sc.nextLine(); 
		
		
		// 郵便番号チェック 
		if (isZipRegex(zip) ) { //メソッド引数は上の入力phone
		System.out.println("郵便番号は正しい形式です。");
		} else { 
			System.out.println("郵便番号の形式が間違っています。");
			} 
		
		// 電話番号チェック 
		if (isPhoneRegex(phone)) {
			System.out.println("携帯電話番号は正しい形式です。");
			} else { 
				System.out.println("携帯電話番号の形式が間違っています。"); 
				} 
		sc.close();
		}

	
	/* 
	 * * メソッド名：isZipRegex 
	 * * 引数：String型 
	 * * 戻り値：boolean型 
	 * * 処理：郵便番号(xxx-xxxx)の形式かどうか判定する 
	 * */

	public static boolean isZipRegex(String zip) { 
		
		// 郵便番号の正規表現を定義 
		
	//	String zipRegex = "\\d{3}-\\d{4}";
		String zipRegex = "[0-9]{3}-[0-9]{4}";//0～９文字の中から３文字
		return zip.matches(zipRegex);		
	}

	/* * メソッド名：isPhoneRegex 
	 * * 引数：String型
	* 戻り値：boolean型 
	* * 処理：携帯電話番号（xxx-xxxx-xxxx)の形式かどうか判定する 
	* */

	public static boolean isPhoneRegex(String phone) { 
		
		//携帯電話番号の正規表現を定義 
		
		//String phoneRegex = "0[089]0-\\d{4}-\\d{4}";
		String phoneRegex = "[\\d]{3}-[\\d]{4}-[\\d]{4}";
				return phone.matches(phoneRegex);

}
}
