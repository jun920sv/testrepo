package gui2.day1;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            new GameFrame();
        });
    }
}

// ======================================
// フレーム
// ======================================

class GameFrame extends JFrame {

    CardLayout card = new CardLayout();

    JPanel mainPanel = new JPanel(card);

    public GameFrame() {

        setTitle("タイピングヒーロー");

        setSize(1280, 720);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // タイトル
        TitlePanel titlePanel =
                new TitlePanel(this);

        // ゲーム
        GamePanel gamePanel =
                new GamePanel(this);

        mainPanel.add(titlePanel, "TITLE");

        mainPanel.add(gamePanel, "GAME");

        add(mainPanel);

        setVisible(true);
    }

    public void startGame() {

        card.show(mainPanel, "GAME");
    }

    public void showTitle() {

        card.show(mainPanel, "TITLE");
    }
}

// ======================================
// タイトル画面
// ======================================

class TitlePanel extends JPanel {

    Image heroImage;

    public TitlePanel(GameFrame frame) {

        setLayout(new BorderLayout());

        setBackground(
                new Color(240, 240, 240)
        );

        // 画像
        heroImage =
                new ImageIcon(
                        "images/hero.png"
                ).getImage();

        // ==================================
        // タイトル
        // ==================================

        JLabel title =
                new JLabel(
                        "タイピングヒーロー",
                        SwingConstants.CENTER
                );

        title.setFont(
                new Font(
                        "MS Gothic",
                        Font.BOLD,
                        60
                )
        );

        add(title, BorderLayout.NORTH);

        // ==================================
        // 真ん中
        // ==================================

        JPanel centerPanel =
                new JPanel(
                        new BorderLayout()
                );

        centerPanel.setOpaque(false);

        // ヒーロー画像
        JLabel imageLabel =
                new JLabel(
                        new ImageIcon(heroImage)
                );

        imageLabel.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        centerPanel.add(
                imageLabel,
                BorderLayout.CENTER
        );

        add(centerPanel, BorderLayout.CENTER);

        // ==================================
        // 下ボタン
        // ==================================

        JPanel bottomPanel =
                new JPanel(
                        new GridLayout(1, 2, 100, 0)
                );

        bottomPanel.setBorder(
                BorderFactory.createEmptyBorder(
                        20,
                        80,
                        50,
                        80
                )
        );

        bottomPanel.setOpaque(false);

        JButton startButton =
                new JButton("モードを選ぶ");

        JButton helpButton =
                new JButton("初めての方はこちら");

        startButton.setFont(
                new Font(
                        "MS Gothic",
                        Font.BOLD,
                        28
                )
        );

        helpButton.setFont(
                new Font(
                        "MS Gothic",
                        Font.BOLD,
                        24
                )
        );

        bottomPanel.add(startButton);

        bottomPanel.add(helpButton);

        add(bottomPanel, BorderLayout.SOUTH);

        // 開始
        startButton.addActionListener(e -> {

            frame.startGame();
        });
    }
}

// ======================================
// 敵
// ======================================

class Enemy {

    String name;

    int hp;

    int maxHp;

    int speed;

    Image image;

    public Enemy(
            String name,
            int hp,
            int speed,
            String imagePath
    ) {

        this.name = name;

        this.hp = hp;

        this.maxHp = hp;

        this.speed = speed;

        image =
                new ImageIcon(
                        imagePath
                ).getImage();
    }

    public void reset() {

        hp = maxHp;
    }
}

// ======================================
// ゲーム画面
// ======================================

