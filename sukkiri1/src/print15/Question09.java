package print15;

import java.util.Scanner;

public class Question09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("果物名 個数 を入力してください");
		String input = sc.nextLine(); 
		
		String[] fruit = input.split("\\s");
		
		System.out.println(fruit[0]);
		System.out.println(fruit[1]);
		
		System.out.printf("果物名:%s\n",fruit[0]);
		System.out.printf("個数:%d\n",Integer.parseInt(fruit[1].replace("%s","")));
		

	}

}
