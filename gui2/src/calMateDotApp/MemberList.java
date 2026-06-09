package calMateDotApp;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class MemberList {
	private static List<Maid> maidList = new ArrayList<>();
	private static List<Fairy> fairyList = new ArrayList<>();

	private static String[] names = {"れい","みるく", "佐藤", "ねぎま", "まかろん", "真昼","でるた", "myao", "高橋", "鈴木"}; // 10個
	private static String[] roles = {"メイド","メイド", "妖精", "メイド", "メイド", "メイド", "メイド", "メイド",  "妖精", "妖精"}; // 🌟 10個に修正（「myao」さんの分の「メイド」を追加）
	private static int[] attends = {999,249, 999, 99, 99, 29, 29, 0, 0, 10};
	private static int[] hearts = {999,299, 0, 99, 99, 10, 5, 0, 0, 0};	// 妖精は必ず0に設定
	private static String[] staffRoles = {"", "", "調理", "", "", "", "", "", "調理", "清掃"}; // 🌟 10個に修正（空文字を1つ追加して調整）
	private static String[] address = {"pic_01/maid/Rei.png", "pic_01/maid/Milk.png", "pic_01/fairy/佐藤.png",
								"pic_01/maid/Negima.png", "pic_01/maid/Macaron.png", "pic_01/maid/Mahiru.png",
								"pic_01/maid/Delta.png", "pic_01/maid/Myao.png", "pic_01/fairy/高橋.png",
								"pic_01/fairy/鈴木.png"};// ⚠️名前に合わせて順番を少し整理すると管理しやすいです
	private static ImageIcon[] icons = new ImageIcon[address.length];

	public MemberList() {
		Adjustment.imageAdjustment(address, icons);
		createMemberList();
	}

	private static void createMemberList() {
		for(int i = 0; i < MemberList.names.length; i++) {
			String name = MemberList.names[i];
			String role = MemberList.roles[i];
			int attend = MemberList.attends[i];
			int heart = MemberList.hearts[i];
			String staffRole = MemberList.staffRoles[i];
			ImageIcon icon = MemberList.icons[i];
			
			switch(role) {
			case "メイド" -> {
				MemberList.maidList.add(new Maid(name, role, attend, heart, icon));
			}
			case "妖精" -> {
				MemberList.fairyList.add(new Fairy(name, role, attend, staffRole, icon));
			}
			}
		}
	}

	public List<Maid> getMaidList() {
		return MemberList.maidList;
	}

	public List<Fairy> getFairyList() {
		return MemberList.fairyList;
	}


}