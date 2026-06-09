package practice14_print01;

public class Main {
	public static void main(String[] args) {
		Bank a = new Bank("4649", 1592);
		Bank b = new Bank("  4649", 1592);
		Bank c = new Bank();
		a.show();
		System.out.println(a);

		if (a.equals(b)) {
			System.out.println("同じ");
		} else {
			System.out.println("違う");
		}
		
		if (a.equals(c)) {
			System.out.println("同じ");
		} else {
			System.out.println("違う");
		}
	}
}

class Bank {
	String accoutNumber;// 口座番号
	int balance;// 残高
public Bank() {
	this.accoutNumber = "4649";
}
	public Bank(String accoutNumber, int balance) {
		this.accoutNumber = accoutNumber;
		this.balance = balance;
	}

	void show() {
		System.out.printf("\\%d(口座番号:%s)\n", this.balance, this.accoutNumber);
	}

	@Override // 
	public String toString() {//toString は必ずpublic 
		return "\\" + balance + "(口座番号:" + this.accoutNumber + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			//まったく同じ存在ならtrue
			return true;
		}

		if (obj instanceof Bank obj2) {
			//口座番号が同じかどうか、半角スペースを消して比較
			return this.accoutNumber.trim()
					.equals(obj2.accoutNumber.trim());
		} else {
			//そもそもAcountクラスにキャストできないならfalse
			return false;
		}
	}

}
