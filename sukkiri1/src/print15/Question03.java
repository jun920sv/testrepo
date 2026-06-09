package print15;

public class Question03 {

	public static void main(String[] args) {
		String s = " Let it go. ";
		//変数sの文字列の前後の空白を取る 
		String s1 = (s.trim());
		//表示 
		System.out.println(s1);

		//変数s1が空かどうか判定する 
		if (s1.isEmpty()) { //isBlank() だと半角含む
			System.out.println("空白です");
		} else {
			//文字列を反転表示する(改行しない)
			for (int i = s1.length() - 1; i >= 0; i--) {
				System.out.print(s1.charAt(i));
			}
			System.out.println();

			StringBuilder reverse = new StringBuilder(s1);//s1アペンドしてる状態からできる
			reverse.reverse();//反転させる　
			System.out.println(reverse);
			System.out.println(s1);

			//変数s1に t の文字が何個含まれているか数えて表示する 

			//tを空文字で置換(tを消す)して長さの差を取るとtの数が数えられる
			System.out.println(s1.length() - s1.replace("t", "").length());

			int count = 0;
			for (char v : s1.toCharArray()) {
				if (v == 't') {
					count++;
				}
			}
			System.out.println(count);

			//変数s1を半角スペースで分割して作られた配列の要素数を表示する
			String[] words = s1.split(" ");//split 区切り文字指定
			System.out.println(words.length);//配列だからlength ()いらない　パラメータだから

			//StringBuilderを用いて、上記配列の要素を連結す
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < words.length; i++) {
				System.out.println(words[i]);
				sb.append(words[i]);
			}
			//StringBuilder型変数の中身を文字列として表示する 
			System.out.println(sb.toString());
			//StringBuilder型変数を反転させてから表示する(メソッドチェーンの形) 
			System.out.println(sb.reverse().toString());

			String str = sb.toString();
			StringBuilder sb2 = new StringBuilder();
			for (int i = str.length() - 1; i >= 0; i--) {
				sb2.append(str.charAt(i));

			}

		}

	}

}
