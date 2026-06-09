package test.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import test.ShiftType;
import test.User;

public class ShiftGraphPanel extends JPanel {

	//シフト登録された人一覧
	private ArrayList<User> list;

	//コンストラクタ
	public ShiftGraphPanel(ArrayList<User> members) {
		this.list = members;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
		//総募集人数	
		int total = ShiftType.total;
		//一時間あたりの縦幅
		int height = this.getHeight()/(ShiftType.end - ShiftType.start +2);
		//一人当たりの勤務時間縦幅、今回は８時間
		int timeHeight = height * 8;
		//一人当たりの横幅
		int userWidth = this.getWidth()/total;
		
		//一時間ごとの線を引く
		g.setColor(Color.BLACK);
		for(int i = 0;i < ShiftType.end - ShiftType.start +1;i++) {
//			User u = list.get(i);
			g.drawLine(0,i*height+height,this.getWidth(),i*height+height);
		}
		
		//登録がない場合
		if(this.list.size() == 0) {
			return;
		}
		
		//一人ずつ描画
		for(int i = 0;i < list.size();i++) {
			//i人目のユーザー
			User now = list.get(i);
			//i人目の勤務時間取得
			ShiftType nowSt = now.getShiftType();
			if(nowSt == null) {
				//持っていない場合は登録エラー
				//持っていない場合は登録エラー
				return;
			}
			//開始位置
			int x = i*userWidth;
			//初期位置
			int y = 0;
			switch(nowSt.getType()) {
			case ShiftType.MORNING -> {
				//朝　7～15
				y = height;
//				g.setColor(new Color(255, 200, 120));//orange
				g.setColor(new Color(255, 204, 128));//orange
				g.fillRect(x, y,userWidth, timeHeight);
				g.setColor(Color.GRAY);
				g.drawRect(x, y,userWidth, timeHeight);
//				System.out.println(total);
				break;
			}
			case ShiftType.DAY -> {
				//昼　12～20
				y = (height*6);
//				g.setColor(new Color(100, 180, 255));//mizuiro
				g.setColor(new Color(128, 200, 255));//mizuiro
				g.fillRect(x, y,userWidth, timeHeight);
				g.setColor(Color.GRAY);
				g.drawRect(x, y,userWidth, timeHeight);
				break;
			}
			case ShiftType.NIGHT -> {
				//夜　14～22
				y = (height*8);
//				g.setColor(new Color(40, 60, 120));//blue
				g.setColor(new Color(180, 160, 255));//blue
				g.fillRect(x, y,userWidth, timeHeight);
				g.setColor(Color.GRAY);
				g.drawRect(x, y,userWidth, timeHeight);
				break;
			}
			default ->{
				//登録されているモノがエラー
				//登録されているモノがエラー
				continue;
			}
			}
			//名前描画
			g.setColor(Color.BLACK);
			g.setFont(new Font("MS_ゴシック",Font.BOLD,15));
			g.drawString(now.getFamilyName(), x+12, y+15);
		}
		}catch(ArithmeticException e) {
			//メインメソッドでシフトタイプ未作成、総人数が0のとき
			g.setFont(new Font("MS_GOTHIC",Font.BOLD,40));
			g.drawString("出勤者未登録",this.getWidth()/10,this.getHeight()/2);
			System.out.println("シフトタイプ未作成");
		}catch(Exception e) {
			System.out.println("その他のエラー");
		}
	}

}
