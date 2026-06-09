package print15;

public class Question11 {
	public static void main(String[] args) {
		
		String csv="""
				#名前,年齢,性別
				Alice,20,女性
				Bob,21,男性
				Carol,19,女性
				""";
		
		String[]strArray=csv.split("\n");
		for(String s: strArray) {
			System.out.println(s);
		}
		int count=0;
		for(String row:strArray) {
			if(row.startsWith("#")) {
				continue;
			}
			count++;
		}
		String[][] datas =new String[count][];
		for(int i=0; i<datas.length;i++) {
			datas[i]=strArray[i+1].split(",");
		}
		
		for(String[] row:datas) {
			for(String s :row) {
				if(!s.matches("[0-9]+")) {
					System.out.print(s+" ");
					
					
					
				}
				
			}
		}
		
		
		
	}

}
