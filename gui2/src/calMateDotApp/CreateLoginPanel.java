package calMateDotApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CreateLoginPanel extends JPanel {
	private Map<String, String> account;

	public CreateLoginPanel(CreateAllPanel panel) {
		//画面２分割
		setLayout(new GridLayout(1, 2));

		//右パネル		
		JPanel loginPanel = new JPanel();
		loginPanel.setLayout(new BorderLayout());
		
		//タイトル(NORTH)/
		JPanel northPanel = new JPanel();
		northPanel.setPreferredSize(new Dimension(500, 160));

		JLabel title = new JLabel("ログイン");
		title.setFont(new Font("Meiryo UI", Font.PLAIN, 35));//フォント変更
		title.setBorder(BorderFactory.createEmptyBorder(100, 0, 0, 0));//余白で位置調整
		northPanel.add(title, BorderLayout.CENTER);

		//入力画面CENTER
		JPanel centerPanel = new JPanel();

		centerPanel.setPreferredSize(new Dimension(500, 240));

		centerPanel.setLayout(new GridLayout(2, 0, 20, 20));//余白で調整
		JPanel user = new JPanel(new BorderLayout());
		JPanel pass = new JPanel(new BorderLayout());
		JLabel userLabel = new JLabel("ユーザーネーム");
		userLabel.setFont(new Font("Meiryo UI", Font.PLAIN, 20));
		JTextField userField = new JTextField();
		userField.setFont(new Font("Meiryo UI", Font.PLAIN, 18));
		JLabel passLabel = new JLabel("パスワード");
		passLabel.setFont(new Font("Meiryo UI", Font.PLAIN, 20));
		JPasswordField passField = new JPasswordField();
		passField.setFont(new Font("Meiryo UI", Font.PLAIN, 18));
		user.add(userLabel, BorderLayout.NORTH);
		user.add(userField);
		pass.add(passLabel, BorderLayout.NORTH);
		pass.add(passField);
		centerPanel.add(user);
		centerPanel.add(pass);

		centerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		user.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		pass.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

		//確定ボタンSOUTH
		JPanel southPanel = new JPanel();
		southPanel.setPreferredSize(new Dimension(500, 200));

		JButton loginButton = new JButton("ログイン");
		loginButton.setPreferredSize(new Dimension(180, 45));
		//enterで確定処理
		javax.swing.KeyStroke enter = javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0);

		loginButton.getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW).put(enter, "ログイン");

		loginButton.getActionMap().put("ログイン", new javax.swing.AbstractAction() {

			public void actionPerformed(java.awt.event.ActionEvent e) {
				loginButton.doClick();
			}
		});
		loginButton.addActionListener(_ -> {
			String inputUserName = userField.getText();
			char[] password = passField.getPassword();
			userField.setText("");
			passField.setText("");
			if (loginCheck(inputUserName, password)) {
				panel.showPanel("mainPnl");
			} else {
				JOptionPane.showMessageDialog(this, "入力内容に誤りがあります。\n再入力をお願いします。");
			}
			Arrays.fill(password, '0');
		});

		// パネル着色
		Color lightPink = new Color(255, 240, 245);
		northPanel.setBackground(lightPink);
		centerPanel.setBackground(lightPink);
		user.setBackground(lightPink);
		pass.setBackground(lightPink);
		southPanel.setBackground(lightPink);
		//ボタン着色
		loginButton.setBackground(new Color(255,165,165));
		
		southPanel.add(loginButton);

		loginPanel.add(northPanel, BorderLayout.NORTH);
		loginPanel.add(centerPanel, BorderLayout.CENTER);
		loginPanel.add(southPanel, BorderLayout.SOUTH);

		add(loginPanel);
	}

	private boolean loginCheck(String inputUserName, char[] password) {
		account = new AccountList().getAccountInfo(inputUserName);
		if (account == null || account.get(inputUserName).length() != password.length) {
			return false;
		}
		for (int i = 0; i < password.length; i++) {
			char[] accountPass = account.get(inputUserName).toCharArray();
			if (accountPass[i] != password[i]) {
				Arrays.fill(accountPass, '0');
				return false;
			}
		}
		return true;
	}
}
