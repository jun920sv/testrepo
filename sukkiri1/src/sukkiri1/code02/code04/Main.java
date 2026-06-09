package sukkiri1.code02.code04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String prof1 = "名前：朝霞あゆみ\n   (あさかあゆみ)";
		String prof2 = """
				名前:湊雄輔
				　　　(みなとゆうすけ)
				""";//改行を含め　表記したままの文字列情報として解釈
			 // """ ここが左端になる もしくは\s で左端きめる　便利
		System.out.println(prof1);
		System.out.println(prof2);

		String prof3 = """
				a			\sそのまま\n		\s"表示"される
				""";
		System.out.println(prof3);

	}

}
