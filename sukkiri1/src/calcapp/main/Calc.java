package calcapp.main;

import calcapp.logics.CalcLogic;//簡略するためのもの

public class Calc {
	public static void main(String[] args) {

		int a = 10;
		int b = 2;
		int total = calcapp.logics.CalcLogic.tasu(a, b);//package名+クラス名
		int delta = CalcLogic.hiku(a, b);//インポートした簡略文
		
		int sum =  sukkiri1.code06.code02.CalcLogic.tasu(a, b);//完全修飾名
		
		System.out.printf("足すと%d、引くと%d,%d", total, delta,sum);
	
	
	
	}
}

