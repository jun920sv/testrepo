package Typing.Frame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicProgressBarUI;

import Typing.Controller.ActionListener.CtrlPause;
import Typing.Model.LifePoint;
import Typing.Model.ProgressBar;
import Typing.Model.Score;
import Typing.Model.TimerManager;
import Typing.Model.TypingGameManager;
import Typing.Model.TypingKey;
import Typing.Model.TypingView;

public class Play_Boss extends JPanel {

	public static final int NORMAL = 0;
	public static final int TIME_OVER = 1;
	public static final int WIN = 2;
	public static final int GAME_OVER = 3;
	public static final int GAME_CLEAR = 4;
	private int overlayMode = NORMAL;

	public int hp = 5;
	public int monsterHp = 5;
	public int currentMonsterIdx = 1;

	private TimerManager timerManager;

	private TypingKey typingKey;
	private TypingView typingView;
	private LifePoint lifePoint;
	private ProgressBar progressBar;
	private TypingGameManager gameManager;
	private Score score;
	private Timer gameTimer;

	private Image backgroundImage;
	private Image heroImage;
	private Image[] backgroundImages = new Image[5];
	private Image[] monsterImages = new Image[5];

	private JPanel northWrapper;
	public JLabel questionLabel;
	public JLabel typingLabel;
	public JProgressBar timerBar;
	private JButton pauseBtn;

	private JPanel heroHpPanel;
	private JPanel enemyHpPanel;
	
	
	public Play_Boss(CardLayout layout, JPanel panel, Score s, Result r) {
		setLayout(new BorderLayout());
		setOpaque(false);
		setPreferredSize(new Dimension(1280, 720));

		score = s;
		typingKey = new TypingKey(layout, panel, score);
		typingView = new TypingView();
		lifePoint = new LifePoint();

		this.setFocusable(true);
		this.addKeyListener(typingKey);

		this.addHierarchyListener(e -> {
			if (this.isShowing()) { // パネルが画面上に完全に表示されたか
				javax.swing.SwingUtilities.invokeLater(() -> {
					this.grabFocus(); // requestFocusよりも強力にフォーカスを要求
					this.requestFocusInWindow();
				});
			}
		});

		northWrapper = new JPanel(new BorderLayout());
		northWrapper.setOpaque(false);
		northWrapper.setBorder(BorderFactory.createEmptyBorder(
				20, 20, 0, 20));

		pauseBtn = new JButton("||");
		pauseBtn.addActionListener(new CtrlPause(layout, panel));
		pauseBtn.setFont(new Font("Arial", Font.BOLD, 20));
		pauseBtn.setPreferredSize(new Dimension(50, 50));
		pauseBtn.setFocusable(false);
		JPanel leftPanel = new JPanel(new FlowLayout(
				FlowLayout.LEFT, 0, 0));

		leftPanel.setOpaque(false);
		leftPanel.add(pauseBtn);

		JPanel centerUiPanel = new JPanel();
		centerUiPanel.setLayout(new BoxLayout(
				centerUiPanel, BoxLayout.Y_AXIS));
		centerUiPanel.setOpaque(false);

		questionLabel = new JLabel(" ", JLabel.CENTER);

		questionLabel.setFont(new Font("MS Gothic", Font.BOLD, 48));

		questionLabel.setForeground(Color.BLACK);
		questionLabel.setBackground(Color.WHITE);
		questionLabel.setOpaque(true);
		questionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

		questionLabel.setBorder(BorderFactory.createEmptyBorder(
				5, 40, 5, 40));

		typingLabel = new JLabel(" ", JLabel.CENTER);

		typingLabel.setFont(new Font("Monospaced", Font.BOLD, 55));

		typingLabel.setForeground(Color.WHITE);
		typingLabel.setBackground(new Color(0, 0, 0, 200));
		typingLabel.setOpaque(true);
		typingLabel.setBorder(
				BorderFactory.createEmptyBorder(5, 20, 5, 20));

		JPanel typingWrapper = new JPanel(
				new FlowLayout(FlowLayout.CENTER));

		typingWrapper.setOpaque(false);
		typingWrapper.add(typingLabel);

		timerBar = new JProgressBar(0, 100);
		timerBar.setPreferredSize(new Dimension(600, 20));
		//		timerBar.setMaximumSize(new Dimension(600, 20));
		timerBar.setBackground(Color.WHITE);
		timerBar.setUI(new BasicProgressBarUI() {

			@Override
			protected void paintDeterminate(Graphics g, JComponent c) {

				Graphics2D g2 = (Graphics2D) g;
				int width = c.getWidth();
				int height = c.getHeight();
				double percent = timerBar.getPercentComplete();
				g2.setColor(Color.WHITE);
				g2.fillRect(0, 0, width, height);

				g2.setColor(percent >= 0.75 ? Color.RED
						: new Color(50, 205, 50));
				g2.fillRect(0, 0, (int) (width * percent), height);
			}
		});

		timerBar.setAlignmentX(
				Component.CENTER_ALIGNMENT);

		centerUiPanel.add(questionLabel);
		centerUiPanel.add(Box.createVerticalStrut(10));
		centerUiPanel.add(typingWrapper);
		centerUiPanel.add(Box.createVerticalStrut(10));
		centerUiPanel.add(timerBar);

		northWrapper.add(leftPanel, BorderLayout.WEST);
		northWrapper.add(centerUiPanel, BorderLayout.CENTER);
		JPanel spacer = new JPanel();
		spacer.setPreferredSize(new Dimension(50, 50));
		spacer.setOpaque(false);
		northWrapper.add(spacer, BorderLayout.EAST);
		add(northWrapper, BorderLayout.NORTH);
		heroHpPanel = new JPanel(
				new FlowLayout(FlowLayout.LEFT, 20, 20));
		heroHpPanel.setOpaque(false);
		add(heroHpPanel, BorderLayout.SOUTH);
		enemyHpPanel = new JPanel(
				new FlowLayout(FlowLayout.RIGHT, 20, 20));

		enemyHpPanel.setOpaque(false);
		add(enemyHpPanel, BorderLayout.EAST);

		progressBar = new ProgressBar(timerBar);
		gameManager = new TypingGameManager(
				typingKey, progressBar, lifePoint, score, this);

		setFocusable(true);
		requestFocusInWindow();

		timerManager = TimerManager.timerInstance();
		gameTimer = timerManager.getTimer();

		gameTimer.addActionListener(e -> {
			gameManager.update();
			String text = typingKey.getJapanese();
			questionLabel.setText("<html><div style='text-align: center; msx-width: 800px;'>" + text + "</div></html>");
			//			questionLabel.setText(typingKey.getJapanese());
			typingLabel.setText(
					typingView.createTypingText(typingKey));

			hp = lifePoint.getMyPoint();
			monsterHp = lifePoint.getEnemyPoint();
			currentMonsterIdx = gameManager.getCurrentMonster();

			// =========================
			// ゲーム終了判定 リザルト画面へ 追加場所
			// =========================

			if (gameManager.isGameOver()) {
				this.showOverlay(GAME_OVER);
				Timer delayTimer = new Timer(1500, _ -> {
					this.showOverlay(Play_Boss.NORMAL);
					r.updateScore(s);
					layout.show(panel, "リザルト");
				});
				delayTimer.setRepeats(false);
				delayTimer.start();
				gameTimer.stop();
				score.setSQL();

			}

			if (gameManager.isGameClear()) {
				this.showOverlay(GAME_CLEAR);
				Timer delayTimer = new Timer(1500, _ -> {
					this.showOverlay(Play_Boss.NORMAL);
					r.updateScore(s);
					layout.show(panel, "リザルト");
				});
				delayTimer.setRepeats(false);
				delayTimer.start();
				gameTimer.stop();
				score.setSQL();
			}

			heroHpPanel.removeAll();

			for (int i = 0; i < hp; i++) {
				JLabel heart = new JLabel("♥");
				heart.setForeground(Color.RED);
				heart.setFont(
						new Font("Dialog", Font.BOLD, 35));
				heroHpPanel.add(heart);
			}

			enemyHpPanel.removeAll();
			for (int i = 0; i < monsterHp; i++) {
				JLabel heart = new JLabel("♥");
				heart.setForeground(
						Color.RED);
				heart.setFont(new Font("Dialog", Font.BOLD, 35));
				enemyHpPanel.add(heart);
			}

			heroHpPanel.revalidate();
			heroHpPanel.repaint();
			enemyHpPanel.revalidate();
			enemyHpPanel.repaint();

			if (gameManager.isGameClear()) {
				questionLabel.setText("GAME CLEAR");
			}

			if (gameManager.isGameOver()) {
				questionLabel.setText("GAME OVER");
			}

			repaint();
		});
		loadImages();

	}

