package groupwork.test.story;

public class E_01 extends Story{
	int changeStatus1 = 0;
	int changeStatus2 = 0;
	int changeStatus3 = 0;
	int changeStatus4 = 0;
//書き込む場所は、ここから↓--------------------------------------------------------

//読み込む画像の名前。クラス名と同じ文字を入力。
	String ImagePath = "E_01";
//本文
	String text = """
夜更けであっても、砲爆と銃声は止まない。
太陽の代わりに戦火が街を照らす真夜中、生存者達の緊張は続く。

荒立てないよう静かに、しかし確かな緊急性を秘めたノックが執務室のドアを鳴らす。
寝ずの番からの報告だ。

聞けば、セーフハウスに「訪問者」が訪れたのだと言う。
「訪問者」は人相の知れない集団で、武装している。
彼等は即座に武力を行使する事をせず、代わりに物資を要求した。

静かな”交渉”だが、単純な拒絶は許されない状況だ。""";
//上の選択肢の文章
	String choiceAText = """
A…銃で解決する必要はない。生存者の物資を彼等に提供し、出血を避ける。
物資: -30　信頼: +-0　精神: +0　弾薬: +-0""";
//下の選択肢の文章
	String choiceBText = """
B…譲歩は要求の加速を招く。武力をもって脅迫に対抗し、安全を勝ち取る。
物資: +-0　信頼: +10　精神: -5　弾薬: -30""";
//上の選択肢を選んだあと表示される文章
	String resultAText = """
要求を飲んだ事により「訪問者」はその場を去った。
危機は避けられたが、暫く節制を強いられそうだ。""";
//下の選択肢を選んだあと表示される文章
	String resultBText = """
物資は守られたが、弾薬を消耗した。
交戦に伴い生存者は精神的に疲弊している。一部では支持を強める声が上がる。
これ以上、同じ「訪問者」が訪れることはない。""";
//画像の名前（クラス名と同じ名前を入力）
	String imagePath = "E_01.png";

public void setChoiceAStatus() {//上の選択肢を選んだ時の変動値
	this.changeStatus1 = -30;
	this.changeStatus2 = 0;
	this.changeStatus3 = 0;
	this.changeStatus4 = 0;

	}

public void setChoiceBStatus() {//下の選択肢を選んだ時の変動値
	this.changeStatus1 = 0;
	this.changeStatus2 = 10;
	this.changeStatus3 = -5;
	this.changeStatus4 = -30;

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





