package calMateDotApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

// ログイン画面（簡易表示）
public class CreateOpeningPanel extends JPanel{
	public CreateOpeningPanel(CreateAllPanel panel) {
		JPanel logPnl = new JPanel();
		logPnl.setLayout(new GridLayout(1, 2));
		String address = "pic_01/login/login.png";
		
		//左側のパネル
        JPanel leftPanel = new JPanel(new BorderLayout());
        /*
        ImageIcon logImg = 
        		new ImageIcon("pic_01/login/login.png"); 
        
        Image img = logImg.getImage();
        Image scaledImg = img.getScaledInstance(600, 700, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledImg);
        
     // 縮尺した scaledIcon を JLabel にセット
        JLabel imageLabel = new JLabel(scaledIcon);
        
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        leftPanel.add(imageLabel, BorderLayout.CENTER);
        */
     // 縮尺した scaledIcon を JLabel にセット
        
        Adjustment.imageAdjustment(leftPanel, address);
        
        // 右側のパネル
        JPanel rightPanel = new CreateLoginPanel(panel);
        rightPanel.setBackground(Color.LIGHT_GRAY); // 境目確認用
        
        
        // メインパネルに載せる
        logPnl.add(leftPanel);
        logPnl.add(rightPanel);

        this.setLayout(new BorderLayout());
        this.add(logPnl, BorderLayout.CENTER); 
    }
}