package test.service;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import test.ShiftType;
import test.User;
import test.view.MainPanel;
import test.view.ShiftPanel;

public class EntryService {
	
	//勤務申請をすでにしているか
	public boolean hasShiftType(User u,ShiftPanel sp) {
		for(int i = 0;i < sp.getListSize();i++) {
			if(sp.getUser(i).equals(u)) {
				return true;
			}
		}
		return u.getShiftType() != null;
		//true　ユーザー持ってる、シフト表にも登録済
		//false　持ってない、未登録 = このまま登録処理を続ける
	}
	
	//シフトに空きがあるかの確認
	public boolean hasCapacity(ShiftType st) {
		if(st.getCapacity() > 0) {
			return true;
		}
		return false;
		//true　空きが１以上ある
		//false　空きが0である
	}
	
	//シフト登録
	public void entryShift(User u,ShiftType st,ShiftPanel sp) {
			u.setShiftType(st);
			sp.addMember(u);
			sp.getShiftGraphPanel().repaint();
			st.reduceCapacity();
	}
	
	public boolean checkTime(LocalDateTime dateTime) {
		//dateTimeはメインパネルからgetしてくる？メインメソッドから？

		//現在日時を取得
		LocalDateTime now = LocalDateTime.now();
		//制限時間
		LocalDateTime oneDayBeforeDateTime = dateTime.minusDays(1);

		// 判定結果を返すだけにする
        return now.isBefore(oneDayBeforeDateTime);
    }

		public void clearEntry(MainPanel mp) {
			if(!mp.getLoginUser().hasShiftType()) {
				JOptionPane.showMessageDialog(null, "該当する出勤申請がありません");
				return;
			}
			mp.serviceCardPanel.shiftPanel.reduceMember(mp.getLoginUser());
			mp.getLoginUser().getShiftType().addCapacity();
			mp.getLoginUser().setShiftType(null);
			mp.serviceCardPanel.inputPanel.update();
			mp.serviceCardPanel.shiftPanel.repaint();
		}
	
	
}
