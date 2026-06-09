package print05;

public class Question09 {

	static int a = 10;
	static int[] arrayA = { 4, 8, 2, 10, 9, 3 };
	static int index1 = -1;

	static int b = 50;
	static int[] arrayB = { 20, 40, 60, 80, 50 };
	static int index2 = -1;

	static void searchInedx(int c, int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (c == arr[i]) {
				index1 = i;
				break;
			}
		}
		if (index1 == -1) {
			System.out.println(c + "は、配列の中には存在しません");
		} else {
			System.out.println(c + "は、配列の" + (index1+1) + "番目に存在します。");
		}
	}

	static void message() {
		searchInedx(a,arrayA);
		searchInedx(b,arrayB);
	}

	public static void main(String[] args) {
		 message();
	}
}
