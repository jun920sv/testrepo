package sukkiri1.code05.code09;

public class Main {
	public static void printArray(int[]array) {
		for(int elsement:array) {
			System.out.println(elsement);
		}
	}
	public static void add(int x) {
		x++;
}
	public static void add(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]++;
		}
		
}
	
	public static void main(String[] args) {
		int[] array= {1,2,3};
		printArray(array);

		int x = 10;
		add(x);
		System.out.println(x);
		
		add(array);
		printArray(array);
	}

}
