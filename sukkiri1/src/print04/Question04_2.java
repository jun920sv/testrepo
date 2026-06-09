package print04;

public class Question04_2 {

	public static void main(String[] args) {

		int[] array = { 5, 3, 10, 8, 2, 4, 1, 4, 7, 9, 0, 4, 3, 1 };
		int index = -1;//１番目の判定にならないように

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 2) {
				index = i;
				break;//書き変わらないように
			}
		}
		if (index != -1) {
			System.out.println("2の値は" + index + "番目に出現します");
		} else {
			System.out.println("2の値はありませんでした");
		}

		int count = 0;
		for (int i : array) {
			if (array[i] == 4) {
				count++;
			}
		}
		System.out.println("4の値は" + count + "個出現した");

		index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 3) {
				index = i;
				//break をしないと最後までチェックする
			}
		}
		System.out.println("最後に現れる3の値は" + index + "番目です");

		index = -1;
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == 3) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			System.out.println("最後に現れる3の値は" + index + "番目です");
		} else {
			System.out.println("3の値はありませんでした");
		}

	}

}
