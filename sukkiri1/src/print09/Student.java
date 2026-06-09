package print09;

public class Student {

	private String name;
	private int[] scores; // ← 配列フィールド

	
	public Student(String name,int[] scores){
		this.name=name;
		this.scores=scores;
		
	}
	/* * コンストラクタ 
	 * * 引数：String name、int[] scores 
	 * * 処理：フィールドに引数をセット 
	 * */

	public void showScores() {
		System.out.printf("名前:%s\n",this.name);
		int count=0;
		for(int t :scores){
			count++;
			System.out.printf("%d科目:%d点\n",count,t);
		}
		
	}
	
	/* 
	 * メソッド名：showScores * 引数：なし 
	 * * 戻り値：なし 
	 * * 処理：以下の形で表示。
	 *
	* 名前 : 
	* * 1科目目： 
	* * 2科目目： 
	* * 3科目目； 
	* */
}
