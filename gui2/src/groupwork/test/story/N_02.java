package groupwork.test.story;

	//＜＜＜入力時の注意事項＞＞＞
	//text・choiceAText・choiceBText・resultAText・resultBText・setChoiceAStatus・setChoiceBStatus・ImagePathを入力！
	//クラス名は対応する名前（N_01、N_02やE_01、E0_2）に変更！！！！注意！！！！！
	//コピペする場合は最初の"""の次の行にペーストすること！！
	//空白やTabは注意！ここに書いたものがそのまま映されます！！！

	//クラス名忘れずに！↓
	public class N_02 extends Story{
		int changeStatus1 = 0;
		int changeStatus2 = 0;
		int changeStatus3 = 0;
		int changeStatus4 = 0;
	//書き込む場所は、ここから↓--------------------------------------------------------

	//読み込む画像の名前。クラス名と同じ文字を入力。
		String ImagePath = "N_02";
	//本文
		String text = 
"""
銃声の止まない真昼。封鎖された市内では日常と化した風景。
暴力と死傷が、軍事行動と生存確保の名の下に正当化される非日常。

熱を帯びた声を上げる青年が、執務室に飛び込んできた。
妹が殺された。アイツらの仕業だ。
同じ言葉を繰り返す青年を落ち着かせると、ようやく状況が見えてきた。

生存者の要請は報復。下手人は、2区画先にアジトを構えるグループ。
他の生存者にも確認を取ったが、情報の確度は高い。

青年の悲劇に終止符を打つべきだろうか。""";
	//上の選択肢の文章
		String choiceAText = """
A…報復を許可し、青年と実働要員をアジトに向かわせる。
物資: 0　信頼: 5　精神: 5　弾薬: -25	""";
	//下の選択肢の文章
		String choiceBText = """
B…報復は却下する。少数の感情を理由に、更なる死傷のリスクは取れない。
物資: 0　信頼: -20　精神: -5　弾薬: 0""";
	//上の選択肢を選んだあと表示される文章
		String resultAText = """
セーフハウスの実働要員を集め、アジトに派遣した。
結果的に報復は成功した。
勝鬨を上げる生存者達を見るに、安心を生む結果にもなったようだ。""";
	//下の選択肢を選んだあと表示される文章
		String resultBText = """
青年は怒りを爆発させ、抗議を行った。
だが、個人の感情で決定を覆すことはできない。
繰り返し却下を告げると、青年は失望を吐いて執務室を去った。""";
	//画像の名前（クラス名と同じ名前を入力）
		String imagePath = "N_02.png";

	public void setChoiceAStatus() {//上の選択肢を選んだ時の変動値
		this.changeStatus1 = 0;
		this.changeStatus2 = 5;
		this.changeStatus3 = 5;
		this.changeStatus4 = -25;

		}

	public void setChoiceBStatus() {//下の選択肢を選んだ時の変動値
		this.changeStatus1 = 0;
		this.changeStatus2 = -20;
		this.changeStatus3 = -5;
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


