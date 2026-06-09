package test.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import test.controller.LoginButtonLisner;

public class LoginPanel extends JPanel {

	public JButton loginBtn; 
    public JButton clearBtn;
	JPanel titlePanel;
	JPanel entryPanel;
	JPanel buttonPanel;
	
	// イベント処理で入力値を取得するため、フィールド変数として定義
	JTextField userField;
	JPasswordField passField;
	
	
	public LoginPanel(MainCardPanel mcp) {

		// メインパネル（背景色の設定）
		this.titlePanel = new JPanel();
		this.entryPanel = new JPanel();
		this.buttonPanel = new JPanel();

		// タイトル
		JLabel titleLabel = new JLabel("ログイン画面");
		titleLabel.setFont(new Font("SansSerif", Font.BOLD, 22));
		this.titlePanel.add(titleLabel);

		// ユーザID ラベルと入力欄
		JLabel userLabel = new JLabel("ユーザーID:");
		userLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		// インスタンス生成（15列）
		this.userField = new JTextField(15);
		
		JPanel namePanel = new JPanel();
		namePanel.add(userLabel);
		namePanel.add(userField);
		this.entryPanel.add(namePanel);

		// パスワード ラベルと入力欄
		JLabel passLabel = new JLabel("パスワード:");
		passLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));

		// インスタンス生成（15列）
		this.passField = new JPasswordField(15);
		JPanel passPanel = new JPanel();
		passPanel.add(passLabel);
		passPanel.add(passField);
		this.entryPanel.add(passPanel);

		// クリアボタン
		this.clearBtn = new JButton("クリア");
		this.clearBtn.setBackground(new Color(188, 143, 143));
		this.clearBtn.setForeground(Color.WHITE);
		this.clearBtn.setFocusPainted(false);
		this.clearBtn.setFont(new Font("SansSerif", Font.BOLD, 18));
		this.buttonPanel.add(this.clearBtn);
		
		// ログインボタン
		this.loginBtn = new JButton("ログイン");
		this.loginBtn.setBackground(new Color(123, 104, 238));
		this.loginBtn.setForeground(Color.WHITE);
		this.loginBtn.setFocusPainted(false);
		this.loginBtn.setFont(new Font("SansSerif", Font.BOLD, 18));
		this.buttonPanel.add(this.loginBtn);		
		
		// --------------------------------------------------
		// イベントリスナーの追加
		// --------------------------------------------------
		
		// ログインボタンの処理
		this.loginBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginButtonLisner loginblsn = new LoginButtonLisner(userField,passField,mcp);
			}
//		
		});

		// クリアボタンの処理
		clearBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
				// 入力欄を空にする
				userField.setText("");
				passField.setText("");
			}
		});
		
		// レイアウト設定
		this.setLayout(new GridLayout(3,1));
		entryPanel.setLayout(new GridLayout(2,1));
		this.add(titlePanel);
		this.add(entryPanel);
		this.add(buttonPanel);
	}

	public void initialization() {
		this.userField.setText("");
		this.passField.setText("");

	}
}