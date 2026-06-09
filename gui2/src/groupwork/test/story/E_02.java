package groupwork.test.story;

public class E_02 extends Story{
	int changeStatus1 = 0;
	int changeStatus2 = 0;
	int changeStatus3 = 0;
	int changeStatus4 = 0;
//書き込む場所は、ここから↓--------------------------------------------------------

//読み込む画像の名前。クラス名と同じ文字を入力。
	String ImagePath = "E_02";
//本文
	String text = """
喘鳴と呻きが、セーフハウスに蔓延している。
極限環境下において、生存者の誰かが罹患した病が伝染病のように広がっている。

戦時下の現状、外出の危険は未だに大きい。
発症者の治療は施設内に限られ、それには多くのリソースを必要とする。
			
もう一つの選択肢も残されている。
病人を集め、「遠征」に向かわせるという手段が。
しかしその手段は、生存者に大きな心の傷を残すだろう。
			
代償のない選択肢は存在しない。""";
//上の選択肢の文章
	String choiceAText = """
A…セーフハウス内で治療を試みる。誰一人見捨てない。
物資: -30　信頼: +-0　精神: +5　弾薬: +-0""";
//下の選択肢の文章
	String choiceBText = """
B…病人を集め、帰り道のない「遠征」に向かわせる。
物資: +-0　信頼: -5　精神: -30　弾薬: +-0""";
//上の選択肢を選んだあと表示される文章
	String resultAText = """
決して少なくない量の物資を費やすことになったが、治療は完了した。
これ以上、このセーフハウスで同じ疫病が蔓延することはないだろう。
危機を乗り越え、少しずつ元の雰囲気を取り戻してきた。""";
//下の選択肢を選んだあと表示される文章
	String resultBText = """
偽りの目的の元、病人達をセーフハウスの外に追いやった。
結果的に、物資を消耗することなく感染を収束させた。

しかし、「遠征」により引き裂かれた家族も存在する。
生存者達は精神的に大きなダメージを受けているようだ。""";
//画像の名前（クラス名と同じ名前を入力）
	String imagePath = "E_02.png";

public void setChoiceAStatus() {//上の選択肢を選んだ時の変動値
	this.changeStatus1 = -30;
	this.changeStatus2 = 0;
	this.changeStatus3 = 5;
	this.changeStatus4 = 0;

	}

public void setChoiceBStatus() {//下の選択肢を選んだ時の変動値
	this.changeStatus1 = 0;
	this.changeStatus2 = -5;
	this.changeStatus3 = -30;
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
