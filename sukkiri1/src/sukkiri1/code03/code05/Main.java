package sukkiri1.code03.code05;

public class Main {

	public static void main(String[] args) {
		 int height = 178;
		char size;

		if (height >= 170) {
			size = 'L';
		} else if (height >= 155) {
			size = 'M';
		} else if (height >= 140) {
			size = 's';
		} else {
			size = '？';

		}
		System.out.println(size);

		if (height >= 140 && height<150) {
			size = 'S';
		} else if (height >= 155 && height <170) {
			size = 'M';
		} else if (height >= 170) {
			size = 'L';
		} else {
			size = '？';

		}
		System.out.println(size);
	}

}
