package print03;

class D {
	int roop;
	int syokiti;

	D(int syokiti,int roop){
		this.syokiti =1;//１で固定される　本当は代入するなら
		this.roop = roop;//D(int roop)のみでいい
	
	}
	
	void a() {
		for (int i = syokiti; i <= roop; i++) {
			if (i % 2 == 0) {
				System.out.println("偶数です");
			} else {
				System.out.println("奇数です");
			}
		}

	}

}

public class Question06 {
	public static void main(String[] args) {
		D c = new D(3,5);//(1で固定されてる)
		c.a();

	}

}
