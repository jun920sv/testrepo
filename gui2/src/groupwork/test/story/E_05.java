package groupwork.test.story;

public class E_05 extends Story{
	int changeStatus1 = 0;
	int changeStatus2 = 0;
	int changeStatus3 = 0;
	int changeStatus4 = 0;
//書き込む場所は、ここから↓--------------------------------------------------------

//読み込む画像の名前。クラス名と同じ文字を入力。
	String ImagePath = "E_05.png";
//本文
	String text = """
今日の執務室は少し騒がしい。二人の生存者から同時に提案が示された。

一人は実働要員のリーダー。もう一人は幼い子供を抱えた婦人だ。
前者の提案は、銃器と弾薬補給のための戦場漁り。
後者の提案は、予備の衣服と娯楽用品のためのショッピングモールの探索。

提案を述べるや否や、彼等は目の前で口論を始めた。
決断は避けられない。

戦時下の夜は長いが、両方の提案を叶えるには短すぎる。選択が必要だ。""";
//上の選択肢の文章
	String choiceAText = """
A…戦場に人員を派遣する。セーフハウスの安全を強化すべきだ。
物資: 0　信頼: 0　精神: -5　弾薬: +15""";
//下の選択肢の文章
	String choiceBText = """
B…ショッピングモールに人員を派遣する。清潔と娯楽は心の安定を生む。
物資: +5　信頼: 0　精神: +10　弾薬: -5""";
//上の選択肢を選んだあと表示される文章
	String resultAText = """
放棄された陣地や亡骸から、多数の武器弾薬を入手した。
これだけあれば、暫くは持つかもしれない。""";
//下の選択肢を選んだあと表示される文章
	String resultBText = """
モール内で小規模な交戦が発生した。
多少の弾薬を消耗する結果になったが、探索要員に被害は発生しなかった。""";
//画像の名前（クラス名と同じ名前を入力）
	String imagePath = "E_05.png";

public void setChoiceAStatus() {//上の選択肢を選んだ時の変動値
	this.changeStatus1 = 0;
	this.changeStatus2 = 0;
	this.changeStatus3 = -5;
	this.changeStatus4 = 15;

	}

public void setChoiceBStatus() {//下の選択肢を選んだ時の変動値
	this.changeStatus1 = 5;
	this.changeStatus2 = 0;
	this.changeStatus3 = 10;
	this.changeStatus4 = -5;

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

