package print09;

public class Animal {

	private String name;
	private int age;
	private String kind;
	private String cry;

	//コンストラクタ 
	public Animal(String name, int age, String kind, String cry) {

		this.name = name;
		this.age = age;
		this.kind = kind;
		this.cry = cry;
	}

	//setter、getter 

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}

	//通常メソッド（introduce） }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getCry() {
		return cry;
	}

	public void setCry(String cry) {
		this.cry = cry;
	}

	public void introduce() {
		System.out.printf("%sは%d歳の%sです。鳴き声は%sです\n", this.name, this.age, this.kind, this.cry);
	}

}
