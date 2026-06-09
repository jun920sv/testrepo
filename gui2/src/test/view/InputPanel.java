package test.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import test.ShiftType;
import test.User;
import test.controller.ClearButtonListener;
import test.controller.SendButtonListener;

public class InputPanel extends JPanel {

	JLabel showNameLabel;
	JRadioButton radio1;
	JRadioButton radio2;
	JRadioButton radio3;
	JLabel countMorningLabel;
	JLabel countDayLabel;
	JLabel countNightLabel;
	JButton sendButton;
	JButton clearButton;
	MainPanel mp;
	ButtonGroup group;

	public InputPanel(MainPanel mainPanel) {

		this.mp = mainPanel;

		// 自身のレイアウトをGridBagLayoutに設定
		this.setLayout(new GridBagLayout());

		Font largeFont = new Font("SansSerif", Font.PLAIN, 20); // 名前文字用
		Font raidButtonFont = new Font("SansSerif", Font.PLAIN, 18); // ラジオボタン用

		JPanel namePanel = new JPanel();
		JLabel nameLabel = new JLabel("名前：");
		//名前の部分は引数に
		this.showNameLabel = new JLabel("");
		nameLabel.setFont(largeFont);
		showNameLabel.setFont(largeFont);

		namePanel.add(nameLabel);
		namePanel.add(showNameLabel);

		JPanel radioButtonPanel = new JPanel();
		radioButtonPanel.setLayout(new GridLayout(3, 2, 10, 5)); // 隙間を少し空ける
		this.radio1 = new JRadioButton("1：朝　07-15");
		this.radio2 = new JRadioButton("2：昼　12-20");
		this.radio3 = new JRadioButton("3：晩　14-22");

		this.group = new ButtonGroup();
		group.add(this.radio1);
		group.add(this.radio2);
		group.add(this.radio3);

		this.countMorningLabel = new JLabel("　残：" + ShiftType.morning.getCapacity());
		this.countDayLabel = new JLabel("　残：" + ShiftType.day.getCapacity());
		this.countNightLabel = new JLabel("　残：" + ShiftType.night.getCapacity());

		radioButtonPanel.add(this.radio1);
		radioButtonPanel.add(this.countMorningLabel);
		radioButtonPanel.add(this.radio2);
		radioButtonPanel.add(this.countDayLabel);
		radioButtonPanel.add(this.radio3);
		radioButtonPanel.add(countNightLabel);

		this.radio1.setFont(raidButtonFont);
		this.radio2.setFont(raidButtonFont);
		this.radio3.setFont(raidButtonFont);
		this.countMorningLabel.setFont(raidButtonFont);
		this.countDayLabel.setFont(raidButtonFont);
		this.countNightLabel.setFont(raidButtonFont);

		this.radio1.setIconTextGap(10);
		this.radio2.setIconTextGap(10);
		this.radio3.setIconTextGap(10);

		JPanel sendButtonPanel = new JPanel();
		this.sendButton = new JButton("送信");
		this.sendButton.setBackground(new Color(255, 105, 180));
		this.sendButton.setForeground(Color.WHITE);
		this.clearButton = new JButton("出勤取り消し");
		this.sendButton.setFont(new Font("SansSerif", Font.BOLD, 14));
		this.clearButton.setBackground(Color.RED);
		this.clearButton.setForeground(Color.WHITE);
		this.clearButton.setFont(new Font("SansSerif", Font.BOLD, 14));
		sendButtonPanel.add(clearButton);
		sendButtonPanel.add(this.sendButton);
		// 送信ボタンが押された瞬間に材料を投げ込む
		SendButtonListener controller = new SendButtonListener();

		this.sendButton.addActionListener(e -> {
			ShiftType st;
			if (radio1.isSelected()) {
				st = ShiftType.morning;
			} else if (radio2.isSelected()) {
				st = ShiftType.day;
			} else if (radio3.isSelected()) {
				st = ShiftType.night;
			} else {
				JOptionPane.showMessageDialog(null, "出勤時間を選択してください", "メッセージ", JOptionPane.ERROR_MESSAGE);
				return;
			}
			//ここにメインパネルから取ってきた時間を入れる
			controller.handleSend(this.mp, st);

		});
		
		this.clearButton.addActionListener(new ClearButtonListener(this.mp));
		
		// 画面レイアウトの配置設定
		GridBagConstraints gbc = new GridBagConstraints();
		// 共通設定：コンポーネントを広げず、縦横の余白を均等に分配する
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.gridx = 0; // 列位置はすべて0固定

		// 1行目：名前パネル（中央配置）
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.CENTER;
		this.add(namePanel, gbc); //「this(自分自身)」に追加

		// 2行目：ラジオボタンパネル（左寄せのまま中央に配置したい場合は WEST）
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new java.awt.Insets(0, 30, 0, 0);
		this.add(radioButtonPanel, gbc);

		// 3行目：送信ボタンパネル（中央配置）
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		// --- 追加注意：次のコンポーネントに影響が出ないよう余白をリセット ---
		gbc.insets = new java.awt.Insets(0, 0, 0, 0);
		this.add(sendButtonPanel, gbc);
		// --------------------------------------------------
	}
	// ラジオボタンをクリアするメソッド (永松が追加しました）

	public void clearRadio() {
		this.group.clearSelection();
	}

	public void update() {
		this.countMorningLabel.setText("　残：" + ShiftType.morning.getCapacity());
		this.countDayLabel.setText("　残：" + ShiftType.day.getCapacity());
		this.countNightLabel.setText("　残：" + ShiftType.night.getCapacity());

		if (ShiftType.morning.getCapacity() <= 0) {
			this.radio1.setEnabled(false);
		}else {
			this.radio1.setEnabled(true);
		}
		if (ShiftType.day.getCapacity() <= 0) {
			this.radio2.setEnabled(false);
		}else {
			this.radio2.setEnabled(true);
			
		}
		if (ShiftType.night.getCapacity() <= 0) {
			this.radio3.setEnabled(false);
		}else {
			this.radio3.setEnabled(true);
			
		}
		if (!radio1.isEnabled() && !radio2.isEnabled() && !radio3.isEnabled()) {
			this.sendButton.setEnabled(false);
		}else {
			this.sendButton.setEnabled(true);
			
		}

		this.clearRadio();
		this.repaint();
	}

	public void setName(User u) {
		this.showNameLabel.setText(u.getFullName());
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(this.mp.getLoginUser().getShiftType()== null) {
			this.clearButton.setEnabled(false);
		}else {
			this.clearButton.setEnabled(true);
		}
	}

}
