package sukkiri1.code05.code03;

class Main {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");

		A a = new A();
		a.hello("湊");
		a.hello("朝霞");
		a.hello("菅原");

		System.out.println("メソッドの呼び出しが終わりました");
	}
}

  class A {
	 void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
}
