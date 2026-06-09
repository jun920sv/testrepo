package print09;

public class Questions02 {

	public static void main(String[] args) {
		
		//配列の宣言 
		int[] scores={80,90,75};
		int[] scores1={65,50,100,100};
		
		
		//Studentクラスのインスタンスを生成 
		Student s = new Student("太郎",scores);
		
		Student s1 = new Student("たたろう",scores1);
		//showScoresのメソッドを呼ぶ
		s.showScores();
		s1.showScores();
	}

}
