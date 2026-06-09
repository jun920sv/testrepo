package practice17_print01;

public class Main {
	public static void main(String[] args) {

		try {
			String s =null;
			s.length();
	
		} catch (NullPointerException e) { //例外が
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("--スタックトレース(ここから)--");
			e.printStackTrace();
			System.out.println("--スタックトレース(ここまで)--");
			
		}	
	}

}
