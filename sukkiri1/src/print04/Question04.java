package print04;

public class Question04 {
	public static void main(String[] args) {

		int[] array = { 5, 3, 10, 8, 2, 4, 1, 4, 7, 9, 0, 4, 3, 1 };
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 2) {
				break;
			}
			count++;

		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 4) {
				count1++;
			}
		}

		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == 3) {
				count2 = i;
				break;

			}
		}
		System.out.println("2の値は" + count + "番目に出現します");
		System.out.println("4の値は" + count1 + "個出現した");
		System.out.println("最後に現れる3の値は" + count2 + "番目です");
	}
}
