package sukkiri1.code14.code04;

import java.util.Objects;

public class Main {

	public static void main(String[] args) {

		Hero h1 = new Hero();
		h1.name = "みなと";
		h1.hp = 100;

		Hero h2 = new Hero();
		h2.name = "みなと";
		h2.hp = 100;

		if (h1.equals(h2)) {
			System.out.println("同じ");
		} else {
			System.out.println("違う");
		}

		if (h1.name.equals(h2.name)) {
			System.out.println("同じ");
		} else {
			System.out.println("違う");
		}
		System.out.println(h1+":"+h2);
	}
}

class Hero {
	String name;
	int hp;

	@Override
	public int hashCode() {
		// TODO 自動生成されたメソッド・スタブ
		return Objects.hash(name, hp);//可変長なので引数なんでもOK
	}

	@Override //Objects 大元 
	public String toString() {//toString は必ずpublic 
		return "名前:" + name + "/hp:" + hp;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj instanceof Hero h) {
			return this.name.equals(h.name)
					&& this.hp == h.hp;
		} else {
			return false;
		}
	}

}
