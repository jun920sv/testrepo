package print02;

import java.util.Scanner;

class Animal{
	int age;
	
	
	Animal(){
		Scanner sc =new Scanner(System.in);
		System.out.println("年齢を整数で入力してください");
		age = sc.nextInt();
		
		
	}
	String tosi() {
		if(age<6 || age>=70) {
			return "無料";
			
		}else if(age<=12) {
			return "500円";
		}else {
			return "1000円";
				
			}
		}
		
	}
	

public class Question12 {
	public static void main(String args[]) {
		
		Animal a = new Animal();
		String b = a.tosi(); 
		int age = a.age;
		System.out.println(age+"のお客様の入園料は"+b+"です");
		
	
	
	}
	

}
