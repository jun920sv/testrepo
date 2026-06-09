package gui2.gui;



import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main extends JFrame {
    private JPanel mainPanel;
    private CardLayout cardLayout;

    private int monsterIdx = 0, waveCount = 0, hp = 5;
    private double currentBaseTime;
    private javax.swing.Timer gameTimer;
    private int currentTime, maxTime;

    private int totalTyped = 0, missCount = 0;
    private long startTimeMillis;

    private JLabel wordLabel, hpLabel, stageLabel, timeOverLabel, errorLabel, currentInputLabel, monsterLabel, winLabel;
    private JProgressBar timerBar;
    private String currentAnswer = "";
    private StringBuilder typedBuffer = new StringBuilder();
    private JLabel scoreRes, accuracyRes, missRes, timeRes;

    private final String[][] MON1_WORDS = {{"if", "条件"}, {"int", "整数"}, {"for", "反復"}, {"new", "生成"}, {"do", "実行"}};
    private final String[][] MON2_WORDS = {{"else", "その他"}, {"void", "空"}, {"long", "長整数"}, {"byte", "バイト"}, {"case", "場合"}};
    private final String[][] MON3_WORDS = {{"class", "設計図"}, {"static", "静的"}, {"public", "公開"}, {"import", "導入"}, {"return", "戻す"}};
    private final String[][] MON4_WORDS = {{"String", "文字列"}, {"extends", "継承"}, {"boolean", "論理型"}, {"package", "包"}, {"private", "非公開"}};
    private final String[][] MON5_WORDS = {{"System.out.println", "出力"}, {"RuntimeException", "例外"}, {"NullPointerException", "ぬるぽ"}, {"StringBuilder", "構築"}, {"implements", "実装"}};
    
    private final String[] MONSTER_NAMES = {"スライム", "ゴブリン", "オーク", "ドラゴン", "魔王"};
    private List<String[]> currentPool = new ArrayList<>();

    public Main() {
        setTitle("タイピングヒーロー - JavaQuest 完全版");
        setSize(1000, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // MacOS等でバーの色を反映させるための設定
        try { UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName()); } catch (Exception e) {}

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        mainPanel.add(createTitleScreen(), "TITLE");
        mainPanel.add(createHowToScreen(), "HOW_TO");
        mainPanel.add(createModeScreen(), "MODE");
        mainPanel.add(createDiffScreen(), "DIFF");
        mainPanel.add(createReadyScreen(), "READY");
        mainPanel.add(createBattleScreen(), "BATTLE");
        mainPanel.add(createSlide12Screen(), "SLIDE12");
        mainPanel.add(createResultScreen(), "RESULT");

        add(mainPanel);
        cardLayout.show(mainPanel, "TITLE");
    }

    private JPanel createTitleScreen() {
        JPanel p = new JPanel(new GridBagLayout());
        p.setBackground(new Color(15, 23, 42));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 10, 15, 10); gbc.gridx = 0;
        JLabel title = new JLabel("タイピングヒーロー");
        title.setFont(new Font("MS Gothic", Font.BOLD, 80)); title.setForeground(Color.CYAN);
        gbc.gridy = 0; p.add(title, gbc);

        String[] labels = {"モードを選ぶ", "ランキングを見る", "遊び方"};
        for (int i = 0; i < labels.length; i++) {
            JButton b = new JButton(labels[i]);
            b.setPreferredSize(new Dimension(300, 50));
            final String lab = labels[i];
            b.addActionListener(e -> {
                if (lab.equals("モードを選ぶ")) cardLayout.show(mainPanel, "MODE");
                else if (lab.equals("ランキングを見る")) cardLayout.show(mainPanel, "RESULT");
                else cardLayout.show(mainPanel, "HOW_TO");
            });
            gbc.gridy = i + 1; p.add(b, gbc);
        }
        return p;
    }

    private JPanel createBattleScreen() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBackground(Color.BLACK);
        p.setFocusable(true);

        p.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (gameTimer == null || !gameTimer.isRunning() || winLabel.isVisible() || timeOverLabel.isVisible()) return;
                char c = e.getKeyChar();
                if (c == KeyEvent.CHAR_UNDEFINED || c == '\n' || c == '\b') return;
                
                String target = typedBuffer.toString() + c;
                if (currentAnswer.startsWith(target)) {
                    typedBuffer.append(c);
                    currentInputLabel.setText(typedBuffer.toString());
                    errorLabel.setVisible(false);
                    if (typedBuffer.toString().equals(currentAnswer)) processCorrect();
                } else {
                    missCount++;
                    errorLabel.setVisible(true);
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });

        stageLabel = new JLabel("", JLabel.CENTER); stageLabel.setForeground(Color.WHITE);
        hpLabel = new JLabel("", JLabel.CENTER); hpLabel.setForeground(Color.YELLOW);
        JPanel north = new JPanel(new GridLayout(2, 1)); north.setOpaque(false);
        north.add(stageLabel); north.add(hpLabel);

        JPanel center = new JPanel(new GridBagLayout()); center.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints(); gbc.gridx = 0;

        monsterLabel = new JLabel(" ", JLabel.CENTER);
        monsterLabel.setFont(new Font("Serif", Font.ITALIC, 40)); monsterLabel.setForeground(Color.GREEN);
        gbc.gridy = 0; center.add(monsterLabel, gbc);

        wordLabel = new JLabel(" ", JLabel.CENTER);
        wordLabel.setFont(new Font("Arial", Font.BOLD, 60)); wordLabel.setForeground(Color.WHITE);
        gbc.gridy = 1; center.add(wordLabel, gbc);

        winLabel = new JLabel("WIN!", JLabel.CENTER);
        winLabel.setFont(new Font("Arial", Font.BOLD, 120)); winLabel.setForeground(Color.ORANGE);
        winLabel.setVisible(false);
        gbc.gridy = 1; center.add(winLabel, gbc);

        timeOverLabel = new JLabel("TIME OVER", JLabel.CENTER);
        timeOverLabel.setFont(new Font("Arial", Font.BOLD, 90)); timeOverLabel.setForeground(Color.RED);
        timeOverLabel.setVisible(false);
        gbc.gridy = 1; center.add(timeOverLabel, gbc);

        timerBar = new JProgressBar(0, 100); timerBar.setPreferredSize(new Dimension(600, 30));
        gbc.gridy = 2; gbc.insets = new Insets(20, 0, 20, 0); center.add(timerBar, gbc);

        currentInputLabel = new JLabel(" ", JLabel.CENTER);
        currentInputLabel.setFont(new Font("Arial", Font.BOLD, 55)); currentInputLabel.setForeground(Color.CYAN);
        gbc.gridy = 3; center.add(currentInputLabel, gbc);

        errorLabel = new JLabel("×", JLabel.CENTER);
        errorLabel.setFont(new Font("Arial", Font.BOLD, 100)); errorLabel.setForeground(Color.RED);
        errorLabel.setVisible(false);
        gbc.gridy = 4; center.add(errorLabel, gbc);

        p.add(north, BorderLayout.NORTH); p.add(center, BorderLayout.CENTER);
        return p;
    }

    private void processCorrect() {
        if (gameTimer != null) gameTimer.stop();
        totalTyped += currentAnswer.length();
        currentPool.remove(0);
        waveCount++;

        if (waveCount >= 5) {
            wordLabel.setVisible(false);
            winLabel.setVisible(true);
            monsterIdx++;
            waveCount = 0;
            
            javax.swing.Timer winDelay = new javax.swing.Timer(1500, e -> {
                winLabel.setVisible(false);
                wordLabel.setVisible(true);
                if (monsterIdx >= 5) { showResults(); cardLayout.show(mainPanel, "RESULT"); }
                else { updatePool(); startNewWord(); }
            });
            winDelay.setRepeats(false);
            winDelay.start();
        } else {
            javax.swing.Timer nextTimer = new javax.swing.Timer(300, e -> startNewWord());
            nextTimer.setRepeats(false);
            nextTimer.start();
        }
    }

    private void startNewWord() {
        if (hp <= 0 || monsterIdx >= 5) return;

        typedBuffer.setLength(0);
        currentInputLabel.setText(" ");
        errorLabel.setVisible(false);
        timeOverLabel.setVisible(false);
        wordLabel.setVisible(true);

        // 強制的にフォーカスをバトル画面へ戻す
        JPanel battlePanel = (JPanel) mainPanel.getComponent(5);
        battlePanel.requestFocusInWindow();

        String[] problem = currentPool.get(0);
        currentAnswer = problem[0];
        monsterLabel.setText(MONSTER_NAMES[monsterIdx] + " (" + (waveCount+1) + "/5)");
        stageLabel.setText("MISSION: " + (monsterIdx + 1) + " / 5");
        wordLabel.setText("<html><center><font size='5' color='#AAAAAA'>" + problem[1] + "</font><br>" + currentAnswer + "</center></html>");
        updateHP();

        maxTime = (int) (currentBaseTime / Math.pow(1.15, monsterIdx));
        currentTime = 0;
        timerBar.setMaximum(maxTime);
        timerBar.setValue(0);
        timerBar.setForeground(Color.GREEN);

        gameTimer = new javax.swing.Timer(50, e -> {
            currentTime += 50;
            timerBar.setValue(currentTime);
            if (currentTime > maxTime * 0.75) timerBar.setForeground(Color.RED);
            if (currentTime >= maxTime) { gameTimer.stop(); handleTimeOver(); }
        });
        gameTimer.start();
    }

    private void handleTimeOver() {
        wordLabel.setVisible(false);
        timeOverLabel.setVisible(true);
        hp--;
        updateHP();
        
        javax.swing.Timer delay = new javax.swing.Timer(1500, e -> {
            timeOverLabel.setVisible(false);
            if (hp <= 0) {
                showResults();
                cardLayout.show(mainPanel, "SLIDE12"); // 仮の結果画面へ
            } else {
                startNewWord();
            }
        });
        delay.setRepeats(false);
        delay.start();
    }

    private JPanel createSlide12Screen() {
        JPanel p = new JPanel(new GridBagLayout());
        p.setBackground(new Color(40, 0, 0));
        GridBagConstraints gbc = new GridBagConstraints(); gbc.gridx = 0;
        JLabel m = new JLabel("MISSION FAILED");
        m.setFont(new Font("Arial", Font.BOLD, 80)); m.setForeground(Color.RED);
        gbc.gridy = 0; p.add(m, gbc);
        JLabel s = new JLabel("（仮の結果表示画面）");
        s.setFont(new Font("MS Gothic", Font.PLAIN, 30)); s.setForeground(Color.WHITE);
        gbc.gridy = 1; gbc.insets = new Insets(20,0,20,0); p.add(s, gbc);
        JButton b = new JButton("スコア詳細を見る");
        b.addActionListener(e -> cardLayout.show(mainPanel, "RESULT"));
        gbc.gridy = 2; p.add(b, gbc);
        return p;
    }

    private void updatePool() {
        currentPool.clear();
        String[][] source;
        switch(Math.min(monsterIdx, 4)) {
            case 0: source = MON1_WORDS; break;
            case 1: source = MON2_WORDS; break;
            case 2: source = MON3_WORDS; break;
            case 3: source = MON4_WORDS; break;
            default: source = MON5_WORDS; break;
        }
        for(String[] w : source) currentPool.add(w);
        Collections.shuffle(currentPool);
    }

    private void showResults() {
        if (gameTimer != null) gameTimer.stop();
        long duration = (System.currentTimeMillis() - startTimeMillis) / 1000;
        double accuracy = (totalTyped + missCount == 0) ? 0 : ((double)totalTyped / (totalTyped + missCount)) * 100;
        scoreRes.setText("SCORE: " + (totalTyped * 100));
        accuracyRes.setText("正確性: " + String.format("%.1f", accuracy) + " %");
        missRes.setText("ミス数: " + missCount);
        timeRes.setText("経過時間: " + duration + " 秒");
    }

    private JPanel createResultScreen() {
        JPanel p = new JPanel(new GridBagLayout()); p.setBackground(Color.BLACK);
        GridBagConstraints gbc = new GridBagConstraints(); gbc.insets = new Insets(15, 0, 15, 0); gbc.gridx = 0;
        JLabel title = new JLabel("MISSION RESULT");
        title.setFont(new Font("Arial", Font.BOLD, 70)); title.setForeground(Color.RED);
        gbc.gridy = 0; p.add(title, gbc);
        scoreRes = new JLabel(""); accuracyRes = new JLabel(""); missRes = new JLabel(""); timeRes = new JLabel("");
        JLabel[] stats = {scoreRes, accuracyRes, missRes, timeRes};
        for(int i=0; i<stats.length; i++) {
            stats[i].setFont(new Font("MS Gothic", Font.BOLD, 35)); stats[i].setForeground(Color.WHITE);
            gbc.gridy = i + 1; p.add(stats[i], gbc);
        }
        JButton back = new JButton("タイトルへ戻る");
        back.addActionListener(e -> cardLayout.show(mainPanel, "TITLE"));
        gbc.gridy = 5; p.add(back, gbc);
        return p;
    }

    private JPanel createModeScreen() {
        JPanel p = new JPanel(new GridBagLayout());
        p.setBackground(new Color(20, 20, 40));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15); gbc.gridx = 0;
        String[] labels = {"Javaモード", "クエストモード", "戻る"};
        for (int i = 0; i < labels.length; i++) {
            JButton b = new JButton(labels[i]);
            b.setPreferredSize(new Dimension(300, 50));
            final String lab = labels[i];
            b.addActionListener(e -> {
                if (lab.equals("戻る")) cardLayout.show(mainPanel, "TITLE");
                else cardLayout.show(mainPanel, "DIFF");
            });
            gbc.gridy = i; p.add(b, gbc);
        }
        return p;
    }

    private JPanel createDiffScreen() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 250));
        p.setBackground(new Color(30, 30, 50));
        String[] levels = {"かんたん", "ふつう", "むずかしい"};
        for(String lv : levels) {
            JButton b = new JButton(lv);
            b.addActionListener(e -> {
                monsterIdx = 0; waveCount = 0; hp = 5; updatePool();
                if(lv.equals("かんたん")) currentBaseTime=25000;
                else if(lv.equals("ふつう")) currentBaseTime=18000;
                else currentBaseTime=12000;
                cardLayout.show(mainPanel, "READY");
            });
            p.add(b);
        }
        return p;
    }

    private JPanel createReadyScreen() {
        JPanel p = new JPanel(new GridBagLayout()); p.setBackground(Color.BLACK);
        JLabel l = new JLabel("SPACEキーで開始！");
        l.setFont(new Font("MS Gothic", Font.BOLD, 50)); l.setForeground(Color.WHITE);
        p.add(l); p.setFocusable(true);
        p.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_SPACE) {
                    totalTyped = 0; missCount = 0;
                    startTimeMillis = System.currentTimeMillis();
                    cardLayout.show(mainPanel, "BATTLE");
                    startNewWord();
                }
            }
        });
        p.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent e) { p.requestFocusInWindow(); }
        });
        return p;
    }

    private void updateHP() {
        String h = "HP: "; for (int i = 0; i < 5; i++) h += (i < hp) ? "💛" : "♡";
        hpLabel.setText(h);
    }

    private JPanel createHowToScreen() { 
        JPanel p = new JPanel(new GridBagLayout()); p.setBackground(Color.DARK_GRAY);
        JLabel l = new JLabel("Java単語を正しくタイプしましょう！");
        l.setFont(new Font("MS Gothic", Font.BOLD, 30)); l.setForeground(Color.WHITE);
        JButton b = new JButton("戻る"); b.addActionListener(e->cardLayout.show(mainPanel,"TITLE"));
        GridBagConstraints gbc = new GridBagConstraints(); gbc.gridy=0; p.add(l, gbc);
        gbc.gridy=1; gbc.insets=new Insets(30,0,0,0); p.add(b, gbc);
        return p;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}