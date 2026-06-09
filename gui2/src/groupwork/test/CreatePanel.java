package groupwork.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

import groupwork.test.controller.KeyAction;
import groupwork.test.controller.StatusManager;

public class CreatePanel extends JPanel {
	protected int selectedIndex = 0;
	StatusManager sm = new StatusManager();
	protected JTextArea upArea;
	protected JTextArea downArea;
	protected JFrame f;
	//■5/11 storyArea choiceAnd のフィールド化｜目的：ボタン押下時の対応に必要なため
	protected JTextArea storyArea;
	protected JPanel choiceAndCursorPanel;
	protected BackgroundPanel bgEDPanel;
	JLabel statusLabel1;
	JLabel statusLabel2;
	JLabel statusLabel3;
	JLabel statusLabel4;
	JLabel dayLabel;
	JPanel mainPanel;
	BackgroundPanel realBGPanel;
	BackgroundPanel OPPanel;
	JPanel userGuidePanel;
	public CreatePanel(JFrame f) {
		this.f = f;
		if (f != null) {
			System.out.println("Panel:fの中身はあります");
		} else {
			System.out.println("Panel:値が null です");
		}

		mainPanel = new JPanel();//背景画像入れる（ここに乗せるPanel・labelは背景透過させる）
		realBGPanel = createBgPanel(sm.getStory().getImagePath());
		OPPanel = createBgPanel("OP_01.png");
		this.setLayout(new BorderLayout());
		//		JPanel THIS = this;
		//		THIS = new JPanel(new BorderLayout());
		this.add(realBGPanel, BorderLayout.CENTER);
		realBGPanel.add(mainPanel);
		//		mainPanel.add(realBGPanel);
		//		mainPanel = createArtPanel();//背景画像set

		mainPanel.setLayout(new BorderLayout());//mainPanelのborderlayout化
		mainPanel.setBorder(new EmptyBorder(0, 50, 0, 50));
		//上から反時計回り

		JPanel contentPanel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		JPanel statusAndNamePanel = new JPanel();
		JPanel statusPanel = new JPanel();//ステータス数値欄
		//		JLabel statusLabel1 = new JLabel();//ステータス表示
		statusLabel1 = createStatusLabel1();
		//		JLabel statuslabel2 = new JLabel();//ステータス表示
		statusLabel2 = createStatusLabel2();
		//		JLabel statusLabel3 = new JLabel();//ステータス表示
		statusLabel3 = createStatusLabel3();
		//		JLabel statusLabel4 = new JLabel();//ステータス表示
		statusLabel4 = createStatusLabel4();
		JPanel statusNamePanel = new JPanel();//ステータス名欄
		JLabel statusNameLabel1 = new JLabel();//ステータス表示
		statusNameLabel1 = createStatusNameLabel1();
		JLabel statusNameLabel2 = new JLabel();//ステータス表示
		statusNameLabel2 = createStatusNameLabel2();
		JLabel statusNameLabel3 = new JLabel();//ステータス表示
		statusNameLabel3 = createStatusNameLabel3();
		JLabel statusNameLabel4 = new JLabel();//ステータス表示
		statusNameLabel4 = createStatusNameLabel4();
		statusNamePanel.setLayout(new BoxLayout(statusPanel, BoxLayout.LINE_AXIS));

		JPanel storyPanel = new JPanel();//本文表示欄

		choiceAndCursorPanel = new JPanel();//選択肢とカーソル

		userGuidePanel = new JPanel();//操作方法欄

		//		JPanel storyAndChoicePanel = new JPanel();

		JPanel dayAndStatusPanel = new JPanel(new BorderLayout());//日数&ステータス欄

		//■5/11 22:00		dayAndStatusPanel.setLayout(new BorderLayout());//日数ステータス欄のborderlayout化

		dayLabel = createDayLabel();//日数表示

		dayAndStatusPanel.add(dayLabel, BorderLayout.WEST);
		dayAndStatusPanel.add(statusAndNamePanel, BorderLayout.EAST);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		gbc.weighty = 0.0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.NORTH;
		gbc.insets = new Insets(30, 0, 10, 0);
		contentPanel.add(dayAndStatusPanel, gbc);

		// story
		gbc.gridy = 1;
		gbc.weighty = 2.0;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(0, 100, 0, 100);
		contentPanel.add(storyPanel, gbc);

		// choice
		gbc.gridy = 2;//行目に置く
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(20, 20, 20, 20);
		contentPanel.add(choiceAndCursorPanel, gbc);

		mainPanel.add(contentPanel, BorderLayout.CENTER);

		// 南側に固定表示
		mainPanel.add(userGuidePanel, BorderLayout.SOUTH);

		storyPanel.setBorder(new EmptyBorder(20, 0, 0, 0));

		JLabel storyLabel = new JLabel();//本文表示
		storyLabel = createStoryLabel();
		storyArea = createStoryArea();

		//上選択肢上カーソル、下選択肢下カーソル同士で横並びでくっつけた後に縦並び（間に空白作りたい）
		choiceAndCursorPanel.setLayout(new GridLayout(2, 1, 0, 0));

		choiceAndCursorPanel.setBorder(new EmptyBorder(10, 0, 0, 0));

		JPanel cursorPanel = new JPanel();//カーソル欄

		JPanel upCCPanel = new JPanel();

		upArea = createUpArea();
		downArea = createDownArea();
		setUpKeyBindings();
		updateSelection();
		storyArea = createStoryArea();
		//		KeyAction.setUpKeyBindings();
		//		KeyAction.updateSelection();

		upCCPanel.add(upArea);
		JPanel downCCPanel = new JPanel();
		downCCPanel.add(downArea);

		choiceAndCursorPanel.add(upCCPanel);//,BorderLayout.NORTH);
		choiceAndCursorPanel.add(downCCPanel);//,BorderLayout.SOUTH);

		cursorPanel.setLayout(new BoxLayout(cursorPanel, BoxLayout.PAGE_AXIS));
		cursorPanel.setBorder(new EmptyBorder(0, 0, 10, 50));

		userGuidePanel.setLayout(new BorderLayout());
		JLabel userGuideLabel = new JLabel();//操作方法を右に詰めるために
		userGuideLabel = createUserGuideLabel();
		userGuidePanel.add(userGuideLabel, BorderLayout.EAST);
		//■5/11 22:00		choiceAndCursorPanel.add(userGuidePanel);
		//■5/11 22:00		mainPanel.add(choiceAndCursorPanel, BorderLayout.SOUTH);

		JPanel status1Panel = new JPanel();
		JPanel status2Panel = new JPanel();
		JPanel status3Panel = new JPanel();
		JPanel status4Panel = new JPanel();
		status1Panel.setLayout(new BoxLayout(status1Panel, BoxLayout.PAGE_AXIS));
		status2Panel.setLayout(new BoxLayout(status2Panel, BoxLayout.PAGE_AXIS));
		status3Panel.setLayout(new BoxLayout(status3Panel, BoxLayout.PAGE_AXIS));
		status4Panel.setLayout(new BoxLayout(status4Panel, BoxLayout.PAGE_AXIS));
		status1Panel.add(statusNameLabel1);
		status1Panel.add(statusLabel1);
		status2Panel.add(statusNameLabel2);
		status2Panel.add(statusLabel2);
		status3Panel.add(statusNameLabel3);
		status3Panel.add(statusLabel3);
		status4Panel.add(statusNameLabel4);
		status4Panel.add(statusLabel4);
		//		上記でステータス（名前/数字）の表示を4つ作った

		statusAndNamePanel.setLayout(new GridLayout(1, 4, 10, 10));
		statusAndNamePanel.add(status1Panel);
		statusAndNamePanel.add(status2Panel);
		statusAndNamePanel.add(status3Panel);
		statusAndNamePanel.add(status4Panel);
		//		4つ横並びにする（s1 s2 s3 s4）
		//■5/11 22:00		mainPanel.add(dayAndStatusPanel, BorderLayout.NORTH);

		//		storyPanel.add(storyLabel);
		storyPanel.setLayout(new GridLayout(1, 1, 0, 0));
		storyPanel.add(storyArea);
		//■5/11 22:50 重複のため		storyPanel.setBorder(new EmptyBorder(10, 140, 0, 0));
		//■5/11 22:50		storyAndChoicePanel.setLayout(new GridLayout(2, 1, 0, 10));
		//■5/11 22:50		storyAndChoicePanel.add(storyPanel);
		//■5/11 22:50		storyAndChoicePanel.add(choiceAndCursorPanel);
		//■5/11 22:00 		mainPanel.add(storyAndChoicePanel, BorderLayout.CENTER);

		//		パネルの透明化
		statusNameLabel1.setOpaque(false);
		statusNameLabel2.setOpaque(false);
		statusNameLabel3.setOpaque(false);
		statusNameLabel4.setOpaque(false);
		statusLabel1.setOpaque(false);
		statusLabel2.setOpaque(false);
		statusLabel3.setOpaque(false);
		statusLabel4.setOpaque(false);
		dayLabel.setOpaque(false);
		storyLabel.setOpaque(false);

		contentPanel.setOpaque(false);
		//		realBGPanel.setOpaque(false);
		upCCPanel.setOpaque(false);
		downCCPanel.setOpaque(false);
		choiceAndCursorPanel.setOpaque(false);
		cursorPanel.setOpaque(false);
		dayAndStatusPanel.setOpaque(false);
		//		storyAndChoicePanel.setOpaque(false);
		statusAndNamePanel.setOpaque(false);
		userGuidePanel.setOpaque(false);

		status1Panel.setOpaque(false);
		status2Panel.setOpaque(false);
		status3Panel.setOpaque(false);
		status4Panel.setOpaque(false);
		storyPanel.setOpaque(false);
		mainPanel.setOpaque(false);
		this.setOpaque(false);
		setOPPanel();
		//		ここまで透明化

		//		BackgroundPanel bgPanel = new BackgroundPanel("BattleRain.png");
		//		bgPanel.setLayout(new BorderLayout());
		//		bgPanel.add(mainPanel, BorderLayout.CENTER);

		//		this.setLayout(new GridLayout(1, 1, 0, 0));
		//		this.add(mainPanel);

	}

