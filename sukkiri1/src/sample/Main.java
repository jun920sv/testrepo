package sample;

public class Main {
	public static void main(String[] args) {
		int x = 10;
		int result = calc(x);
		System.out.println(result);
		System.out.println();

		int[] nums = { 1, 2, 3 };
		work(nums);
		System.out.println(nums[1]);
		for (int i : nums) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		int result2 = sum(5);
		System.out.println(result2);
	}

	public static int sum(int n) {
		if (n == 0) {
			return 0;
		}
		return n + sum(n - 1);
	}

	

	public static int calc(int x) {
		int c = x + 5;
		return c;
	}

	public static void work(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] += 10;
		}
	}
}
