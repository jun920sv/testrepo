package print16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Question07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, Set<String>> map = new HashMap<Character, Set<String>>();

		while (true) {
			System.out.println("データを登録する場合は1、データを表示する場合は2を入力してください");
			String input = sc.nextLine();
			switch (input) {
			case "1" -> {
				insert(map, sc);
				/*メソッド分離をしない場合
				System.out.println("登録したい単語を登録してください。");
				input = sc.nextLine();
				char c = input.charAt(0);
				if (map.containsKey(c)) {
					map.get(c).add(input);
				} else {
					Set<String> set = new TreeSet<String>();
					set.add(input);
					map.put(c, set);
				}
				*/
			}
			case "2" -> {
				findByKey(map, sc);
			}
			default -> {
				System.out.println("入力値が不正です");
			}
			}
			System.out.println("再度操作を行う場合はyを入力してください。それ以外は終了します");
			input = sc.nextLine();
			if (!input.equals("y")) {
				break;
			}
		}
		System.out.println("プログラムを終了します");

		sc.close();
	}

	public static void insert(Map<Character, Set<String>> map, Scanner sc) {
		System.out.println("登録したい単語を登録してください。");
		String input = sc.nextLine();
		char c = input.charAt(0);
		if (map.containsKey(c)) {
			map.get(c).add(input);
		} else {
			Set<String> set = new TreeSet<String>();
			set.add(input);
			map.put(c, set);
		}
	}

	public static void findByKey(Map<Character, Set<String>> map, Scanner sc) {
		System.out.println("表示するデータの頭文字を指定してください");
		String input = sc.nextLine();
		char key = input.charAt(0);
		
		if(map.containsKey(key)) {
			Set<String> value = map.get(key);
			for(String v : value) {
				System.out.println(v);
			}
		}else {
			System.out.println("登録されていません");
		}
	}

}
