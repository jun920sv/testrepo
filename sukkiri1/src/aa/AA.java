package aa;

public class AA {
	public static void main(String[] args) {
			AA a = new AA();
		// 呼び出し方（カッコの中にデータを渡す）
				AA.greetUser("田中"); // ➔ 田中さん、こんにちは！
				a.B("佐藤"); // ➔ 佐藤さん、こんにちは
	}
		
		public static void greetUser(String name) {	
		    System.out.println(name + "さん、こんにちは！");
		    
		}	
		
		public void B(String name) {
			System.out.println(name);
			
		}
		
		
	}
	