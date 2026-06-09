package print02;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("成績");
		int num = sc.nextInt();
		
		if (num>=90) {
			System.out.println("優秀");
		
		}else if (90 > num && num >= 80) {
			System.out.println("良好");
			
		}else if(80> num &&num>=70) {
			System.out.println("普通");
			
		}else if(70> num &&num>=60) {
			System.out.println("可");
			
		}else if(num<60) {
			System.out.println("不可");
			
		}
		sc.close();
	}
}