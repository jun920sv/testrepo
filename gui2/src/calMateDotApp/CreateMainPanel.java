package calMateDotApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/*
 * フレーム以外のビジュアルを生成しまとめるクラス
 * JPanelを継承しているので情報を集約する器になっている
 * Mainでインスタンスを生成すると内部処理が完了する
 */
public class CreateMainPanel extends JPanel {
	private MemberList member;
	private JPanel uperPnl;
	private JButton commitBtn;
	private JTabbedPane tab;
	private JPanel maidMainSheet;
	private JPanel fairyMainSheet;
	private JScrollPane maidScPn;
	private JScrollPane fairyScPn;
	private JPanel maidStatusSheet;
	private JPanel fairyStatusSheet;
	private SaveAndLoadManager save;
	private List<CreateStatus> maidStatusList;
	private List<CreateStatus> fairyStatusList;

	// コンストラクタでmeinPanelに各情報を集約する
	public CreateMainPanel(MemberList member) {
		this.setLayout(new BorderLayout());
		maidStatusList = new ArrayList<>();
		fairyStatusList = new ArrayList<>();
		this.member = member;
		this.maidMainSheet = new JPanel();
		this.fairyMainSheet = new JPanel();
		this.save = new SaveAndLoadManager();

		createUperPnl();
		createTabPnl();

		this.add(this.uperPnl, BorderLayout.NORTH);
		this.add(this.tab, BorderLayout.CENTER);
		JPanel underPnl = new JPanel(); // 下部の隙間用
		underPnl.setPreferredSize(new Dimension(600, 40));
		this.add(underPnl, BorderLayout.SOUTH);
	}

	// 共用画面上部のまとまりを生成するメソッド
	private void createUperPnl() {
		this.uperPnl = new JPanel(new BorderLayout());
		this.uperPnl.setBorder(new LineBorder(Color.GRAY, 1));
		this.uperPnl.setPreferredSize(new Dimension(600, 40));
		
		JPanel titlePnl = new JPanel();
		titlePnl.setSize(1000,800);
		JLabel titleLbl = new JLabel("勤務管理");
		
		titleLbl.setFont(new Font("Meiryo UI", Font.BOLD, 15));//フォント変更
		JPanel btnPnl = commitButton();
		this.commitBtn.setFont(new Font("Meiryo UI", Font.BOLD, 14));//フォント変更
		
		titlePnl.add(titleLbl);
		btnPnl.add(this.commitBtn);
		this.uperPnl.add(titlePnl);
		this.uperPnl.add(btnPnl, BorderLayout.EAST);
	}

	private JPanel commitButton() {
		//ボタン処理（チェックされてる場合のみ確定）
		JPanel btnPnl = new JPanel();
		btnPnl.setPreferredSize(new Dimension(120, 60));

		this.commitBtn = new JButton("確定");
		commitBtn.setPreferredSize(new Dimension(90, 30));

		//（範囲はこのメソッド内のここ以下とCreateStatusクラスの最下層メソッド）
		this.commitBtn.addActionListener(_ -> {//チェック時のボタン処理
			boolean hasWarning = false;
			boolean hasAttend = false;
			
			//メイドリストの処理
			List<Maid> mList = this.member.getMaidList();
			for (int i = 0; i < mList.size(); i++) {
				CreateStatus view = this.maidStatusList.get(i);
				
				//出勤者がいる
				if (view.isChecked()) {
					hasAttend = true;
				}
				//未出動なのに♡入力
				if (!view.isChecked() && view.getSelectedComboValue() != 0) {
					hasWarning = true;
					break;
				}
			}
			//妖精リストチェック
			List<Fairy> fList = this.member.getFairyList();

			for (int i = 0; i < fList.size(); i++) {
				CreateStatus view = this.fairyStatusList.get(i);
				//出勤者がいる
				if (view.isChecked()) {
					hasAttend = true;
				}
			}
			//エラー処理
			if (hasWarning) {
				JOptionPane.showMessageDialog(this, "出勤していないメイドにハートが選択されています");
				return;
			}
			//エラー処理
			if (!hasAttend) {
				JOptionPane.showMessageDialog(this, "出勤者が選択されていません");
				return;
			}
			//正常処理
			executeCommit();
			listExtraction();
			maidPage();
			fairyPage();
			save.save(mList, fList);
			this.revalidate();
			this.repaint(); // 再描画

		});
		return btnPnl;
	}

