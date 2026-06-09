package sukkiri1.code15.code04;

public class Main {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();//文字情報を組み上げるための領域
		
		for(int i = 0; i<3; i++) {
			sb.append("java"); //後ろに追加する これだと javajavajava
		}
		System.out.println(sb.toString());//オブジェクトをStringに変える
		
		String a =""; //StringBuilderだと早い 
		for(int i = 0; i<100; i++) {//演算子だと時間かかる　+ 
			a+="java";
		}
		System.out.println(a.toString());
		
		sb.charAt(10);
		sb.setLength(0);//リセットと同じ動き よく使う
		sb.insert(0, a);
		
		StringBuilder sbb = new StringBuilder();
		sbb.append("aiu");
		StringBuilder sb1 = sbb.append("A").append("B").append("C");
		System.out.println(sb1); //メソッドチェーン
		
		
		
		
	}

}
