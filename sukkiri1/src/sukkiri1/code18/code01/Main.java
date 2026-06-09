package sukkiri1.code18.code01;

import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("data.txt")){
			int input =fr.read();
			while(input !=-1) {
				System.out.print((char)input);
				input = fr.read();
			}
			}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
