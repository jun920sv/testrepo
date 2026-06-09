package sukkiri1.code16.code02;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();//参照型しか取り扱うことできない
		points.add(10);
		points.add(80);
		points.add(75);

		for (int i : points) {
			System.out.println(i);
		}

		Integer i1 = Integer.valueOf(16);
		int i2 = i1.intValue();
		methodA(16);
	}
/*
	public static void methodA(int i) {
		System.out.println("A");
	}
*/
	public static void methodA(long l) {
		System.out.println("long");
	}
/*
	public static void methodA(Integer i) {
		System.out.println("Integer");
		*/
		
	}

