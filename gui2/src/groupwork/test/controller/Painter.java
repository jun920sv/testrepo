package groupwork.test.controller;

import javax.swing.JFrame;

import groupwork.test.CreatePanel;
import groupwork.test.Model;

public class Painter {
	Model m = new Model();

	public void repaintUpResultStoryArea(StatusManager sm, CreatePanel CP) {
		System.out.println("選択肢A決定");
		sm.getStory().setChoiceAStatus();
		m.culc(CP);
		CP.setStoryArea(sm.getStory().getResultAText());
		CP.setStatusLabel1();
		CP.setStatusLabel2();
		CP.setStatusLabel3();
		CP.setStatusLabel4();
		CP.invisibleUGP();
		CP.setInvisibleCACPanel();
	}

	public void repaintDownResultStoryArea(StatusManager sm, CreatePanel CP) {
		System.out.println("選択肢B決定");
		sm.getStory().setChoiceBStatus();
		m.culc(CP);
		CP.setStoryArea(sm.getStory().getResultBText());
		CP.setStatusLabel1();
		CP.setStatusLabel2();
		CP.setStatusLabel3();
		CP.setStatusLabel4();
		CP.invisibleUGP();
		CP.setInvisibleCACPanel();
	}

	public void repaintStoryArea(StatusManager sm, CreatePanel CP, JFrame f, KeyAction ka) {
		//Story表示時にminusステータスならBADED分岐、20回
		System.out.println("本文表示するよ");
		int storySize = sm.storyList.size();
		if (sm.getStatus1() <= 0 ||
				sm.getStatus2() <= 0 ||
				sm.getStatus3() <= 0 ||
				sm.getStatus4() <= 0) {
			CP.setEDPanel(f, sm);
		} else if (storySize == 0) {
			CP.setEDPanel(f, sm);
		} else {
			if(ka.getpressEnterKeyCount()>0) {
			sm.incrementDay();
			}
			CP.setBgPanel(sm.getStory().getImagePath());
			CP.setStoryArea(sm.getStory().getText());
			CP.setUpArea(sm.getStory().getChoiceAText());
			CP.setDownArea(sm.getStory().getChoiceBText());
			CP.setStatusLabel1();
			CP.setStatusLabel2();
			CP.setStatusLabel3();
			CP.setStatusLabel4();
			CP.setDayLabel();
			CP.visibleUGP();
			CP.setVisibleCACPanel();
			if (f != null) {
				System.out.println("Painter:fの中身はあります");
			} else {
				System.out.println("Painter:値が null です");
			}
		}
	}

	//これ戻り値で返してもrepaintできなくね？
	//		もしrepaintするなら、戻された瞬間か、このメソッド呼び出した最後に入れるか		

}