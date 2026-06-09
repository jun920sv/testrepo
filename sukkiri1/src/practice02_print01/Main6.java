package practice02_print01;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		
		// Scanner の宣言
		Scanner sc = new Scanner(System.in);
		
		// ① 預金額を入力
		System.out.print("預金額を入力してください（円）：");
		String a = sc.next();
		int principal =Integer.parseInt(a);	
		
		// ② 預ける年数を入力
		System.out.print("預ける年数を入力してください（年）：");
		String yearsString = sc.next();
		int years = Integer.parseInt(yearsString);
			
		// ③ 定期預金金利を入力
		System.out.println("定期預金金利は 1.2%です");
		double fixedRate = 0.012;
		
		// ④ 普通預金金利を入力
		System.out.println("普通預金金利は 0.5%です");
		double savingRate = 0.005;
		// ⑤ 預ける年数後の残高を計算（複利）
		//（複利の計算式）将来の金額=元金×(1 + r)n 乗
		//r : 金利 n : 年数。 ※Math を使って累乗計算をする
		
		
		double fixedBalance =principal * Math.pow(1 + fixedRate, years);
		double savingBalance =principal * Math.pow(1 + savingRate, years);
		// 結果表示  //round(四捨五入)
		System.out.println("定期預金の残高：" + Math.round(fixedBalance) + " 円");
		System.out.println("普通預金の残高：" + Math.round(savingBalance) + " 円");
		// ⑥ Math クラスを使って大きい方を表示
		double maxBalance = Math.max(fixedBalance, savingBalance);
		System.out.println("より多い残高：" + (int)maxBalance+ " 円");
		// ⑦ Math クラスを使って小さい方を表示
		double minBalance =Math.min(fixedBalance, savingBalance);
		System.out.println("より少ない残高：" + (int)minBalance+ " 円");
		sc.close();
	}

}

