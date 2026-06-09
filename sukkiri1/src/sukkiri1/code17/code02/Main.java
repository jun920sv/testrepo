package sukkiri1.code17.code02;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("data.txt");
				Scanner sc = new Scanner(System.in);){
			fw.write("hello!");
				
		} catch (IOException e) {
			System.out.println("例外です");
		}
	
		
	 finally {//必ず実行 される
		System.out.println("A");
		}
		
		
		
		
		
	}

}
