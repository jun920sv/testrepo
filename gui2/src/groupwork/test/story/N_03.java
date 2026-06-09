package groupwork.test.story;

public class N_03 extends Story{
	int changeStatus1 = 0;
	int changeStatus2 = 0;
	int changeStatus3 = 0;
	int changeStatus4 = 0;
//書き込む場所は、ここから↓--------------------------------------------------------

//読み込む画像の名前。クラス名と同じ文字を入力。
	String ImagePath = "N_03.png";
//本文
	String text = """
武器弾薬管理要員より報告が入った。
管理用のリストと、実際の在庫数が一致しない事例が増加傾向とのことだ。

ほぼ同時期に、警備要員から監視設備の増設要請が届いている。
状況の符号は一致した。対策の必要性は間違いない。
窃盗犯の特定には至っていないが、捕らえれば分かることだ。

要請に応じて設備を増設する場合、相応の物資が必要になる。""";
//上の選択肢の文章
	String choiceAText = """
A…監視設備を増設し、窃盗に備える
物資: -25　信頼: +5　精神: 0　弾薬: 0""";
//下の選択肢の文章
	String choiceBText = """
B…設備強化は行わない。物資を節約する
物資: 0　信頼: -10　精神: 0　弾薬: -20""";
//上の選択肢を選んだあと表示される文章
	String resultAText = """
設備強化に多数の物資を投じた。結果としてその成果は実った。
窃盗犯の正体は別の生存者グループの斥候だった。
始末が完了した以上、再発は防止できたといっていいだろう。""";
//下の選択肢を選んだあと表示される文章
	String resultBText = """
弾薬の窃盗は再発した。
不十分な監視設備では足取りを追うことがかなわず、
窃盗犯を取り逃がす結果に終わった。
""";
//画像の名前（クラス名と同じ名前を入力）
	String imagePath = "N_03.png";

public void setChoiceAStatus() {//上の選択肢を選んだ時の変動値
	this.changeStatus1 = -25;
	this.changeStatus2 = 5;
	this.changeStatus3 = 0;
	this.changeStatus4 = 0;

	}

public void setChoiceBStatus() {//下の選択肢を選んだ時の変動値
	this.changeStatus1 = 0;
	this.changeStatus2 = -10;
	this.changeStatus3 = 0;
	this.changeStatus4 = -20;

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