class GamePanel extends JPanel
        implements ActionListener {

    GameFrame frame;

    Random rand = new Random();

    // ==================================
    // 単語
    // ==================================

    String[] words = {

            "java",
            "class",
            "extends",
            "switch",
            "interface",
            "ArrayList",
            "HashMap"
    };

    String currentWord = "";

    // ==================================
    // プレイヤー
    // ==================================

    int playerHp = 5;

    Image playerImage;

    // ==================================
    // 敵
    // ==================================

    Enemy[] enemies = {

            new Enemy(
                    "ハチ",
                    3,
                    1,
                    "images/enemy1.png"
            ),

            new Enemy(
                    "ドラゴン",
                    5,
                    2,
                    "images/enemy2.png"
            ),

            new Enemy(
                    "ラスボス",
                    10,
                    4,
                    "images/boss.png"
            )
    };

    int currentEnemyIndex = 0;

    Enemy currentEnemy =
            enemies[currentEnemyIndex];

    // ==================================
    // ゲージ
    // ==================================

    int enemyGauge = 500;

    // ==================================
    // 状態
    // ==================================

    int score = 0;

    int combo = 0;

    boolean paused = false;

    boolean gameOver = false;

    boolean gameClear = false;

    // ==================================
    // Swing
    // ==================================

    JTextField inputField =
            new JTextField();

    JButton pauseButton =
            new JButton("一時停止");

    Timer timer;

    // ==================================
    // コンストラクタ
    // ==================================

    public GamePanel(GameFrame frame) {

        this.frame = frame;

        setLayout(new BorderLayout());

        setBackground(
                new Color(0, 80, 120)
        );

        playerImage =
                new ImageIcon(
                        "images/player.png"
                ).getImage();

        // ==================================
        // 上
        // ==================================

        JPanel topPanel =
                new JPanel(
                        new BorderLayout()
                );

        topPanel.setOpaque(false);

        pauseButton.setPreferredSize(
                new Dimension(150, 50)
        );

        pauseButton.setBackground(Color.RED);

        pauseButton.setForeground(Color.WHITE);

        pauseButton.setFont(
                new Font(
                        "MS Gothic",
                        Font.BOLD,
                        20
                )
        );

        topPanel.add(
                pauseButton,
                BorderLayout.WEST
        );

        // 説明
        JPanel infoPanel =
                new JPanel(
                        new GridLayout(2, 1)
                );

        infoPanel.setBackground(
                new Color(0, 100, 140)
        );

        infoPanel.setBorder(
                BorderFactory.createLineBorder(
                        Color.BLACK,
                        2
                )
        );

        JLabel jp =
                new JLabel(
                        "タイピング文字を入力（単語）",
                        SwingConstants.CENTER
                );

        jp.setForeground(Color.WHITE);

        jp.setFont(
                new Font(
                        "MS Gothic",
                        Font.BOLD,
                        35
                )
        );

        JLabel en =
                new JLabel(
                        "Typing Word Input",
                        SwingConstants.CENTER
                );

        en.setForeground(Color.WHITE);

        en.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        28
                )
        );

        infoPanel.add(jp);

        infoPanel.add(en);

        topPanel.add(
                infoPanel,
                BorderLayout.CENTER
        );

        add(topPanel, BorderLayout.NORTH);

        // ==================================
        // 真ん中
        // ==================================

        CenterPanel centerPanel =
                new CenterPanel();

        add(centerPanel, BorderLayout.CENTER);

        // ==================================
        // 下
        // ==================================

        JPanel bottomPanel =
                new JPanel(
                        new BorderLayout()
                );

        bottomPanel.setOpaque(false);

        inputField.setPreferredSize(
                new Dimension(400, 50)
        );

        inputField.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        28
                )
        );

        bottomPanel.add(
                inputField,
                BorderLayout.CENTER
        );

        add(bottomPanel, BorderLayout.SOUTH);

        // ==================================
        // イベント
        // ==================================

        inputField.addActionListener(e -> {

            checkTyping();
        });

        pauseButton.addActionListener(e -> {

            togglePause();
        });

        timer =
                new Timer(
                        30,
                        this
                );

        timer.start();

        nextWord();
    }

    // ==================================
    // 単語変更
    // ==================================

    void nextWord() {

        currentWord =
                words[
                        rand.nextInt(
                                words.length
                        )
                ];
    }

    // ==================================
    // 判定
    // ==================================

    void checkTyping() {

        if (paused
                || gameOver
                || gameClear) {

            return;
        }

        String text =
                inputField.getText();

        // 正解
        if (text.equals(currentWord)) {

            combo++;

            score += 100 * combo;

            currentEnemy.hp--;

            enemyGauge = 500;

            nextWord();

            // 撃破
            if (currentEnemy.hp <= 0) {

                currentEnemyIndex++;

                // クリア
                if (currentEnemyIndex
                        >= enemies.length) {

                    gameClear = true;

                    timer.stop();

                } else {

                    currentEnemy =
                            enemies[currentEnemyIndex];
                }
            }

        } else {

            combo = 0;
        }

        inputField.setText("");
    }

    // ==================================
    // 一時停止
    // ==================================

    void togglePause() {

        paused = !paused;

        if (paused) {

            timer.stop();

            pauseButton.setText("再開");

        } else {

            timer.start();

            pauseButton.setText("一時停止");
        }
    }

    // ==================================
    // Timer
    // ==================================

    @Override
    public void actionPerformed(
            ActionEvent e
    ) {

        enemyGauge -= currentEnemy.speed;

        // 攻撃
        if (enemyGauge <= 0) {

            playerHp--;

            combo = 0;

            enemyGauge = 500;

            // GAME OVER
            if (playerHp <= 0) {

                gameOver = true;

                timer.stop();
            }
        }

        repaint();
    }

    // ==================================
    // 中央描画パネル
    // ==================================

    class CenterPanel extends JPanel {

        public CenterPanel() {

            setOpaque(false);
        }

        @Override
        protected void paintComponent(
                Graphics g
        ) {

            super.paintComponent(g);

            Graphics2D g2 =
                    (Graphics2D) g;

            int w = getWidth();

            int h = getHeight();

            // =============================
            // ゲージ
            // =============================

            int gaugeX = w / 2 - 250;

            int gaugeY = 40;

            g2.setColor(Color.RED);

            g2.fillRect(
                    gaugeX,
                    gaugeY,
                    enemyGauge,
                    30
            );

            g2.setColor(
                    new Color(120, 220, 70)
            );

            g2.fillRect(
                    gaugeX + enemyGauge,
                    gaugeY,
                    500 - enemyGauge,
                    30
            );

            g2.setColor(Color.BLACK);

            g2.drawRect(
                    gaugeX,
                    gaugeY,
                    500,
                    30
            );

            // =============================
            // 真ん中単語
            // =============================

            g2.setColor(Color.WHITE);

            g2.setFont(
                    new Font(
                            "Arial",
                            Font.BOLD,
                            90
                    )
            );

            FontMetrics fm =
                    g2.getFontMetrics();

            int wordX =
                    (w
                            - fm.stringWidth(
                            currentWord
                    )) / 2;

            g2.drawString(
                    currentWord,
                    wordX,
                    h / 2
            );

            // =============================
            // プレイヤー
            // =============================

            g2.drawImage(
                    playerImage,
                    50,
                    h - 260,
                    180,
                    180,
                    this
            );

            // =============================
            // 敵
            // =============================

            g2.drawImage(
                    currentEnemy.image,
                    w - 250,
                    h - 260,
                    180,
                    180,
                    this
            );

            // =============================
            // HP
            // =============================

            drawHearts(
                    g2,
                    playerHp,
                    40,
                    h - 30
            );

            drawHearts(
                    g2,
                    currentEnemy.hp,
                    w - 260,
                    h - 30
            );

            // =============================
            // スコア
            // =============================

            g2.setColor(Color.WHITE);

            g2.setFont(
                    new Font(
                            "Arial",
                            Font.BOLD,
                            28
                    )
            );

            g2.drawString(
                    "SCORE : "
                            + score,
                    w / 2 - 100,
                    h - 20
            );

            // =============================
            // GAME OVER
            // =============================

            if (gameOver) {

                g2.setColor(
                        new Color(
                                0,
                                0,
                                0,
                                180
                        )
                );

                g2.fillRect(
                        0,
                        0,
                        w,
                        h
                );

                g2.setColor(Color.RED);

                g2.setFont(
                        new Font(
                                "Arial",
                                Font.BOLD,
                                80
                        )
                );

                g2.drawString(
                        "GAME OVER",
                        w / 2 - 220,
                        h / 2
                );
            }

            // =============================
            // CLEAR
            // =============================

            if (gameClear) {

                g2.setColor(
                        new Color(
                                255,
                                255,
                                255,
                                180
                        )
                );

                g2.fillRect(
                        0,
                        0,
                        w,
                        h
                );

                g2.setColor(Color.YELLOW);

                g2.setFont(
                        new Font(
                                "Arial",
                                Font.BOLD,
                                80
                        )
                );

                g2.drawString(
                        "GAME CLEAR!!",
                        w / 2 - 250,
                        h / 2
                );
            }
        }
    }

    // ==================================
    // ハート
    // ==================================

    void drawHearts(
            Graphics2D g2,
            int hp,
            int x,
            int y
    ) {

        g2.setFont(
                new Font(
                        "Dialog",
                        Font.PLAIN,
                        40
                )
        );

        for (int i = 0; i < 5; i++) {

            if (i < hp) {

                g2.setColor(Color.PINK);

                g2.drawString(
                        "❤",
                        x + i * 40,
                        y
                );

            } else {

                g2.setColor(Color.GRAY);

                g2.drawString(
                        "♡",
                        x + i * 40,
                        y
                );
            }
        }
    }
}