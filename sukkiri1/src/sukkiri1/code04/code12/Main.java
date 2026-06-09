package sukkiri1.code04.code12;

public class Main {
	public static void main(String[] args) {
		int[] arrA = {3,4};		
		if(true) {
			int[] array = {1,2,3};
			arrA = array;
		}

		System.out.println(arrA[0]);
	}

}