	public int getSelectedIndex() {
		return selectedIndex;
	}

	public JTextArea getUpArea() {
		return upArea;
	}

	public JTextArea getDownArea() {
		return downArea;
	}

	public JTextArea getStoryArea() {
		return storyArea;
	}

	public JPanel getChoiceAndCursorPanel() {
		return choiceAndCursorPanel;
	}

	public void setSelectedIndex(int selectedIndex) {
		this.selectedIndex = selectedIndex;
	}

	public void setUpArea(String text) {
		this.upArea.setText(text);
		repaint();
	}

	public void setDownArea(String text) {
		this.downArea.setText(text);
		repaint();
	}

	public void setStoryArea(String text) {
//		int stop=text.length();	
//		String[]StringText = text.split("");
//		ArrayList <String>arrText = new ArrayList<String>();
//		
//		for (int i = 0; i < stop; i++) {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// 失敗したときの処理
//				e.printStackTrace();
//			}
//		arrText.add(StringText[i]);
//			
//		String showText = String.join("",arrText);
//		
//		this.storyArea.setText(showText);
//		repaint();
//			}
		this.storyArea.setText(text);
	}

	public void setStoryArea(String text, StatusManager sm) {
		this.storyArea.setText(text);

	}

	public void setChoiceAndCursorPanel(JPanel choiceAndCursorPanel) {
		this.choiceAndCursorPanel = choiceAndCursorPanel;
	}

