package calMateDotApp;


import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CreateStatus extends JPanel{
	//フォントの設定で追加
	private static final java.awt.Font BASE_FONT =new java.awt.Font("Meiryo UI",java.awt.Font.BOLD,15);
	
	private JCheckBox check;
	private JPanel pnl;
	private JComboBox<Integer> combo;
	
	// メイドプレーンメンバー欄生成用メソッド
	public CreateStatus createExistingMaid(String name, String role, ImageIcon icon) {
			createMaidStatus(new Maid(name, role, icon));
			return this;
	}
	
	// 既存メイド生成用メソッド
	public CreateStatus createExistingMaid(String name, String role, int attend, int heart, ImageIcon icon) {
		createMaidStatus(new Maid(name, role, attend, heart, icon));
		
		return this;
	}
	
	// メイド生成時の共通処理メソッド
	private void createMaidStatus(Maid maid) {
		this.setLayout(new GridLayout(1, 4, 0, 0));
		JLabel imageLbl = new JLabel(maid.getIcon(), SwingConstants.CENTER);
		JLabel nameLbl = new JLabel(maid.getName(), SwingConstants.CENTER);
		JLabel attendLbl = new JLabel("" + maid.getAttend(), SwingConstants.CENTER);
		JLabel heartLbl = new JLabel("" + maid.getHeart(), SwingConstants.CENTER);
		JLabel rankLbl = new JLabel(maid.getRank(), SwingConstants.CENTER);
	//メイドフォントの設定
		imageLbl.setFont(BASE_FONT);
		nameLbl.setFont(BASE_FONT);
		attendLbl.setFont(BASE_FONT);
		heartLbl.setFont(BASE_FONT);
		rankLbl.setFont(BASE_FONT);
		JPanel inputPnl = new JPanel(new GridLayout(1, 2, 0, 0));
		this.check = createCheckBox();
		this.pnl = createComboBox();
		this.pnl.getPreferredSize();
		inputPnl.add(this.check);
		
		inputPnl.add(this.pnl);
		
		this.add(imageLbl);
		this.add(nameLbl);
		this.add(attendLbl);
		this.add(heartLbl);
		this.add(rankLbl);
		this.add(inputPnl);
	}

	// 妖精プレーンメンバー生成用メソッド
	public CreateStatus createExistingFairy(String name, String role, String staffRole, ImageIcon icon) {
		createFairyStatus(new Fairy(name, role, staffRole, icon));
		
		return this;
	}
	
	// 妖精初期メンバー生成用メソッド
	public CreateStatus createExistingFairy(String name, String role, int attend, String staffRole, ImageIcon icon) {
			createFairyStatus(new Fairy(name, role, attend, staffRole, icon));
			
			return this;
	}
	
	// 妖精生成時の共通処理メソッド
	private void createFairyStatus(Fairy fairy) {
		this.setLayout(new GridLayout(1, 5, 0, 0));
		JLabel imageLbl = new JLabel(fairy.getIcon(), SwingConstants.CENTER);
		JLabel nameLbl = new JLabel(fairy.getName(), SwingConstants.CENTER);
		JLabel attendLbl = new JLabel("" + fairy.getAttend(), SwingConstants.CENTER);
		JLabel staffRoleLbl = new JLabel(fairy.getStaffRole(), SwingConstants.CENTER);
	//妖精フォント設定	
		imageLbl.setFont(BASE_FONT);
		nameLbl.setFont(BASE_FONT);
		attendLbl.setFont(BASE_FONT);
		this.check = createCheckBox();
		
		this.add(imageLbl);
		this.add(nameLbl);
		this.add(attendLbl);
		this.add(staffRoleLbl);
		this.add(this.check);
	}
	
	// チェックボックス生成用メソッド
	private JCheckBox createCheckBox() {
		JCheckBox chk = new JCheckBox();
		chk.setIcon(new ImageIcon("pic_01/checkIcon/red_square.png"));
		chk.setSelectedIcon(new ImageIcon("pic_01/checkIcon/blue_square.png"));
		// JCheckBoxの領域内での垂直位置の指定
		chk.setVerticalTextPosition(JCheckBox.CENTER);
		chk.setHorizontalAlignment(SwingConstants.CENTER);
		
		return chk;
	}
	
	// コンボボックス内の生成用メソッド
	private JPanel createComboBox() {
		JComboBox<Integer> cmb = new JComboBox<>();
		JPanel pnl = new JPanel(new GridBagLayout());
		pnl.setSize(100,40);
		this.combo=cmb;
		pnl.add(cmb);
		// コンボボックスの大きさを調整
		Dimension fixedSize = new Dimension(55, 30);
		cmb.setPreferredSize(fixedSize);
		// コンボボックスの内容を展開した時に表示される行数
		cmb.setMaximumRowCount(10);
		// コンボボックスの中身を生成
		for(int i = 0; i <= 100; i++) {
			cmb.addItem(i);
		}
		
		return pnl;
	}
	
	public boolean isChecked() {
		return this.check != null && this.check.isSelected(); 
	}
	
	public int getSelectedComboValue() {
		if(this.combo == null || this.combo.getSelectedItem() == null) {
			
		}
		return (Integer)this.combo.getSelectedItem();
	}

	/*
	public void reset() {
		//チェックoff
		if(this.check !=null) {
			this.check.setSelected(false);
		}
		//コンボを０へ
		if(this.combo != null) {
			this.combo.setSelectedIndex(0);
		}
	}
	*/
}
