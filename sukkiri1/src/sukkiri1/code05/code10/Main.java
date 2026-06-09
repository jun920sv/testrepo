package sukkiri1.code05.code10;

public class Main {

	public static int[] makeArray(int size) {
		int[] newArray = new int[size];

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;//連番で値を入れる0.1.2.3.4

		}

		return newArray;
		//	return null;// エラー消しにいったんnull入れる　参照型は0の代わり
	}

	public static void main(String[] args) {
		int[] array = makeArray(4);
		for (int i : array) {
			System.out.println(i);
		}

	}
}