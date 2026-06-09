package sukkiri1.code15.code08;

public class Main {
	public static void main(String[] args) {
	
		String s= "abc,def:ghl";
		String w =s.replace("[abc,def:ghl]", "X");//ALLとの違いは正規表現使えるか使えないか
		String w1 =s.replaceAll("[beh]", "X");//ALLは一致した
		System.out.println(w);
		System.out.println(w1);
		

	}

}
