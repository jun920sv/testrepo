package print04;

public class Question06_2 {
	public static void main(String[] args) {

		int max = Integer.MIN_VALUE;//最小値だから必ず大きくなる
		int min = Integer.MAX_VALUE;//最大値だから必ず小さくなる
	
		int[] c = { 25, 94, 89, 10, 3, 14, 11, 67 };
	
		for(int i:c) {
			max=Math.max(max, i);
			min=Math.min(min, i);
		}
		
		System.out.println("最大値" + max);
		System.out.println("最小値" + min);
	}
}
