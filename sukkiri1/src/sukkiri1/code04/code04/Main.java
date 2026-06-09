package sukkiri1.code04.code04;

public class Main {
	public static void main(String[] args) {
		int [] scores= {20,30,40,50,80};
		int sum=0;
		for(int i = 0;i<scores.length; i++) {
			
			sum += scores[i];
			System.out.println(scores[i]);
		}
		System.out.println(sum);
	}

}
