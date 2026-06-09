package test.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import test.User;

public class ShiftPanel extends JPanel{
	private ShiftGraphPanel sgPanel;
	private TimeGraphPanel tsPanel;
	private ArrayList<User> members;
	
	public ShiftPanel(){
		this.members = new ArrayList<>();
		this.setLayout(new BorderLayout());
		this.setBorder(new EmptyBorder(10, 5,10,5));
		this.sgPanel = new ShiftGraphPanel(this.members);
		this.tsPanel = new TimeGraphPanel();
		
//		this.sgPanel.setBackground(Color.PINK);
//		this.tsPanel.setBackground(Color.ORANGE);
		this.tsPanel.setPreferredSize(new Dimension(30, HEIGHT));
		this.add(tsPanel,BorderLayout.WEST);
		this.add(sgPanel,BorderLayout.CENTER);
		
	}
	
	public void addMember(User u) {
		this.members.add(u);
		this.showList();
	}
	public void reduceMember(User u) {
		this.members.remove(u);
		this.showList();
	}
	public User getUser(int i) {
		return members.get(i);
	}
	public int getListSize() {
		return this.members.size();
	}
	public ShiftGraphPanel getShiftGraphPanel() {
		return this.sgPanel;
	}
	public void showList() {
		System.out.println("----出勤メンバー一覧----");
		for(User uu : this.members) {
//			String time = switch(uu.getShiftType().getType()) {
//			case ShiftType.MORNING -> "7-15時";
//			case ShiftType.DAY -> "12-20時";
//			case ShiftType.NIGHT -> "14-22時";
//			default -> "該当なし";
//			};
			System.out.println(uu.getFamilyName() + ":" + uu.getShiftType().getStr());
//			System.out.println(Member.membersList.get(4).getShiftType().getType());
		}
	}
}
