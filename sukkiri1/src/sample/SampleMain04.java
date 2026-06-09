package sample;

class Uranai {
	String name;
	int age;
	
	void show() {
		System.out.println(name +"、歳は"+ age);
	}
	
}

public class SampleMain04 {

	public static void main(String[] args) {

		Uranai suisyo = new Uranai();
		suisyo.name = "湊";
		suisyo.age = 22;
		suisyo.show();
		
		
	}

}
