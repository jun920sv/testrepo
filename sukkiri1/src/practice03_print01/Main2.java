package practice03_print01;

public class Main2 {

	public static void main(String[] args) {
		final int HUNGRY;
		final int NOT_HUNGRY;
		String food;

		HUNGRY = 1;
		NOT_HUNGRY = 0;

		int isHungry = HUNGRY;

		food = "ハンバーガー";

		System.out.println("こんにちは");

		if (isHungry == NOT_HUNGRY) {
			System.out.println("お腹がいっぱいです");

		} else {
			System.out.println("はらぺこです");
			System.out.println("はらぺこです");

		}

		if (isHungry != 0) {
			System.out.println(food + "をいただきます");
			System.out.println("ごちそうさまでした");
		}

	}

}
