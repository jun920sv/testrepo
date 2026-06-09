package test.view;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class ServiceCardPanel extends JPanel {

	private CardLayout layout2;
	public InputPanel inputPanel;
	public ShiftPanel shiftPanel;
	public ServiceCardPanel(MainPanel mp) {

		this.layout2 = new CardLayout();
		this.setLayout(this.layout2);

		this.inputPanel = new InputPanel(mp);
		this.shiftPanel = new ShiftPanel();

		this.add(inputPanel, "入力画面");
		this.add(shiftPanel, "シフト画面");

		layout2.show(this, "入力画面");

	}

	public void changePanel(String name) {
		layout2.show(this, name);
	}
	
	//ラジオボタンクリア（InputPanelに対して呼ぶ）
	public void clearRadio() {
		inputPanel.clearRadio();
	}

}
