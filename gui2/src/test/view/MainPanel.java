package test.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import test.User;
import test.controller.MenuButtonListener;
import test.service.LoginService;

public class MainPanel extends JPanel {

	JButton logoutBtn;
	JButton shiftBtn;
	JButton inputBtn;
	User user;

	private LocalDateTime dateTime;

	public ServiceCardPanel serviceCardPanel;

	private LoginService loginService;

	private CardLayout cardLayout;

	private JPanel cardPanel;
	
	public MainCardPanel MCP; 

	public MainPanel(MainCardPanel MCP) {

		this.setLayout(new BorderLayout());

		JPanel titlePanel = new JPanel();//ヘッダー部分パネル
		JPanel inTitlePanel = new JPanel();//ヘッダーの文字位置調整パネル
		JPanel inPanel = new JPanel();//出勤申請・シフト表ボタン用パネル
		this.MCP = MCP;
		loginService = new LoginService();

		//ServiceCardPanelはnewするかどうか検討中
		// 各画面を追加
		serviceCardPanel = new ServiceCardPanel(this);
		// 中央に配置
		this.add(serviceCardPanel, BorderLayout.CENTER);

		titlePanel.add(inTitlePanel);
		inTitlePanel.setLayout(new BorderLayout());

		//イベント日時を設定
//		this.dateTime = LocalDateTime.of(2026, 05, 22, 7, 0, 0);
		this.dateTime = LocalDateTime.of(2026, 07,24, 10, 0, 0);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M月d日（E）", Locale.JAPANESE);
		String formattedDate = this.dateTime.format(formatter);
		JLabel dateLabel = new JLabel(formattedDate);
		JLabel eventName = new JLabel("動けばヨシ！ライブ2026 SUMMER",SwingConstants.CENTER);
//		eventName.setFont(new Font("MS_GOTHIC",Font.PLAIN,15));
		dateLabel.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 22));
		inTitlePanel.add(dateLabel, BorderLayout.CENTER);
		inTitlePanel.add(eventName,BorderLayout.NORTH);
		this.logoutBtn = new JButton("ログアウト");
		this.logoutBtn.setBackground(new Color(188, 143, 143));
		this.logoutBtn.setFont(new Font("SansSerif", Font.BOLD, 14));

		this.logoutBtn.setForeground(Color.WHITE);
		this.shiftBtn = new JButton("シフト表");
		this.shiftBtn.setBackground(new Color(123, 104, 238));
		this.shiftBtn.setForeground(Color.WHITE);
		this.inputBtn = new JButton("出勤申請");
		this.inputBtn.setBackground(new Color(0, 255, 0));
		this.inputBtn.setForeground(Color.WHITE);
		
		MenuButtonListener MBL = new MenuButtonListener();

		shiftBtn.addActionListener(e -> MBL.changePanel(serviceCardPanel,"シフト画面"));
		inputBtn.addActionListener(e -> MBL.changePanel(serviceCardPanel, "入力画面"));

		inTitlePanel.add(this.logoutBtn, BorderLayout.EAST);//ログアウトボタンの位置

		inPanel.setLayout(new GridLayout(1, 2));
		inPanel.add(this.inputBtn);
		inputBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
		inPanel.add(this.shiftBtn);
		shiftBtn.setFont(new Font("SansSerif", Font.BOLD, 16));

		this.add(titlePanel, BorderLayout.NORTH);
		this.add(inPanel, BorderLayout.SOUTH);

		// ログアウト処理
		logoutBtn.addActionListener(e -> {
			// ログアウトする（ID・PASSをNULL）
			MBL.logout(this);
			// ラジオボタンOFF
			
		});
	}

	//指示された名前の画面に切り替える
	public void showCard(String name) {
		cardLayout.show(cardPanel, name);
	}

	public LocalDateTime getDateTime() {
		return this.dateTime;
	}

	public void logout() {
		this.user = null;
	}

	public User getLoginUser() {
		return this.user;
	}
	public void setUser(User u) {
		this.user = u;
		this.serviceCardPanel.inputPanel.setName(u);
	}
}
