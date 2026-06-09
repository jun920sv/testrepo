package print12.Question03;

public class Main {

	public static void main(String[] args) {

		ConfigManager c1 = ConfigManager.getInstance();
		//ConfigManagerクラスのインスタンスを取得する 変数名：c1

		c1.set("url", "localhost");
		//c1を使ってkey:url  value:localhost を登録する
		c1.set("user", "admin");
		//c1を使ってkey:user  value:admin を登録する
		
		//ConfigManager c2 =c1;つまりこれ
		ConfigManager c2 = ConfigManager.getInstance();
		//ConfigManagerクラスのインスタンスを取得する 変数名：c2
		
		System.out.println(c2.get("url"));
		//c2を使ってkey:url のvalueを取得して表示
		
		System.out.println(c2.get("user"));
		//c2を使ってkey:user のvalueを取得して表示
		System.out.printf("同じインスタンス？ %s\n",c1.equals(c2));

		System.out.printf("同じインスタンス？ %s\n",c2.equals(ConfigManager.getInstance()));
		//c1とc2が同じインスタンスかどうか比較する

	}

}
