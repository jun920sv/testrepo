package Typing.Frame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Typing.Controller.ActionListener.CtrlExitTitle;
import Typing.Controller.ActionListener.CtrlJava;

public class Mode extends JPanel {
    private Image backgroundImage;
    private final Color btnColor = new Color(40, 44, 52, 220);

    // テキストデータ（外部に切り出しやすいよう配列で保持）
    private final String[] MODE_TITLES = {"Javaモード", "クエストモード"};
    private final String[] MODE_DESCS = {"Javaの基本単語を練習します", "To Be Continued 乞うご期待！"};

    // 外部のロジックからボタンをフックできるように public で公開
    public JButton[] modeButtons = new JButton[MODE_TITLES.length];
    public JButton backButton;

    public Mode(CardLayout layout, JPanel panel) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;

        // 背景画像の読み込み
        try {
            backgroundImage = ImageIO.read(new File("3.PNG"));
        } catch (Exception e) {
            System.out.println("背景画像 3.PNG が見つかりません。");
        }

        // タイトルラベル
        JLabel titleLabel = new JLabel("モードを選択してください");
        titleLabel.setFont(new Font("MS Gothic", Font.BOLD, 40));
        titleLabel.setForeground(Color.WHITE);
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 40, 0);
        add(titleLabel, gbc);

        // 各モードボタンの生成と配置
        for (int i = 0; i < MODE_TITLES.length; i++) {
            modeButtons[i] = createModeButton(MODE_TITLES[i], MODE_DESCS[i]);
            gbc.gridy = i + 1;
            gbc.anchor = GridBagConstraints.CENTER;
            gbc.insets = new Insets(10, 0, 10, 0);
            add(modeButtons[i], gbc);
            
            if (i == 0) {
                modeButtons[0].addActionListener(new CtrlJava(layout, panel));
            }
        }

        // 戻るボタンの生成
        backButton = new JButton("← 戻る");
        backButton.setFont(new Font("MS Gothic", Font.PLAIN, 18));
        backButton.setForeground(Color.BLACK);
        backButton.setContentAreaFilled(true);
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.addActionListener(new CtrlExitTitle(layout, panel));

        gbc.gridy = MODE_TITLES.length + 1;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.insets = new Insets(30, 0, 0, 0);
        add(backButton, gbc);
    }

    /**
     * 美しいボタンのデザインを生成するメソッド
     */
    private JButton createModeButton(String title, String description) {
        JButton btn = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(getBackground());
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
                
                // タイトルの描画（常に白）
                g2.setColor(Color.WHITE);
                g2.setFont(new Font("MS Gothic", Font.BOLD, 32));
                FontMetrics fm = g2.getFontMetrics();
                g2.drawString(title, (getWidth() - fm.stringWidth(title)) / 2, 45);
                
                // 説明文の描画（「To Be Continued」で始まる場合だけ赤文字にする）
                if (description.startsWith("To Be Continued")) {
                    g2.setColor(Color.RED);
                } else {
                    g2.setColor(Color.WHITE);
                }
                
                g2.setFont(new Font("MS Gothic", Font.PLAIN, 16));
                FontMetrics fmDesc = g2.getFontMetrics();
                g2.drawString(description, (getWidth() - fmDesc.stringWidth(description)) / 2, 75);
                g2.dispose();
            }
        };

        // ボタンの基本装飾
        btn.setPreferredSize(new Dimension(700, 110));
        btn.setBackground(btnColor);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // マウスホバー時のハイライト効果
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) { btn.setBackground(btnColor.brighter()); }
            public void mouseExited(MouseEvent e) { btn.setBackground(btnColor); }
        });

        return btn;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            g.setColor(new Color(0, 0, 0, 80));
            g.fillRect(0, 0, getWidth(), getHeight());
        } else {
            setBackground(new Color(20, 20, 30));
        }
    }
}