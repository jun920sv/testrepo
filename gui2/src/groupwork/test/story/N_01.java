package groupwork.test.story;

public class N_01 extends Story{
	int changeStatus1 = 0;
	int changeStatus2 = 0;
	int changeStatus3 = 0;
	int changeStatus4 = 0;
//書き込む場所は、ここから↓--------------------------------------------------------

//読み込む画像の名前。クラス名と同じ文字を入力。
	String ImagePath = "N_01";
//本文
	String text = """
けたたましくサイレンの音が鳴り響く。
絶え間ないエンジン音と爆発音、地震と見紛う程の振動、灼けた空気。
セーフハウスが加速度的に、動揺と恐怖で満たされていく。

重爆撃の特徴だ。
直ぐに対応しなければ、多くの喪失を招く結果になる。

地下室への避難が必要だが、完全な収容には空間が不足している。
人か、物か、優先順位を決めなければならない。""";
//上の選択肢の文章
	String choiceAText = """
A…セーフハウス内の人員を優先して収容する。
物資: -25　信頼: +-0　精神: +-0　弾薬: -25""";
//下の選択肢の文章
	String choiceBText = """
B…物資の保持を優先し、その上で可能な限り避難を行う。
物資: +-0　信頼: -25　精神: -25　弾薬: +-0""";
//上の選択肢を選んだあと表示される文章
	String resultAText = """
人的被害の回避を目的に、地下への避難を優先した。
死傷者の発生を最小化できた事をまずは喜ぶべきだろう。
代償として、多くの物資と弾薬を爆撃で喪失した。""";
//下の選択肢を選んだあと表示される文章
	String resultBText = """
爆撃を受けてなお、物資と弾薬を守り抜いた。
代償として、一定数の人的被害が発生した。
沈痛な面持ちで嘆く者も、非難の声を浴びせる者もいる。""";
//画像の名前（クラス名と同じ名前を入力）
	String imagePath = "N_01.png";

public void setChoiceAStatus() {//上の選択肢を選んだ時の変動値
	this.changeStatus1 = -25;
	this.changeStatus2 = 0;
	this.changeStatus3 = 0;
	this.changeStatus4 = -25;

	}

public void setChoiceBStatus() {//下の選択肢を選んだ時の変動値
	this.changeStatus1 = 0;
	this.changeStatus2 = -25;
	this.changeStatus3 = -25;
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



