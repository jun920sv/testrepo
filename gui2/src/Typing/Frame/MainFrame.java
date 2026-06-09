package Typing.Frame;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Typing.Model.Score;

public class MainFrame {
	public MainFrame() {

		JFrame frame = new JFrame("ジャバレンジャー");
		frame.setSize(1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		CardLayout layout = new CardLayout();

		frame.add(panel);
		panel.setLayout(layout);
		
		Score score = new Score();
		Result result = new Result();

		JPanel Title = new JPanel();
		JPanel Use = new JPanel();
		JPanel Mode = new JPanel();
		JPanel Level = new JPanel();
		JPanel Start = new JPanel();
		JPanel Play = new JPanel();
		JPanel Pause = new JPanel();
		JPanel Result = new JPanel();
		JPanel Ranking = new JPanel();
		JPanel Ranking2 = new JPanel();

		Title = new Title(layout, panel).TitlePanel();
		Use = new Use().TitlePanel(layout, panel, score);
		Mode = new Mode(layout, panel);
		Level = new Level().DifficultyPanel(layout, panel);
		Start = new Start(layout, panel);
		Play = new Play_Boss(layout, panel, score,result);
		Pause = new Pause(layout, panel,score);
		Result = result.ResultPanel(layout, panel, score);
		Ranking = new Ranking(score).createRanking1(layout, panel);
		Ranking2 = new Ranking2(score).createRanking1(layout, panel);

		panel.add(Title, "タイトル");
		panel.add(Use, "遊び方");
		panel.add(Mode, "モード");
		panel.add(Level, "難易度");
		panel.add(Start, "スタート");
		panel.add(Play, "プレイ");
		panel.add(Pause, "ポーズ");
		panel.add(Result, "リザルト");
		panel.add(Ranking, "ランキング");
		panel.add(Ranking2, "ランキング2");

		frame.setVisible(true);
	}
}
