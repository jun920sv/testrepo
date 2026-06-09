package groupwork.test.story;

//＜＜＜入力時の注意事項＞＞＞
//text・choiceAText・choiceBText・resultAText・resultBText・setChoiceAStatus・setChoiceBStatus・ImagePathを入力！
//クラス名は対応する名前（N_01、N_02やE_01、E0_2）に変更！！！！注意！！！！！
//コピペする場合は最初の"""の次の行にペーストすること！！
//空白やTabは注意！ここに書いたものがそのまま映されます！！！

//クラス名忘れずに！↓
public class E_03 extends Story{
	int changeStatus1 = 0;
	int changeStatus2 = 0;
	int changeStatus3 = 0;
	int changeStatus4 = 0;
//書き込む場所は、ここから↓--------------------------------------------------------

//読み込む画像の名前。クラス名と同じ文字を入力。
	String ImagePath = "E_03.png";
//本文
	String text = """
拘束された人物を連れた警備要員が、執務室に入室する。
警備要員の言によれば、彼はクーデターを企てていた。
処罰が必要だ。

反逆者に適切な処罰といえば粛清が妥当だが、
極刑までは下さないという選択肢もある。

彼の生存は、セーフハウス内の反乱分子の増大を招く可能性がある。
しかし処刑すれば、生存者達の感情に一定以上の圧迫が生じるだろう。
			""";
//上の選択肢の文章
	String choiceAText = """
A…反逆者を粛清する
物資: 0　信頼: 5　精神: -25　弾薬: 0""";
//下の選択肢の文章
	String choiceBText = """
B…殺生までは行わない。地下室に封じる。
物資: 0　信頼: -25　精神: 5　弾薬: 0""";
//上の選択肢を選んだあと表示される文章
	String resultAText = """
粛清として、反逆者を公開処刑した。
拭い去れない恐怖のイメージが生存者達に刻まれた。
だが、傷口を焼き防ぐように反乱の芽は摘むことができたようだ。""";
//下の選択肢を選んだあと表示される文章
	String resultBText = """
実行された処分は生存者に気取られないほどの静かなものだった。
反逆者は地下にて秘密裏に勢力を築き、言説にて支持を揺るがした。""";
//画像の名前（クラス名と同じ名前を入力）
	String imagePath = "E_03.png";

public void setChoiceAStatus() {//上の選択肢を選んだ時の変動値
	this.changeStatus1 = 0;
	this.changeStatus2 = 5;
	this.changeStatus3 = -25;
	this.changeStatus4 = 0;

	}

public void setChoiceBStatus() {//下の選択肢を選んだ時の変動値
	this.changeStatus1 = 0;
	this.changeStatus2 = -25;
	this.changeStatus3 = 5;
	this.changeStatus4 = 0;

	}
//この行までが書き換える場所-----------------------------------------------------------

public int getChangeStatus1() {//変動値取得
	return this.changeStatus1;
	}

public int getChangeStatus2() {
	return this.changeStatus2;
	}

public int getChangeStatus3() {
	return this.changeStatus3;
	}

public int getChangeStatus4() {
	return this.changeStatus4;
	}

public String getText() {//本文取得
	return this.text;
	}

public String getChoiceAText() {//選択肢A取得
	return this.choiceAText;
	}
public String getChoiceBText() {//選択肢B取得
	return this.choiceBText;
	}
public String getResultAText() {//選択肢Aの結果の文章取得
	return this.resultAText;
	}
public String getResultBText() {//選択肢Bの結果の文章取得
	return this.resultBText;
	}
public String getImagePath() {//背景画像の名前を取得
	return this.imagePath;
	}
}