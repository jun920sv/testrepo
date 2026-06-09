package sukkiri1.code14.code02;

public class Main {
	public static void main(String[] args) {

		Object o1 = "d";
		Object o2 = 10;
		Object o3 = new Empty();
		print(o1);
		print("200");
		print(10);
		print(o3);

	}
	
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
	
}

class Empty {
	public String toString() {
		return "あか";
	}
}
