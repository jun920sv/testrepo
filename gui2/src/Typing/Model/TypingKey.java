package Typing.Model;

import java.awt.CardLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class TypingKey extends KeyAdapter {

	// =====================================
	// MON1
	// =====================================

	private final String[][] MON1_WORDS = {
			{ "this", "自分自身のインスタンスを指すキーワードは？" },
			{ "null", "参照型変数の中身が「空っぽ」であることを示す言葉は？" },
			{ "enum", "列挙型を定義するキーワードは？" },
			{ "try", "例外が発生しそうな処理を囲むブロックの名前は？" },
			{ "if", "条件によって処理を分ける時に使う構文は？" },
			{ "int", "整数を扱う代表的なデータ型は？" },
			{ "for", "決まった回数だけ繰り返す時に使う構文は？" },
			{ "new", "クラスの設計図から実体を作ることを何という？" },
			{ "catch", "エラーを捕まえた後の処理を書く構文は？" },
			{ "break", "ループを途中で抜ける時に使う命令は？" }, };

	// =====================================
	// MON2
	// =====================================

	private final String[][] MON2_WORDS = {

			{ "length", "配列の要素数を数えるとき、変数名の後ろにつけるのは？" },
			{ "thread", "同時並行で処理を行う仕組みは？" },
			{ "arrow", "ラムダ式で使われる記号(->)の名称は？" },
			{ "else", "条件が一致しない場合の「さもなくば」を表す単語は？" },
			{ "void", "メソッド内で値を返さない時に使う型は？" },
			{ "long", "長整数" },
			{ "byte", "バイト" },
			{ "case", "場合" },
			{ "throw", "エラーを意図的に発生させる命令は？" },
			{ "super", "親クラスのコンストラクタを呼び出すのは？" }, };

	// =====================================
	// MON3
	// =====================================

	private final String[][] MON3_WORDS = {

			{ "final", "定数を定義する時に使う修飾子は？" },
			{ "class", "データの入れ物（設計図）を定義する単位は？" },
			{ "static", "インスタンスを作らずに使える修飾子は？" },
			{ "public", "どこからでもアクセスできることを示す修飾子は？" },
			{ "import", "パッケージを取り込む時に使う命令は？" },
			{ "return", "値を返却する命令は？" },
			{ "overload", "同じ名前のメソッドを複数定義することを？" },
			{ "argument", "メソッドを呼び出す際、渡す値（材料）のことを何という？" },
			{ "override", "親クラスのメソッドを上書きすることを？" },
			{ "variable", "一つの値を保持する変数の最小単位は？" }, };

	// =====================================
	// MON4
	// =====================================

	private final String[][] MON4_WORDS = {

			{ "abstract", "インスタンス化を禁止し、継承専用にする修飾子は？" },
			{ "String", "文字列を扱うクラス（型）は何？" },
			{ "extends", "他のクラスの機能を引き継ぐ（継承）時に使う単語は？" },
			{ "boolean", "真か偽（trueかfalse）を扱う型は何？" },
			{ "package", "包" },
			{ "private", "非公開" },
			{ "abstractmethod", "中身が未完成なメソッドを指す「抽象メソッド」の英語名は？" },
			{ "garbagecollector", "メモリ上の不要な領域を解放する機能は？" },
			{ "CollectionFramework", "大量なデータの集まりを効率よく扱う「リスト」や「マップ」の総称は？" },
			{ "System.out.println", "画面に文字を表示して改行する、Javaで最も有名な命令は？" },

	};

	// =====================================
	// MON5
	// =====================================

	private final String[][] MON5_WORDS = {

			{ "RuntimeException", "実行時例外の親クラスは？" },
			{ "NullPointerException", "ぬるぽ" },
			{ "StringBuilder", "中身を書き換えられる文字列の箱は？" },
			{ "implements", "インターフェースを実装する時に使う単語は？" },
			{ "IllegalArgumentException", "メソッドに不適切な引数が渡された時の例外は？" },
			{ "ArrayIndexOutOfBoundsException", "配列の存在しない範囲を指定した時の例外は？" },
			{ "System.currentTimeMillis", "現在の時刻をミリ秒単位で取得するメソッドは？" },
			{ "BufferedReader", "ファイルを一行ずつ効率よく読み込むためのクラスは？" },
			{ "Integer.parseInt", "数字の文字列をint型の整数に変換するメソッドは？" },
			{ "public static void main", "Javaプログラムの実行の起点となるメインメソッドの宣言は？" }
	};

	// =====================================
	// 問題リスト
	// =====================================

	private List<String[]> wordList = new ArrayList<>();

	// =====================================
	// 日本語
	// =====================================

	private String japanese;

	// =====================================
	// ローマ字
	// =====================================

	private String word;

	// =====================================
	// 現在位置
	// =====================================

	private int currentIndex = 0;

	// =====================================
	// ミス判定
	// =====================================

	private boolean miss = false;

	// =====================================
	// クリア判定
	// =====================================

	private boolean clear = false;

	// =====================================
	// ランダム
	// =====================================

	private Random random = new Random();

	private Score score;

	// =====================================
	// 現在モンスター
	// =====================================

	private int currentMonster = 1;

	private static TypingKey instance;

	Timer timer = TimerManager.timerInstance().getTimer();

	// =====================================
	// コンストラクタ
	// =====================================
	CardLayout layout;
	JPanel panel;

	public TypingKey(CardLayout layer, JPanel pane, Score s) {
		layout = layer;
		panel = pane;
		score = s;
		// =====================================
		// 初期問題設定
		// =====================================
		instance = this;
		changeMonster(
				currentMonster);
	}

	// =====================================
	// モンスター変更
	// =====================================

	public void changeMonster(
			int monsterNumber) {

		// =====================================
		// モンスター保存
		// =====================================

		currentMonster = monsterNumber;

		// =====================================
		// リスト初期化
		// =====================================

		wordList.clear();

		// =====================================
		// モンスターごと問題変更
		// =====================================

		switch (monsterNumber) {

		case 1:

			addWords(MON1_WORDS);

			break;

		case 2:

			addWords(MON2_WORDS);

			break;

		case 3:

			addWords(MON3_WORDS);

			break;

		case 4:

			addWords(MON4_WORDS);

			break;

		case 5:

			addWords(MON5_WORDS);

			break;
		}

		// =====================================
		// 最初の問題
		// =====================================

		setNextWord();
	}

	// =====================================
	// 問題追加
	// =====================================

	private void addWords(
			String[][] words) {
		for (String[] data : words) {
			wordList.add(data);
		}
	}

	// =====================================
	// 次問題
	// =====================================

	public void setNextWord() {

		// =====================================
		// ランダム取得
		// =====================================

		int index = random.nextInt(
				wordList.size());

		// =====================================
		// 問題取得
		// =====================================

		String[] data = wordList.get(index);

		// 問題削除try 追加コード
		wordList.remove(index);

		// =====================================
		// ローマ字
		// =====================================

		word = data[0];

		// =====================================
		// 日本語
		// =====================================

		japanese = data[1];

		// =====================================
		// 入力位置初期化
		// =====================================

		currentIndex = 0;

		// =====================================
		// ミス解除
		// =====================================

		miss = false;
	}

	// =====================================
	// キー入力
	// =====================================
	@Override
	public void keyPressed(KeyEvent e) {
		SoundManager.TYPE.play();
		char input = e.getKeyChar();
		char answer = word.charAt(currentIndex);

		String keyStr = String.valueOf(input);
		// =====================================
		// クリア判定初期化
		// =====================================
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			layout.show(panel, "ポーズ");
			timer.stop();

		} else if (keyStr.matches("[a-zA-Z\s\\.]")) {

			clear = false;

			// =====================================
			// 正解
			// =====================================

			if (input == answer) {
				System.out.println("type");

				score.PlusScore();

				// =====================================
				// ミス解除
				// =====================================

				miss = false;

				// =====================================
				// 次文字へ
				// =====================================

				currentIndex++;

				// =====================================
				// 単語クリア
				// =====================================

				if (currentIndex >= word.length()) {

					// =====================================
					// クリア通知
					// 外側でHP減少処理などを行う
					// =====================================

					clear = true;

					// =====================================
					// 次問題
					// =====================================

					setNextWord();
				}
			} else {
				System.out.println("misstype");
				miss = true;
				score.MinusScore();
				score.setMiss();
			}
		}
	}

	public static TypingKey getInstance() {

		return instance;
	}

	public void reset() {

		currentMonster = 1;

		currentIndex = 0;

		miss = false;

		clear = false;

		wordList.clear();

		changeMonster(1);
	}

	// =====================================
	// 現在位置取得
	// =====================================

	public int getCurrentIndex() {

		return currentIndex;
	}

	// =====================================
	// ローマ字取得
	// =====================================

	public String getWord() {

		return word;
	}

	// =====================================
	// 日本語取得
	// =====================================
	public String getJapanese() {
		return japanese;
	}

	// =====================================
	// ミス判定取得
	// =====================================

	public boolean isMiss() {

		return miss;
	}

	// =====================================
	// クリア判定取得
	// =====================================

	public boolean isClear() {
		return clear;
	}
	// =====================================
	// クリア取得
	// 取得後falseへ戻す
	// =====================================

	public boolean consumeClear() {

		// =====================================
		// クリア済み
		// =====================================
		if (clear) {
			// =====================================
			// 次回用に戻す
			// =====================================
			clear = false;
			return true;
		}

		return false;
	}
}