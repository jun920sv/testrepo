package sukkiri1.code04.code03;

public class Main {
	public static void main(String[] args) {
		int [] scores = {20,30,40,50,80};
		
		int[] scores1 = new int[5];
		scores1 = new int [] {20,30};
		System.out.println(scores[2]);
	//	int a = scores[5]; //エラーになるArrayIndexOutOfBoundsException
	//	System.out.println(a);//Index 5は　配列の領域外です

	int sum = scores[0]+scores[1]+scores[2]+scores[3]+scores[4];
	int avg = sum/scores.length;
	
	System.out.println("合計点"+sum);
	System.out.println("平均点"+avg);
	
	
	
	}

}
