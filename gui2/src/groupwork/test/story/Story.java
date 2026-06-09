package groupwork.test.story;

public abstract class Story {//抽象クラス、配列使用時に利用したいため
	public abstract void setChoiceAStatus();//上の選択肢を選んだ時の変動値

	public abstract void setChoiceBStatus();//下の選択肢を選んだ時の変動値

	public abstract int getChangeStatus1();//変動値取得

	public abstract int getChangeStatus2();

	public abstract int getChangeStatus3();

	public abstract int getChangeStatus4();

	public abstract String getText();//本文取得

	public abstract String getChoiceAText();//選択肢A取得

	public abstract String getChoiceBText();//選択肢B取得

	public abstract String getResultAText();//選択肢Aの結果の文章取得

	public abstract String getResultBText();//選択肢Bの結果の文章取得

	public abstract String getImagePath();//背景画像の名前を取得
}
