package print14.Question05;

public class Person implements Comparable<Person> {

	private String name;	//名前
	private int age;	

	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "さんの年齢は" + age + "歳です";
	}

	
	@Override
	public int compareTo(Person o) {
	//	return this.age - o.age;//昇順
	//	return o.age - this.age;//降順
		return Integer.compare(this.age, o.age);//Integer専用
	}

}