	protected JLabel createStoryLabel() {
		JLabel storyLabel = new JLabel();
		storyLabel.setOpaque(false);//背景を透明に

		storyLabel.setText("仮の文章だよ");
		storyLabel.setFont(new Font("明朝体", Font.BOLD, 24));
		return storyLabel;
	}

	protected JTextArea createStoryArea() {
		JTextArea storyArea = new JTextArea();
		storyArea.setColumns(45);
		storyArea.setRows(10);
		storyArea.setWrapStyleWord(true);
		storyArea.setLineWrap(true);
		storyArea.setEditable(false);
		storyArea.setOpaque(false); // 背景透明
		storyArea.setFocusable(false);
		storyArea.setFont(new Font("明朝体", Font.BOLD, 22));
		storyArea.setForeground(Color.WHITE);
		storyArea.setSize(0, 0);
		storyArea.setText(sm.getStory().getText());
		repaint();
		return storyArea;
	}

	protected JLabel createDayLabel() {
		JLabel dayLabel = new JLabel();
		int intDay = sm.getDay();
		String day = Integer.toString(intDay);
		dayLabel.setText("Day：" + day);
		dayLabel.setFont(new Font("明朝体", Font.BOLD, 22));
		repaint();
		dayLabel.setOpaque(false);//背景を透明に
		dayLabel.setBackground(Color.red);
		dayLabel.setForeground(Color.WHITE);
		return dayLabel;
	}

