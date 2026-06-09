package Typing.Frame;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import Typing.Controller.ActionListener.CtrlRanking;
import Typing.Controller.ActionListener.CtrlRestart;
import Typing.Controller.ActionListener.CtrlTitle;
import Typing.Model.Score;
import Typing.Model.TimerManager;

public class Result extends JPanel{
    private Image backgroundImage;
    private Score score;
    private String scorePart;
    private String accuracyPart;
    private String missPart;
    private JLabel detailLabel;       // staticを削除
    private JLabel rankingLabel;       // staticを削除
    private int baseWidth;
    private String scoreText;
    
    Timer timer = TimerManager.timerInstance().getTimer();

    public Result(){
        // 背景画像の読み込み
        try {
            File bgFile = new File("3.png");
            if (bgFile.exists()) {
                backgroundImage = ImageIO.read(bgFile);
            }
        } catch (IOException e) {
            System.err.println("P9: 背景画像の読み込みに失敗しました。");
        }
    }

    public JPanel ResultPanel(CardLayout layout, JPanel panel, Score s) { // ★カッコの中に「Score s」を入れる
    	score = s;
        // メインパネル（背景描画付き）
        JPanel mainPanel = new JPanel(new BorderLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage != null) {
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                } else {
                    g.setColor(new Color(13, 94, 117));
                    g.fillRect(0, 0, getWidth(), getHeight());
                }
            }
        };

        // --- CENTER: 結果表示スコアボード ---
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 30));
        centerPanel.setOpaque(false);
        centerPanel.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));

        JPanel scoreBoard = new JPanel(new GridBagLayout());
        scoreBoard.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();

        baseWidth = 600;

        // 1. ランキング順位表示
        String ranking = String.format("ランキング：%d位",score.rankSQL());
        rankingLabel = createInfoLabel(ranking, baseWidth, 120);
        rankingLabel.setFont(new Font("MS Gothic", Font.BOLD, 40));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 30, 0);
        scoreBoard.add(rankingLabel, gbc);

        // 2. 詳細スコア表示（HTMLを使って改行を表現）
       /* String template = "<html><div style='text-align: center; line-height: 150%;'>"
                + "SCORE : %05d <br>"
                + "<br>"
                + "正確性 : %.1f %%<br>"
                + "<br>"
                + "ミス数 : %d 回<br>";
        */
        
     // --- 2. 詳細スコア表示（HTMLを使って改行を表現） ---
        // 【修正ポイント】数字だけを個別に、安全にフォーマットします

        scorePart = String.format("%05d", score.getScore());
        accuracyPart = String.format("%.1f", score.getAccuracy());
        missPart = String.format("%d", score.getMiss());
        
        // 完成した数字を、HTML文字列の中に安全に埋め込みます（templateはもう使いません）
        scoreText = "<html><div style='text-align: center; line-height: 150%;'>"
        		+ "SCORE : " + scorePart + " <br>"
        		+ "<br>"
        		+ "正確性 : " + accuracyPart + " %<br>"
        		+ "<br>"
        		+ "ミス数 : " + missPart + " 回<br>"
        		+ "</div></html>";
        // 【画像の箇所の修正】エラーが出ていた部分を新しい scoreText で上書きします
        detailLabel = createInfoLabel(scoreText, baseWidth, 300);
        detailLabel.setFont(new Font("MS Gothic", Font.BOLD, 28));
        
        /*
        String scoreText = String.format(template, s.getScore(),s.getAccuracy(),s.getMiss());
        JLabel detailLabel = createInfoLabel(scoreText, baseWidth, 300);
        detailLabel.setFont(new Font("MS Gothic", Font.BOLD, 28)); 
*/
        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 0, 0);
        scoreBoard.add(detailLabel, gbc);

        centerPanel.add(scoreBoard);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // --- SOUTH: ボタンエリア ---
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 40));
        southPanel.setOpaque(false);

        southPanel.add(createLuxuryButton("もう一度遊ぶ", new Color(144, 238, 144), new Color(40, 40, 40),new CtrlRestart(layout, panel, score)));
        southPanel.add(createLuxuryButton("タイトルに戻る", new Color(245, 225, 210), new Color(40, 40, 40),new CtrlTitle(layout, panel, score)));
        southPanel.add(createLuxuryButton("ランキングを見る", new Color(13, 94, 117), Color.WHITE,new CtrlRanking(layout, panel)));

        mainPanel.add(southPanel, BorderLayout.SOUTH);
        return mainPanel;
    }
    
    public void updateScore(Score newScore) {
        this.score = newScore;
        
        // 1. 各パーツの文字列を安全に再フォーマット
        this.scorePart = String.format("%05d", score.getScore());
        this.accuracyPart = String.format("%.1f", score.getAccuracy());
        this.missPart = String.format("%d", score.getMiss());
        
        this.scoreText = "<html><div style='text-align: center; line-height: 150%;'>"
                + "SCORE : " + scorePart + " <br>"
                + "<br>"
                + "正確性 : " + accuracyPart + " %<br>"
                + "<br>"
                + "ミス数 : " + missPart + " 回<br>"
                + "</div></html>";
                
        // 2. ラベルのテキストを更新
        if (detailLabel != null) {
            detailLabel.setText(scoreText);
        }
        if (rankingLabel != null) {
            rankingLabel.setText(String.format("ランキング：%d位", score.rankSQL()));
        }
        
        // 3. 画面の再描画をシステムに要求（文字化けや表示の遅れを防ぐ）
        this.revalidate();
        this.repaint();
    }
    
    
    /**
     * 半透明の角丸ラベルを作成するメソッド
     */
    private static JLabel createInfoLabel(String text, int width, int height) {
        JLabel label = new JLabel(text, SwingConstants.CENTER) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(new Color(255, 255, 255, 180)); // 半透明の白
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
                g2.setColor(new Color(13, 94, 117));
                g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
                g2.dispose();
                super.paintComponent(g);
            }
        };
        label.setPreferredSize(new Dimension(width, height));
        label.setForeground(new Color(40, 40, 40));
        return label;
    }

    /**
     * 豪華なグラデーションボタンを作成するメソッド
     */
    private JButton createLuxuryButton(String text, Color baseColor, Color textColor , ActionListener listener) {
        JButton button = new JButton(text) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                Color darker = baseColor.darker();
                g2.setPaint(new GradientPaint(0, 0, baseColor, 0, getHeight(), darker));
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
                g2.setColor(new Color(0, 0, 0, 60));
                g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 30, 30);
                g2.dispose();
                super.paintComponent(g);
            }
        };
        button.setPreferredSize(new Dimension(220, 60));
        button.setFont(new Font("MS Gothic", Font.BOLD, 18));
        button.setForeground(textColor);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.addActionListener(listener);
        return button;
    }
}