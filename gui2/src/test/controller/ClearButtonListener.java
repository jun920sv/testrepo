package test.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import test.User;
import test.service.EntryService;
import test.view.MainPanel;
import test.view.ServiceCardPanel;

public class ClearButtonListener implements ActionListener{
	EntryService es = new EntryService();
	User user;
	ServiceCardPanel scp;
	MainPanel mp;
	public ClearButtonListener(MainPanel mp) {
		this.mp = mp;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = mp.getLoginUser().getFullName();
		String shift = mp.getLoginUser().getShiftType().getStr();
		int ans = JOptionPane.showConfirmDialog(null, name +"さん　" + shift + "　の出勤申請を取り消します。\nよろしいですか？", "取り消し確認",JOptionPane.YES_NO_OPTION);
		
		if(ans == JOptionPane.YES_OPTION) {
			es.clearEntry(this.mp);
			JOptionPane.showMessageDialog(null, "取り消しました");
		}else {
			JOptionPane.showMessageDialog(null, "取り消し処理を中断しました");
		}
		
	}

}
