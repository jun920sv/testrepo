package groupwork.test.story;

//＜＜＜入力時の注意事項＞＞＞
//text・choiceAText・choiceBText・resultAText・resultBText・setChoiceAStatus・setChoiceBStatus・ImagePathを入力！
//クラス名は対応する名前（N_01、N_02やE_01、E0_2）に変更！！！！注意！！！！！
//コピペする場合は最初の"""の次の行にペーストすること！！
//空白やTabは注意！ここに書いたものがそのまま映されます！！！

//クラス名忘れずに！↓
public class E_04 extends Story{
	int changeStatus1 = 0;
	int changeStatus2 = 0;
	int changeStatus3 = 0;
	int changeStatus4 = 0;
//書き込む場所は、ここから↓--------------------------------------------------------

//読み込む画像の名前。クラス名と同じ文字を入力。
	String ImagePath = "E_04.png";
//本文
	String text = """
セーフハウスに物理的、および精神的な衛生問題が未解決のまま残されている。
生存者達の、亡骸の始末の問題だ。

ある老人は伝統的な形式に乗っ取った葬儀を行うべきと主張し、
若人は、衛生面の観点から死体の迅速な焼却処分を推奨した。

彼等の議論は白熱し、決断なくしては収束の糸が見当たらない。
生存者達の感情が沸点を越える前に、対処する必要がある。""";
//上の選択肢の文章
	String choiceAText = """
A…老人の意見を採用し、葬儀を執り行う。
物資: -25　信頼: 0　精神: 5　弾薬: 0""";
//下の選択肢の文章
	String choiceBText = """
B…若人の意見を採用し、死体の処理を優先する。
物資: 0　信頼: -10　精神: -15　弾薬: 0""";
//上の選択肢を選んだあと表示される文章
	String resultAText = """
葬儀を終え、生存者達は各々の方法で哀悼の意を捧げている
家族、恋人、友人。関係性は違えども、
人々にとって、喪われた者に想いを馳せる時間ができたのは確かだ。""";
//下の選択肢を選んだあと表示される文章
	String resultBText = """
一部生存者から大きな抗議の声が上がるも、すべての死体の処分を完了した。
生存者達の感情はさておき、セーフハウスの衛生問題は解決に大きく前進した。""";
//画像の名前（クラス名と同じ名前を入力）
	String imagePath = "E_04.png";

public void setChoiceAStatus() {//上の選択肢を選んだ時の変動値
	this.changeStatus1 = -25;
	this.changeStatus2 = 0;
	this.changeStatus3 = 5;
	this.changeStatus4 = 0;

	}

public void setChoiceBStatus() {//下の選択肢を選んだ時の変動値
	this.changeStatus1 = 0;
	this.changeStatus2 = -10;
	this.changeStatus3 = -15;
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