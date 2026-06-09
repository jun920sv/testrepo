package Typing.Model.Button;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ModelFocus {
	public void service(JButton btn) {
		btn.setFocusable(true);
		btn.requestFocusInWindow();
	}
	public void service(JButton btn, JPanel panel) {
		btn.setFocusable(false);
		panel.requestFocusInWindow();
	}
}
