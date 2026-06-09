package sukkiri1.code04.code11;

public class Main {
	public static void main(String[] args) {
		int[] arrayA = { 1, 2, 3 };
		int[] arrayB;
		arrayB = arrayA;//同じ住所が参照される
		arrayB[0] = 100;//そのためarrayA[0]に100が代入されてる
		
		System.out.println(arrayA[0]);
		System.out.println(arrayB[0]);
		
		
		
	}

}