	public void setDayLabel() {
		int intDay = sm.getDay();
		String day = Integer.toString(intDay);
		this.dayLabel.setText("Day：" + day);
		repaint();
	}

	protected JLabel createUpLabel() {
		JLabel upLabel = new JLabel();
		upLabel.setText("上の選択肢のシナリオを表示！");
		upLabel.setFont(new Font("明朝体", Font.BOLD, 22));
		upLabel.setForeground(Color.WHITE);
		repaint();
		upLabel.setOpaque(false);//背景を透明に
		return upLabel;
	}

	protected JTextArea createUpArea() {
		JTextArea upArea = new JTextArea(2, 44);
		upArea.setWrapStyleWord(true);
		upArea.setLineWrap(true);
		upArea.setEditable(false);
		upArea.setOpaque(false); // 背景透明
		upArea.setFocusable(false);
		//		upArea.setText("この戦場が終ってから、いちごオーレを飲みますか？\n（上選択肢）");36文字
		upArea.setText(sm.getStory().getChoiceAText());
		upArea.setFont(new Font("明朝体", Font.BOLD, 22));
		upArea.setForeground(Color.WHITE);
		return upArea;
	}

	protected JLabel createDownLabel() {
		JLabel upLabel = new JLabel();
		upLabel.setText("下の選択肢のシナリオを表示！");
		upLabel.setFont(new Font("明朝体", Font.BOLD, 22));
		upLabel.setForeground(Color.WHITE);
		repaint();
		upLabel.setOpaque(false);//背景を透明に
		return upLabel;
	}

	protected JTextArea createDownArea() {
		JTextArea downArea = new JTextArea(2, 44);
		downArea.setWrapStyleWord(true);
		downArea.setLineWrap(true);
		downArea.setEditable(false);
		downArea.setOpaque(false); // 背景透明
		downArea.setFocusable(false);
		downArea.setText(sm.getStory().getChoiceBText());
		downArea.setFont(new Font("明朝体", Font.BOLD, 22));
		downArea.setForeground(Color.WHITE);
		return downArea;
	}

	protected JLabel createUserGuideLabel() {
		JLabel downLabel = new JLabel();
		downLabel.setText("↑↓：選択　　Enter：決定");
		downLabel.setFont(new Font("明朝体", Font.PLAIN, 14));
		downLabel.setForeground(Color.WHITE);
		repaint();
		downLabel.setOpaque(false);//背景を透明に
		return downLabel;
	}

	protected JLabel createStatusNameLabel1() {
		JLabel status1 = new JLabel();
		status1.setText("物資");
		status1.setFont(new Font("明朝体", Font.BOLD, 24));
		status1.setForeground(Color.WHITE);
		repaint();
		status1.setOpaque(false);//背景透明
		return status1;
	}

	protected JLabel createStatusNameLabel2() {
		JLabel status2 = new JLabel();
		status2.setText("信頼");
		status2.setFont(new Font("明朝体", Font.BOLD, 24));
		status2.setForeground(Color.WHITE);
		repaint();
		status2.setOpaque(false);//背景透明
		return status2;
	}

	protected JLabel createStatusNameLabel3() {
		JLabel status3 = new JLabel();
		status3.setText("精神");
		status3.setFont(new Font("明朝体", Font.BOLD, 24));
		status3.setForeground(Color.WHITE);
		repaint();
		status3.setOpaque(false);//背景透明
		return status3;
	}

	protected JLabel createStatusNameLabel4() {
		JLabel status4 = new JLabel();

		status4.setText("弾薬");
		status4.setFont(new Font("明朝体", Font.BOLD, 24));
		status4.setForeground(Color.WHITE);
		repaint();
		status4.setOpaque(false);//背景透明
		return status4;
	}

	protected JLabel createStatusLabel1() {
		//		String s1 = Integer.toString(this.status1);
		JLabel status1 = new JLabel();

		status1.setText(Integer.toString(sm.getStatus1()));
		status1.setFont(new Font("明朝体", Font.BOLD, 24));
		status1.setForeground(Color.WHITE);
		repaint();
		status1.setOpaque(false);//背景透明
		return status1;
	}

