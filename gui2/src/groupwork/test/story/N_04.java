package groupwork.test.story;

public class N_04 extends Story{
	int changeStatus1 = 0;
	int changeStatus2 = 0;
	int changeStatus3 = 0;
	int changeStatus4 = 0;
//書き込む場所は、ここから↓--------------------------------------------------------

//読み込む画像の名前。クラス名と同じ文字を入力。
	String ImagePath = "N_04.png";
//本文
	String text = """
セーフハウス、メインゲート
荷物をまとめた生存者達が、離脱を求める。

当施設からの無許可での脱走はできない。
その証左に、彼等の身体には、照準を示すレーザーが照射されていた。

複雑な要素を取り除いて考えれば、状況はよりシンプルになる。
生存者に離脱の可能性を与えるか否か、その一点だ。""";
//上の選択肢の文章
	String choiceAText = """
A…離脱を許可する。
物資: -5　信頼: -10　精神: 0　弾薬: 0""";
//下の選択肢の文章
	String choiceBText = """
B…要求を却下する。共同体には協力が不可欠であり、独断での離脱は許されない。
物資: 0　信頼: -5　精神:-10 　弾薬: -5""";
//上の選択肢を選んだあと表示される文章
	String resultAText = """
セーフハウスから一部の生存者が離脱した。
彼等だけ不公平と騒ぐものもおり、結果的に離脱者が多発した。""";
//下の選択肢を選んだあと表示される文章
	String resultBText = """
要求を行っていた生存者達はセーフハウスに復帰した。
この処分の結果、無断の離脱を試みる脱走者が生じ始めた。""";
//画像の名前（クラス名と同じ名前を入力）
	String imagePath = "N_04.png";

public void setChoiceAStatus() {//上の選択肢を選んだ時の変動値
	this.changeStatus1 = -5;
	this.changeStatus2 = -10;
	this.changeStatus3 = 0;
	this.changeStatus4 = 0;

	}

public void setChoiceBStatus() {//下の選択肢を選んだ時の変動値
	this.changeStatus1 = 0;
	this.changeStatus2 = -5;
	this.changeStatus3 =-10;
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

