package groupwork.test.story;


public class N_05 extends Story{
	int changeStatus1 = 0;
	int changeStatus2 = 0;
	int changeStatus3 = 0;
	int changeStatus4 = 0;
//書き込む場所は、ここから↓--------------------------------------------------------

//読み込む画像の名前。クラス名と同じ文字を入力。
	String ImagePath = "N_05.png";
//本文
	String text = """
他のグループとの抗争を終えた。
崩落した建屋を前に、物資と武器弾薬が供出されていく。
残った相手グループの生存者は崩壊する建屋から避難し、
供出された物資と合わせて処分を待つ状況だ。

互いのグループの指導者が向かい合い、その周囲には近衛が銃を向け合う。
まだ警戒は解くべきではない。

凱旋より早く、指導者として済ませなければならないことがある。
何を奪い、何を残すのか。""";
//上の選択肢の文章
	String choiceAText = """
A…物資と弾薬を接収する。生存者には手をつけない。
物資: +10　信頼: 0　精神: 0　弾薬: +10""";
//下の選択肢の文章
	String choiceBText = """
B…人質を兼ねて生存者を引き入れる。今は頭数が必要だ。
物資: 0　信頼: -5　精神: +10　弾薬: 0""";
//上の選択肢を選んだあと表示される文章
	String resultAText = """
シンプルな取引として決着を付けた。
リソースを回収し、部隊を引き上げさせる。
相手の抵抗力も幾分か削ぐことができただろう。""";
//下の選択肢を選んだあと表示される文章
	String resultBText = """
人手が増えたことにより、セーフハウスでの一人頭の負担が削減された。
引き入れた人員は現体制に反対の立場を取っているが、
人道的な待遇を維持すれば、いずれは改善されるはずだ。""";
//画像の名前（クラス名と同じ名前を入力）
	String imagePath = "N_05.png";

public void setChoiceAStatus() {//上の選択肢を選んだ時の変動値
	this.changeStatus1 = 10;
	this.changeStatus2 = 0;
	this.changeStatus3 = 0;
	this.changeStatus4 = 10;

	}

public void setChoiceBStatus() {//下の選択肢を選んだ時の変動値
	this.changeStatus1 = 0;
	this.changeStatus2 = -5;
	this.changeStatus3 = 10;
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