	public void showOverlay(int mode) {
		overlayMode = mode;
		repaint();
	}

	private void loadImages() {

		try {
			heroImage = ImageIO.read(new File("red2.png"));

			for (int i = 0; i < 5; i++) {
				backgroundImages[i] = ImageIO.read(
						new File((i + 1) + ".png"));
			}
			for (int i = 0; i < 5; i++) {
				monsterImages[i] = ImageIO.read(
						new File("mon" + (i + 1) + ".png"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(
				RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		if (currentMonsterIdx == 5) {
			backgroundImage = backgroundImages[4];
		} else {
			backgroundImage = backgroundImages[1];
		}
		if (backgroundImage != null) {
			g2.drawImage(
					backgroundImage, 0, 0, getWidth(), getHeight(), this);
		}

		int hX = 80;
		int hY = getHeight() - 380;
		if (heroImage != null) {
			g2.drawImage(heroImage, hX, hY, 280, 280, this);
		}

		int mX = getWidth() - 380;
		int mY = getHeight() - 380;
		int mSize = (currentMonsterIdx == 5) ? 500 : 300;

		if (currentMonsterIdx >= 1
				&& currentMonsterIdx <= 5
				&& monsterImages[currentMonsterIdx - 1] != null) {

			g2.drawImage(
					monsterImages[currentMonsterIdx - 1],
					mX, mY, mSize, mSize, this);
		}
		if (overlayMode == TIME_OVER) {

			g2.setFont(
					new Font("Arial", Font.BOLD, 100));
			g2.setColor(Color.RED);

			g2.drawString(
					"TIME OVER",
					getWidth() / 2 - 260,
					getHeight() / 2);
		}

		if (overlayMode == WIN) {

			g2.setFont(new Font("Arial", Font.BOLD, 100));
			g2.setColor(Color.YELLOW);
			g2.drawString("WIN!", getWidth() / 2 - 120, getHeight() / 2);
		}

		if (overlayMode == GAME_OVER) {
			g2.setFont(new Font("Arial", Font.BOLD, 70));
			g2.setColor(Color.RED);
			System.out.println("ここ");
			g2.drawString("GAME OVER", getWidth() / 2 - 250, getHeight() / 2);
		}
		if (overlayMode == GAME_CLEAR) {
			g2.setFont(new Font("Arial", Font.BOLD, 70));
			g2.setColor(Color.WHITE);
			g2.drawString("GAME CLEAR", getWidth() / 2 - 250, getHeight() / 2);
		}
	}
}