package groupwork.test.controller;

import javax.swing.JFrame;

import groupwork.test.CreatePanel;
import groupwork.test.Model;

//多分、十中八九StatusManagerをimportする必要がある

//Java Swing で repaint() を呼び出す位置は、
//「描画内容が変わった直後」かつ「イベントディスパッチスレッド（EDT）上」が基本

//Problem:メソッドが持ってこれない！getInputMapなど、それの解決方法
//Area描画はCreateAreaに作ったメソッドを持ってきた方がよかったりする？？わからんち
//

public class KeyAction {
	static int pressEnterKeyCount = 0;
	static int upKey = 0;
	static int downKey = 1;
	private JFrame f;

	// TODO 自動生成されたメソッド・スタブ
	public KeyAction(JFrame f) {
		this.f = f;
		System.out.println("keyActionにアクセスした");
	}

	//このメソッドを使った後にはpressEnterKeyCount++忘れずに
	public void pressEnterKey(int keyNumber, StatusManager sm, CreatePanel cp, JFrame f) {
		this.f = f;
		//OPありきのコードなので、EnterKeyCountのif文を0と1逆転させてね

		Painter p = new Painter();
		Model m = new Model();
		if (pressEnterKeyCount == 0) {
			cp.removeOPPanel();
		} 
		if (pressEnterKeyCount % 2 == 0) {
			if (pressEnterKeyCount >= 1) {
				sm.changeStory();
			}
			//			選択肢&本文表示をPainterに任せる
			//			Painter.本文描画メソッド名(sm.getStory().getText());
			//			Painter.上選択肢描画メソッド名(sm.getStory()getChoiceAText());
			//			Painter.下選択肢描画メソッド名(sm.getStory().getChoiceBText());

			p.repaintStoryArea(sm, cp, f, this);
		} else if (pressEnterKeyCount % 2 == 1) {
			//			結果の文章を表示させる、ステータス決定、計算、保存
			if (keyNumber == upKey) {
				//				上の選択肢の時の処理
				//			
				//				sm.setChoiceAStatus()
				//				Model.計算メソッド名(sm.getStory().getChangeStatus1~4);
				//					→このまま計算メソッド内でset出来たらいいな
				//						sm.setStatus1(sm.getStatus1+(ChangeStatus1));
				//						sm.setStatus2(sm.getStatus2+(ChangeStatus2));
				//						sm.setStatus3(sm.getStatus3+(ChangeStatus3));
				//						sm.setStatus4(sm.getStatus4+(ChangeStatus4));	
				//				Painter.メソッド名(sm.getStory().getResultAText())

				p.repaintUpResultStoryArea(sm, cp);

			} else if (keyNumber == downKey) {
				//				下の選択肢の時の処理
				//				Painter.メソッド名(sm.getStory().getResultAText());
				//				sm.setChoiceBStatus()
				//				Model.計算メソッド名(sm.getStory().getChangeStatus1~4);
				//					→このまま計算メソッド内でset出来たらいいな
				//						sm.setStatus1(sm.getStatus1+(ChangeStatus1));
				//						sm.setStatus2(sm.getStatus2+(ChangeStatus2));
				//						sm.setStatus3(sm.getStatus3+(ChangeStatus3));	
				//						sm.setStatus4(sm.getStatus4+(ChangeStatus4));

				p.repaintDownResultStoryArea(sm, cp);

			}
			if (f != null) {
				System.out.println("KeyAction:fの中身はあります");
			} else {
				System.out.println("KeyAction:値が null です");
			}

		}
		pressEnterKeyCount++;
		System.out.println(pressEnterKeyCount + "回目のEnter");
	}

	public int getpressEnterKeyCount() {
		return this.pressEnterKeyCount;
	}
	//	private void decideSelection(//sm
	//			) {
	//		sm.gameProgress();
	//		if(sm.getEnterCount()%2==0) {
	//		if (selectedIndex == 0) {
	//			storyArea.setText(sm.getStory().getResultAText()
	//					);
	//			sm.resultStatusA();
	//		} else {
	//			storyArea.setText(
	//					sm.getStory().getResultBText()
	//					);
	//			sm.resultStatusB();
	//		}
	//		}else {
	//			storyArea.setText(sm.getStory().getText());
	//		}
	//		updateStatusLabels();
	//		//◆	5/12 7:50　修正点：選択肢ごとの選択でstoryAreaを更新（下記3行でパネルごと見えない化）
	//		if(sm.getEnterCount()%2==0) {
	//		choiceAndCursorPanel.setVisible(false);
	//		}else {
	//			choiceAndCursorPanel.setVisible(true);
	//		}
	//		revalidate();
	//		repaint();
	//		
	//		if (sm.isGameFinish()) {
	//		    return;
	//		}

