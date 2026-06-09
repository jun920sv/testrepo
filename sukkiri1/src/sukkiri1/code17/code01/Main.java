package sukkiri1.code17.code01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileWriter fw = null;//後で代入しないでfw.closeするとNullPointerException気を付ける
		try {
			fw = new FileWriter("data.txt");//trycatchの中で書かないとエラー
			fw.write("hello");
			FileReader fr = new FileReader("data");//ファイルが見つからないからIOExceptione
			System.out.println("ok");

		} catch (IOException | NullPointerException e) { //例外が
			System.out.println("エラーが発生しました");
			System.out.println(e.getMessage());

		} catch (Exception _) {//変数を作りません だから_.getはコンパイルエラー
			System.out.println("nullでした");

		} finally {//必ず実行 される
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