	//正常処理判定のexecuteCommitのメソッド
	private void executeCommit() {
		//メイドの処理
		List<Maid> mList = member.getMaidList();
		for (int i = 0; i < mList.size(); i++) {
			CreateStatus view = maidStatusList.get(i);
			Maid maid = mList.get(i);
			//チェックされてる人だけ反映
			if (view.isChecked()) {
				int hearts = view.getSelectedComboValue();
				maid.attendInc(hearts);
			}
		}
		//妖精の処理
		List<Fairy> fList = member.getFairyList();

		for (int i = 0; i < fList.size(); i++) {
			CreateStatus view = fairyStatusList.get(i);
			Fairy fairy = fList.get(i);
			//チェックされてる人だけ反映
			if (view.isChecked()) {
				fairy.attendInc();
			}
		}
		this.maidMainSheet.removeAll();
		this.fairyMainSheet.removeAll();
	}

	// メイド画面の項目欄を生成するメソッド
	private JPanel createMaidTitlePnl() {
		JPanel basePn = new JPanel(new BorderLayout());
		basePn.setPreferredSize(new Dimension(600, 40));
		JPanel blank = new JPanel();
		blank.setPreferredSize(new Dimension(16, 0));
		JPanel maidTitle = new JPanel(new GridLayout(1, 6, 0, 0));
		maidTitle.setPreferredSize(new Dimension(550, 40));
		maidTitle.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));

		// 設定したいフォントの定義
	    Font titleFont = new Font("Meiryo UI", Font.BOLD, 14);//フォント変更

	    JLabel lbl1 = new JLabel("写真", SwingConstants.CENTER);
	    JLabel lbl2 = new JLabel("名前", SwingConstants.CENTER);
	    JLabel lbl3 = new JLabel("出勤数", SwingConstants.CENTER);
	    JLabel lbl4 = new JLabel("❤", SwingConstants.CENTER);
	    JLabel lbl5 = new JLabel("ランク", SwingConstants.CENTER);
	    JLabel lbl6 = new JLabel("出勤／❤獲得数", SwingConstants.CENTER);

	    // 各ラベルにフォントを適用
	    lbl1.setFont(titleFont);
	    lbl2.setFont(titleFont);
	    lbl3.setFont(titleFont);
	    lbl4.setFont(titleFont);
	    lbl5.setFont(titleFont);
	    lbl6.setFont(titleFont);

	    maidTitle.add(lbl1);
	    maidTitle.add(lbl2);
	    maidTitle.add(lbl3);
	    maidTitle.add(lbl4);
	    maidTitle.add(lbl5);
	    maidTitle.add(lbl6);
	    
	    basePn.add(maidTitle);
	    basePn.add(blank, BorderLayout.EAST);

	    return basePn;
	}

	// 妖精画面の項目欄を生成するメソッド
	private JPanel createFairyTitlePnl() {
		JPanel basePn = new JPanel(new BorderLayout());
		basePn.setPreferredSize(new Dimension(600, 40));
		JPanel blank = new JPanel();
		blank.setPreferredSize(new Dimension(17, 40));
		JPanel fairyTitle = new JPanel(new GridLayout(1, 5, 0, 0));
		fairyTitle.setPreferredSize(new Dimension(500, 40));
		fairyTitle.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));

		Font titleFont = new Font("Meiryo UI", Font.BOLD, 14);//フォント変更

	    JLabel lbl1 = new JLabel("写真", SwingConstants.CENTER);
	    JLabel lbl2 = new JLabel("名前", SwingConstants.CENTER);
	    JLabel lbl3 = new JLabel("出勤数", SwingConstants.CENTER);
	    JLabel lbl4 = new JLabel("担当業務", SwingConstants.CENTER);
	    JLabel lbl5 = new JLabel("出勤", SwingConstants.CENTER);

	    // 各ラベルにフォントを適用
	    lbl1.setFont(titleFont);
	    lbl2.setFont(titleFont);
	    lbl3.setFont(titleFont);
	    lbl4.setFont(titleFont);
	    lbl5.setFont(titleFont);

	    fairyTitle.add(lbl1);
	    fairyTitle.add(lbl2);
	    fairyTitle.add(lbl3);
	    fairyTitle.add(lbl4);
	    fairyTitle.add(lbl5);
	    
	    basePn.add(fairyTitle);
	    basePn.add(blank, BorderLayout.EAST);

	    return basePn;
	}

	// 登録されたメンバーリストからroleに応じたステータス欄を生成
	public void listExtraction() {
		maidStatusList.clear();
		fairyStatusList.clear();

		// メイドリストをラベルにする
		List<Maid> maidList = this.member.getMaidList();
		this.maidStatusSheet = new JPanel();
		this.maidStatusSheet.setLayout(new BoxLayout(this.maidStatusSheet, BoxLayout.Y_AXIS));
		for (Maid m : maidList) {
			JPanel maid = new JPanel(new BorderLayout());
			maid.setBorder(BorderFactory.createTitledBorder(""));

			// 勤務数でプレーンと既存メンバーを寄り分けて処理する
			CreateStatus mst = new CreateStatus();
			mst = (m.getAttend() == 0) ? mst.createExistingMaid(m.getName(), m.getRole(), m.getIcon())
					: mst.createExistingMaid(m.getName(), m.getRole(), m.getAttend(), m.getHeart(), m.getIcon());

			maidStatusList.add(mst);
			maid.add(mst, BorderLayout.CENTER);
			maid.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
			this.maidStatusSheet.add(maid);
		}
		this.maidStatusSheet.add(Box.createVerticalGlue());

		// 妖精リストをラベルにする
		List<Fairy> fairyList = this.member.getFairyList();
		this.fairyStatusSheet = new JPanel();
		this.fairyStatusSheet.setLayout(new BoxLayout(this.fairyStatusSheet, BoxLayout.Y_AXIS));
		for (Fairy f : fairyList) {
			JPanel fairy = new JPanel(new BorderLayout());
			fairy.setBorder(BorderFactory.createTitledBorder(""));
			// 勤務数でプレーンと既存メンバーを寄り分けて処理する
			CreateStatus fst = new CreateStatus();
			fst = (f.getAttend() == 0)
					? fst.createExistingFairy(f.getName(), f.getRole(), f.getStaffRole(), f.getIcon())
					: fst.createExistingFairy(f.getName(), f.getRole(), f.getAttend(), f.getStaffRole(), f.getIcon());

			fairyStatusList.add(fst);
			fairy.add(fst, BorderLayout.CENTER);
			fairy.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
			this.fairyStatusSheet.add(fairy);
		}
		fairyStatusSheet.add(Box.createVerticalGlue());

		createScrollPane();
	}

	private void createScrollPane() {
		this.maidScPn = new JScrollPane(this.maidStatusSheet);
		// スクロールバーを常時表示
		maidScPn.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		// スクロールバーの速度調節
		maidScPn.getVerticalScrollBar().setUnitIncrement(16);
		this.fairyScPn = new JScrollPane(this.fairyStatusSheet);
		fairyScPn.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		fairyScPn.getVerticalScrollBar().setUnitIncrement(16);
	}

	// タブ画面の生成をするメソッド
	private void createTabPnl() {
		listExtraction();
		maidPage();
		fairyPage();
		this.tab = new JTabbedPane();
		this.tab.addTab("メイド", this.maidMainSheet);
		this.tab.addTab("妖精", this.fairyMainSheet);
		JLabel maidLabel = new JLabel("メイド", SwingConstants.CENTER);
		maidLabel.setPreferredSize(new Dimension(100, 30));
		maidLabel.setFont(new Font("Meiryo UI", Font.BOLD, 13));//フォント変更
		tab.setTabComponentAt(0, maidLabel);
		
		JLabel fairyLabel = new JLabel("妖精", SwingConstants.CENTER);
		fairyLabel.setPreferredSize(new Dimension(100, 30));
		fairyLabel.setFont(new Font("Meiryo UI", Font.BOLD, 13));//フォント変更
		tab.setTabComponentAt(1, fairyLabel);
	}

	// メイドのステータス一覧画面
	private void maidPage() {
		this.maidMainSheet.setLayout(new BorderLayout());
		this.maidMainSheet.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.maidMainSheet.add(createMaidTitlePnl(), BorderLayout.NORTH);
		this.maidMainSheet.add(this.maidScPn, BorderLayout.CENTER);
	}

	// 妖精のステータス一覧画面
	private void fairyPage() {
		this.fairyMainSheet.setLayout(new BorderLayout());
		this.fairyMainSheet.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.fairyMainSheet.add(createFairyTitlePnl(), BorderLayout.NORTH);
		this.fairyMainSheet.add(this.fairyScPn, BorderLayout.CENTER);
	}
}
