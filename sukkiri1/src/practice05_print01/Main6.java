package practice05_print01;

public class Main6 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		work(nums);
		System.out.println(nums[1]);
	}

	public static void work(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] += 10;
		}
	}
}
