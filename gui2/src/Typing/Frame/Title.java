package Typing.Frame;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import Typing.Controller.ActionListener.CtrlMode;
import Typing.Controller.ActionListener.CtrlRanking2;
import Typing.Controller.ActionListener.CtrlUse;

public class Title {
    private Image backgroundImage;
    private Image heroImage;
    CardLayout layout;
    JPanel panel;

    public Title(CardLayout layer, JPanel pane) {
        // 画像の読み込み処理
        try {
            File bgFile = new File("8.png");
            File heroFile = new File("Javanyan.png");

            if (bgFile.exists()) backgroundImage = ImageIO.read(bgFile);
            if (heroFile.exists()) heroImage = ImageIO.read(heroFile);
        } catch (IOException e) {
            System.out.println("画像読み込みエラー: " + e.getMessage());
        }
        
        layout = layer;
        panel = pane;
        
    }

    public JPanel TitlePanel() {
        // 背景とメイン描画を担うパネル
        JPanel mainPanel = new JPanel(new BorderLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                // 描画を綺麗にする設定
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

                // 1. 背景画像の描画
                if (backgroundImage != null) {
                    g2d.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                } else {
                    g2d.setColor(new Color(13, 94, 117));
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                }

                // 2. ヒーロー画像の描画（中央付近）
                if (heroImage != null) {
                    int heroW = 500; 
                    int heroH = 250;
                    g2d.drawImage(heroImage, (getWidth() - heroW) / 2, 250, heroW, heroH, this);
                }

                // 3. アーチテキスト（タイトル）の描画
                drawArchText(g2d, "タイピングヒーロー", getWidth() / 2, 750, 500, 80);
            }
        };

        // ボタンを配置する南側のパネル
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 50));
        southPanel.setOpaque(false); // 背景を透かす

        southPanel.add(createStyledButton("モードを選ぶ",new CtrlMode(layout, panel)));
        southPanel.add(createStyledButton("ランキング",new CtrlRanking2(layout,panel)));
        southPanel.add(createStyledButton("遊び方",new CtrlUse(layout,panel)));
        
        
        

        mainPanel.add(southPanel, BorderLayout.SOUTH);

        return mainPanel;
    }

    /**
     * テキストを扇状（アーチ型）に描画するメソッド
     */
    private void drawArchText(Graphics2D g2d, String text, int centerX, int centerY, int radius, int fontSize) {
        g2d.setFont(new Font("MS Gothic", Font.BOLD, fontSize));
        g2d.setColor(Color.WHITE); // 文字色
        
        double spreadAngle = Math.PI * 0.35; // アーチの広がり具合
        double startAngle = -Math.PI / 2 - (spreadAngle / 2);
        double angleStep = spreadAngle / (text.length() - 1);

        for (int i = 0; i < text.length(); i++) {
            double angle = startAngle + i * angleStep;
            int x = (int) (centerX + radius * Math.cos(angle));
            int y = (int) (centerY + radius * Math.sin(angle));

            AffineTransform old = g2d.getTransform();
            g2d.translate(x, y);
            g2d.rotate(angle + Math.PI / 2);
            g2d.drawString(String.valueOf(text.charAt(i)), 0, 0);
            g2d.setTransform(old);
        }
    }

    /**
     * デザインされたボタンを作成する
     */
    private JButton createStyledButton(String text, ActionListener listener) {
        JButton btn = new JButton(text);
        btn.setPreferredSize(new Dimension(220, 60));
        btn.setFont(new Font("MS Gothic", Font.BOLD, 18));
        btn.setBackground(Color.WHITE);
        btn.setForeground(new Color(13, 94, 117));
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createLineBorder(new Color(13, 94, 117), 3));
        btn.addActionListener(listener);
        return btn;
    }
}
