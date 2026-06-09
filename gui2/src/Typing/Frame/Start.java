package Typing.Frame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Typing.Controller.KeyListener.CtrlPlay;

public class Start extends JPanel {
    public JLabel label;

    public Start(CardLayout layout, JPanel panel) { // 【クリーンアップ】JavaQuestへの依存を完全に排除
        setLayout(new GridBagLayout());
        setBackground(new Color(20, 20, 30)); // 雰囲気に合わせて少し暗い背景に

        label = new JLabel("SPACEキーで開始");
        label.setFont(new Font("MS Gothic", Font.BOLD, 30));
        label.setForeground(Color.WHITE);
        add(label);
        
        setFocusable(true);
        
        this.addKeyListener(new CtrlPlay(layout,panel));
        
        // 画面が表示された時にキーボードの入力を受け付けるための必須処理
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) { 
                requestFocusInWindow(); 
            }
        });
    }
}