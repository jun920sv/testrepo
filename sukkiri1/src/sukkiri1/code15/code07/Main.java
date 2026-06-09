package sukkiri1.code15.code07;

public class Main {

	public static void main(String[] args) {
		String s = "abc,def:ghl";
		
		String[]words =s.split("[,:]");
		for(String w :words) {
		System.out.println(w+"->");
		}
		
		
		
	}

}
