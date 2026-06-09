package sample;

class Me {
	int isHungry;
	String food;

	int isHungry() {
		if (isHungry == 0) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class SampleMain07 {
	public static void main(String[] args) {

		Me h = new Me();
		Me f = new Me();

		h.isHungry = 0;
		f.food = "パン";

		System.out.println("こんにちは");

		if (h.isHungry() == 0) {
			System.out.println("はらぺこです");
		} else {
			System.out.println("お腹がいっぱいです");
		}

		if (h.isHungry()==0) {
			System.out.println(f.food + "をいただきます");
			System.out.println("ごちそうさまでした");
		}
	}
}