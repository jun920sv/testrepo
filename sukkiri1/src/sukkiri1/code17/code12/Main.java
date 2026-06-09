package sukkiri1.code17.code12;

public class Main {

	public static void main(String[] args) {
		try {
			throw new UnsupporeedMusicFileException("未対応のファイルです");
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.getMessage();
			e.printStackTrace();
			
			
		}

	}

}