	protected JLabel createStatusLabel2() {
		//		String s2 = Integer.toString(this.status2);
		JLabel status2 = new JLabel();
		status2.setText(Integer.toString(sm.getStatus2()));
		status2.setFont(new Font("明朝体", Font.BOLD, 24));
		status2.setForeground(Color.WHITE);
		repaint();
		status2.setOpaque(false);//背景透明
		return status2;
	}

	protected JLabel createStatusLabel3() {
		//		String s3 = Integer.toString(this.status3);
		JLabel status3 = new JLabel();
		status3.setText(Integer.toString(sm.getStatus3()));
		status3.setFont(new Font("明朝体", Font.BOLD, 24));
		status3.setForeground(Color.WHITE);
		repaint();
		status3.setOpaque(false);//背景透明
		return status3;
	}

	protected JLabel createStatusLabel4() {
		//		String s4 = Integer.toString(this.status4);
		JLabel status4 = new JLabel();
		status4.setText(Integer.toString(sm.getStatus4()));
		status4.setFont(new Font("明朝体", Font.BOLD, 24));
		status4.setForeground(Color.WHITE);
		repaint();
		status4.setOpaque(false);//背景透明
		return status4;
	}

	public void setStatusLabel1() {
		//		String s1 = Integer.toString(this.status1);

		this.statusLabel1.setText(Integer.toString(sm.getStatus1()));
		this.statusLabel1.setFont(new Font("明朝体", Font.BOLD, 24));
		this.statusLabel1.setForeground(Color.WHITE);
		this.statusLabel1.setOpaque(false);//背景透明
		repaint();
	}

	public void setStatusLabel2() {
		//		String s2 = Integer.toString(this.status2);
		statusLabel2.setText(Integer.toString(sm.getStatus2()));
		statusLabel2.setFont(new Font("明朝体", Font.BOLD, 24));
		statusLabel2.setForeground(Color.WHITE);
		statusLabel2.setOpaque(false);//背景透明
		repaint();

	}

	public void setStatusLabel3() {
		//		String s3 = Integer.toString(this.status3);

		statusLabel3.setText(Integer.toString(sm.getStatus3()));
		statusLabel3.setFont(new Font("明朝体", Font.BOLD, 24));
		statusLabel3.setForeground(Color.WHITE);
		statusLabel3.setOpaque(false);//背景透明
		repaint();

	}

	public void setStatusLabel4() {
		//		String s4 = Integer.toString(this.status4);

		statusLabel4.setText(Integer.toString(sm.getStatus4()));
		statusLabel4.setFont(new Font("明朝体", Font.BOLD, 24));
		statusLabel4.setForeground(Color.WHITE);
		statusLabel4.setOpaque(false);//背景透明
		repaint();

	}

	public void setBgPanel(String imagePath) {
		Image BackgroundImage = new ImageIcon(imagePath).getImage();
		System.out.println("画像投影します");
		realBGPanel.BackgroundImage = BackgroundImage;
		repaint();
		revalidate();
		System.out.println(imagePath + "がセット時読み込む画像");
		//		BackgroundPanel repaintPanel = paintComponent();
		//		this.realBGPanel = repaintPanel;
		//		realBGPanel.add(repaintPanel,BorderLayout.CENTER);
		//		this.add(realBGPanel,BorderLayout.CENTER);
		//		repaint();
		//		revalidate();
		//		this.setComponentZOrder(repaintPanel,this.getComponentCount());
		//		this.setComponentZOrder(this.realBGPanel,mainPanel.getComponentCount()-2);
		//		mainPanel.getComponentCount()-1から-2までがsameTopLevel
		//		this.getComponentCount()から-1までがsameTopLevel
		//		------------------------------------------------------------------------------------------
		//		addしてsetCompornentZOederで位置変更すればいいなあって考えてる
		//		→illegal component positionのエラーが出る
		//		→setComponentZOrderの使い方が掴めてない
		//		苦労の跡は残しとく↑
		//
		//		

	}