	//	private void decideSelection(//sm
	//			) {
	//		sm.gameProgress();
	//		if(sm.getEnterCount()%2==0) {
	//		if (selectedIndex == 0) {
	//			storyArea.setText(sm.getStory().getResultAText()
	//					);
	//			sm.resultStatusA();
	//		} else {
	//			storyArea.setText(
	//					sm.getStory().getResultBText()
	//					);
	//			sm.resultStatusB();
	//		}
	//		}else {
	//			storyArea.setText(sm.getStory().getText());
	//		}
	//		updateStatusLabels();
	//		//◆	5/12 7:50　修正点：選択肢ごとの選択でstoryAreaを更新（下記3行でパネルごと見えない化）
	//		if(sm.getEnterCount()%2==0) {
	//		choiceAndCursorPanel.setVisible(false);
	//		}else {
	//			choiceAndCursorPanel.setVisible(true);
	//		}
	//		revalidate();
	//		repaint();
	//		
	//		if (sm.isGameFinish()) {
	//		    return;
	//		}
	//
	//
	//		dayLabel.setText(sm.getDayText());
	//
	//		if (sm.isGameFinish()) {
	//		    // 入力を受け付けない
	//		    choiceAndCursorPanel.setVisible(false);
	//		    return;
	//		}
	//	}
	public static int pressUpKey() {
		return upKey;
	}

	public static int pressDownKey() {
		return downKey;
	}

	//	private static int selectedIndex = 0;
	//
	//	public static void setUpKeyBindings() {
	//		InputMap inputMap = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
	//		ActionMap actionMap = getActionMap();
	//		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "selectUp");
	//		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "selectDown");
	//		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "selectEnter");
	//
	//		actionMap.put("selectUp", new AbstractAction() {
	//			@Override
	//			public void actionPerformed(ActionEvent e) {
	//				selectedIndex = 0;
	//				updateSelection();
	//			}
	//		});
	//		actionMap.put("selectDown", new AbstractAction() {
	//
	//			@Override
	//			public void actionPerformed(ActionEvent e) {
	//				selectedIndex = 1;
	//				updateSelection();
	//			}
	//		});
	//		actionMap.put("selectEnter", new AbstractAction() {
	//			@Override
	//			public void actionPerformed(ActionEvent e) {
	//				decideSelection();
	//			}
	//		});
	//	}
	//
	//	private static void decideSelection() {
	//		if (selectedIndex == 0) {
	//			CP.setText("""
	//					上の選択肢が選択された
	//					肺が焦げるような熱気に耐えながら、周囲を見渡すと
	//					。。。。。。
	//					""");
	//			System.out.println("上の選択肢の結果");
	//		} else {
	//			cp.setStoryArea("""
	//					上の選択肢が選択された
	//					今日の天気は穏やかで過ごしやすい天気です。
	//					""");
	//			System.out.println("下の選択肢の結果");
	//		}
	//		//◆	5/12 7:50　修正点：選択肢ごとの選択でstoryAreaを更新（下記3行でパネルごと見えない化）
	//		cp.getChoiceAndCursorPanel().setVisible(false);
	//		cp.revalidate();
	//		cp.repaint();
	//	}
	//
	//	public static void updateSelection() {
	//
	//		Color selected = new Color(255, 255, 255, 255);
	//
	//		Color unselected = new Color(255, 255, 255, 80);
	//
	//		if (selectedIndex == 0) {
	//			cp.getUpArea().setForeground(selected);
	//			cp.getDownArea().setForeground(unselected);
	//		} else {
	//			cp.getUpArea().setForeground(new Color(255, 255, 255, 80));
	//			cp.getDownArea().setForeground(Color.WHITE);
	//		}
	//
	//	}

}
