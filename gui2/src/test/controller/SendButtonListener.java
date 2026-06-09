package test.controller;

import javax.swing.JOptionPane;

import test.ShiftType;
import test.service.EntryService;
import test.view.MainPanel;



public class SendButtonListener {

	private final EntryService entryService = new EntryService();

	public void handleSend(MainPanel mp, ShiftType shiftType) {
		//targetDateTimeはメインかメインパネルから取ってくる？

		if(shiftType == null) {
			JOptionPane.showMessageDialog(null,"出勤時間を選択してください","メッセージ", JOptionPane.ERROR_MESSAGE);
			return;
		}
		//制限時間内か？
		if (!(entryService.checkTime(mp.getDateTime()))) {
			JOptionPane.showMessageDialog(null, "申請時間を過ぎました。", "メッセージ", JOptionPane.ERROR_MESSAGE);
			return; // 処理を終了

		}

		//二重申請してないか？
		if (entryService.hasShiftType(mp.getLoginUser(), mp.serviceCardPanel.shiftPanel)) {
			JOptionPane.showMessageDialog(null, "既に出勤登録されています。", "メッセージ", JOptionPane.ERROR_MESSAGE);
			return; // 処理を終了
		}

		//シフトに空きがあるか?
		if (!(entryService.hasCapacity(shiftType))) {
			JOptionPane.showMessageDialog(null, "シフトに空きがありません。", "メッセージ", JOptionPane.ERROR_MESSAGE);
			return; // 処理を終了
		}

		//最終確認
		int answer = JOptionPane.showConfirmDialog(null,
				mp.getLoginUser().getFullName() + "さん、登録しますか？", "登録確認",
				JOptionPane.YES_NO_OPTION);
		if (answer == JOptionPane.YES_OPTION) {
			entryService.entryShift(mp.getLoginUser(), shiftType, mp.serviceCardPanel.shiftPanel);
			JOptionPane.showMessageDialog(null, "登録完了しました。");
			mp.serviceCardPanel.inputPanel.update();
		}else {
			JOptionPane.showMessageDialog(null, "申請を中断しました。");
		}
	}
}
