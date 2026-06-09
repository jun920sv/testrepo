package Typing.Model;

import javax.swing.Timer;

import Typing.Frame.Play_Boss;

public class TypingGameManager {

	// =====================================
	// TypingKey
	// =====================================

	private TypingKey typingKey;

	// =====================================
	// ProgressBar
	// =====================================

	private ProgressBar progressBar;

	// =====================================
	// LifePoint
	// =====================================

	private LifePoint lifePoint;

	// =====================================
	// Score
	// =====================================
	private Score score;

	// =====================================
	// Play_Boss
	// =====================================

	private Play_Boss playBossView;

	// =====================================
	// 現在モンスター
	// =====================================

	private int currentMonster = 1;

	// =====================================
	// ゲームオーバー
	// =====================================

	private boolean gameOver = false;

	// =====================================
	// ゲームクリア
	// =====================================

	private boolean gameClear = false;

	// =====================================
	// WIN
	// =====================================

	private boolean win = false;

	private static TypingGameManager instance;

	// =====================================
	// コンストラクタ
	// =====================================

	public TypingGameManager(

			TypingKey typingKey,
			ProgressBar progressBar,
			LifePoint lifePoint,
			Score score,
			Play_Boss playBossView) {

		this.typingKey = typingKey;
		this.progressBar = progressBar;
		this.lifePoint = lifePoint;
		this.score = score;
		this.playBossView = playBossView;

		instance = this;

	}

	// =====================================
	// 更新処理
	// =====================================

	public void update() {

		// =====================================
		// ProgressBar更新
		// =====================================

		progressBar.update();

		// =====================================
		// 単語クリア
		// =====================================

		if (typingKey.consumeClear()) {

			// =====================================
			// 敵HP減少
			// =====================================

			lifePoint.MinusEnemyPoint();

			// =====================================
			// ProgressBarリセット
			// =====================================

			progressBar.reset();

			// =====================================
			// 敵撃破
			// =====================================

			if (lifePoint.getEnemyPoint() <= 0) {

				// =====================================
				// 最終モンスター
				// =====================================

				if (currentMonster == 5) {

					// =====================================
					// ゲームクリア
					// =====================================

					gameClear = true;

					playBossView.showOverlay(
							Play_Boss.WIN);

					return;
				}

				// =====================================
				// WIN表示
				// =====================================

				win = true;

				playBossView.showOverlay(
						Play_Boss.WIN);

				// =====================================
				// 次モンスター
				// =====================================

				currentMonster++;

				// =====================================
				// 問題変更
				// =====================================

				typingKey.changeMonster(
						currentMonster);

				// =====================================
				// 敵HP初期化
				// =====================================

				lifePoint.setEnemyPoint(5);

				// =====================================
				// ProgressBarリセット
				// =====================================

				progressBar.reset();

				// =====================================
				// WIN演出後戻す
				// =====================================

				Timer winTimer = new Timer(1000, e -> {

					playBossView.showOverlay(
							Play_Boss.NORMAL);
				});

				winTimer.setRepeats(false);

				winTimer.start();
			}
		}

		// =====================================
		// 時間切れ
		// =====================================

		if (progressBar.consumeTimeOver()) {

			// =====================================
			// プレイヤーHP減少
			// =====================================

			lifePoint.MinusMyPoint();

			// =====================================
			// ProgressBarリセット
			// =====================================

			progressBar.reset();

			// =====================================
			// TIME OVER表示
			// =====================================

			playBossView.showOverlay(
					Play_Boss.TIME_OVER);

			// =====================================
			// HP残ってる
			// =====================================

			if (lifePoint.getMyPoint() > 0) {

				Timer delayTimer = new Timer(1500, e -> {

					playBossView.showOverlay(
							Play_Boss.NORMAL);
				});

				delayTimer.setRepeats(false);
				delayTimer.start();
			}

			// =====================================
			// ゲームオーバー
			// =====================================

			if (lifePoint.getMyPoint() <= 0) {

				gameOver = true;

				playBossView.showOverlay(
						Play_Boss.GAME_OVER);

			}
		}
	}

	public static TypingGameManager getInstance() {
		return instance;
	}

	public void reset() {

		currentMonster = 1;

		gameOver = false;

		gameClear = false;

		win = false;
	}

	// =====================================
	// 現在モンスター取得
	// =====================================

	public int getCurrentMonster() {

		return currentMonster;
	}

	// =====================================
	// ゲームオーバー取得
	// =====================================

	public boolean isGameOver() {

		return gameOver;
	}

	// =====================================
	// ゲームクリア取得
	// =====================================

	public boolean isGameClear() {

		return gameClear;
	}

	// =====================================
	// WIN取得
	// =====================================

	public boolean isWin() {

		return win;
	}
}