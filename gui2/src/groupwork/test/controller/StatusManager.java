package groupwork.test.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import groupwork.test.story.E_01;
import groupwork.test.story.E_02;
import groupwork.test.story.E_03;
import groupwork.test.story.E_04;
import groupwork.test.story.E_05;
import groupwork.test.story.N_01;
import groupwork.test.story.N_02;
import groupwork.test.story.N_03;
import groupwork.test.story.N_04;
import groupwork.test.story.N_05;
import groupwork.test.story.Story;

public class StatusManager {
	int status1 = 80;
	int status2 = 80;
	int status3 = 80;
	int status4 = 80;
	
	int day = 1;
	

//	ここに配列を保存する場合、
	ArrayList<Story> storyList = new ArrayList<Story>();
	Random rand = new Random();
	public StatusManager() {//コンストラクタ　配列に保存&シャッフルする
//		全てのストーリーをインスタンス化する、そこからリストに入れる
//		E_03 s1 = new E_03();
//		N_02 s2 = new N_02();
//		storyList.add(s1);
//		storyList.add(s2);
		
		Story Stories[]= {
				 new E_01()
				,new E_02()
				,new E_03()
				,new E_04()
				,new E_05()
				,new N_01()
				,new N_02()
				,new N_03()
				,new N_04()
				,new N_05()
	};
		
		
		for (Story s : Stories) {
			storyList.add(s);
		}
		for (int i =0; i<2; i++) {
		storyList.remove(rand.nextInt(storyList.size()-1));
		}
		
	Collections.shuffle(storyList);
	}//クラス名判別はcouldなので今不要
	
	public int getStatus1() {
		return status1;
	}

	public int getStatus2() {
		return status2;
	}

	public int getStatus3() {
		return status3;
	}

	public int getStatus4() {
		return status4;
		
	}

	public int getDay() {
		return day;
	}
	public Story getStory() {
		return storyList.get(0);
	}	

	public void changeStory() {
//		this.storyList.set(storyList.size()-1, storyList.get(0));
		this.storyList.remove(storyList.get(0));		
	}

	public void setStatus1(int status1) {
		this.status1 = status1;
	}

	public void setStatus2(int status2) {
		this.status2 = status2;
	}

	public void setStatus3(int status3) {
		this.status3 = status3;
	}

	public void setStatus4(int status4) {
		this.status4 = status4;
	}

	public void incrementDay() {
		this.day++;
	}

}