	public BackgroundPanel createBgPanel(String imagePath) {
		BackgroundPanel bgPanel = new BackgroundPanel(imagePath);
		System.out.println(imagePath + "が作るとき読み込む画像");
		return bgPanel;

	}

	public void visibleUGP () {
		userGuidePanel.setVisible(true);
	}
	public void invisibleUGP () {
		userGuidePanel.setVisible(false);
	}
	
	public JPanel setInvisibleCACPanel() {
		choiceAndCursorPanel.setVisible(false);
		repaint();
		return choiceAndCursorPanel;
	}

	public JPanel setVisibleCACPanel() {
		choiceAndCursorPanel.setVisible(true);
		repaint();
		return choiceAndCursorPanel;
	}

	public void setEDPanel(JFrame f, StatusManager sm) {
		JPanel ED1 = new JPanel();

		if (sm.getStatus1() <= 0) {
			//BADED1
			this.bgEDPanel = new BackgroundPanel("BAD_ED_01.png");
		} else if (sm.getStatus2() <= 0) {
			//BADED2
			this.bgEDPanel = new BackgroundPanel("BAD_ED_02.png");
		} else if (sm.getStatus3() <= 0) {
			//BADED3
			this.bgEDPanel = new BackgroundPanel("BAD_ED_03.png");
		} else if (sm.getStatus4() <= 0) {
			//BADED4
			this.bgEDPanel = new BackgroundPanel("BAD_ED_04.png");
		} else {
			this.bgEDPanel = new BackgroundPanel("ED_01.png");
		}

		ED1.add(bgEDPanel);
		f.setLayout(new BorderLayout());
		f.add(bgEDPanel, BorderLayout.CENTER);
		this.setVisible(false);
		repaint();
	}

	public void setOPPanel() {
		Image BackgroundImage = new ImageIcon("OP_01.png").getImage();
		System.out.println("画像投影します");
		realBGPanel.BackgroundImage = BackgroundImage;
		mainPanel.setVisible(false);
		repaint();
		revalidate();
	}

	public void removeOPPanel() {
		mainPanel.setVisible(true);
		repaint();
	}

	protected void setUpKeyBindings() {
		InputMap inputMap = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap actionMap = getActionMap();

		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "selectUp");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "selectDown");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "selectEnter");

		actionMap.put("selectUp", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selectedIndex = 0;
				updateSelection();
			}
		});
		actionMap.put("selectDown", new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				selectedIndex = 1;
				updateSelection();
			}
		});
		actionMap.put("selectEnter", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				decideSelection();
			}
		});
	}

	KeyAction ka = new KeyAction(f);

	protected void decideSelection(//sm
	) {
		ka.pressEnterKey(selectedIndex, sm, this, f);

		//		
		//		if (selectedIndex == 0) {//結果表示
		//			storyArea.setText(sm.getStory().getResultAText()
		//					);
		//		} else {
		//			storyArea.setText(
		//					sm.getStory().getResultBText()
		//					);
		//		}
		//		//◆	5/12 7:50　修正点：選択肢ごとの選択でstoryAreaを更新（下記3行でパネルごと見えない化）
		//		choiceAndCursorPanel.setVisible(false);
		revalidate();
		repaint();
	}

	protected void updateSelection() {

		Color selected = new Color(255, 255, 255, 255);

		Color unselected = new Color(255, 255, 255, 80);

		if (selectedIndex == 0) {
			upArea.setForeground(selected);
			downArea.setForeground(unselected);
		} else {
			upArea.setForeground(new Color(255, 255, 255, 80));
			downArea.setForeground(Color.WHITE);
		}

	}

	//Panelをいじったら（画像更新したら）componentのZ軸は一番手前に自動的に持ってこられるのか
	//もしくは、Z軸は変わらないのか
	//bgPanel = BackgroundPanel(sm.getStory().getImagePath());
	static class BackgroundPanel extends JPanel {
		protected Image BackgroundImage;

		public BackgroundPanel(String imagePath) {
			BackgroundImage = new ImageIcon(imagePath).getImage();
			System.out.println("画像投影します");
			repaint();
			revalidate();
		}

		@Override
		protected void paintComponent(Graphics g) {
			// TODO 自動生成されたメソッド・スタブ
			super.paintComponent(g);
			g.drawImage(BackgroundImage,
					0, 0,
					getWidth(), getHeight(),
					this);
		}
	}

}
