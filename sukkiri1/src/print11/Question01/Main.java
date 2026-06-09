package print11.Question01;

public class Main {

	public static void main(String[] args) {
		
		  //多態性を利用して、親クラス型配列を作り、子クラスインスタンスを要素に持つ
        Character[] characters = {
            new Warrior("勇者"),
            new Mage("魔法使い")
        };

        for (Character c : characters) {
            c.attack();
        }
    }
	
		
	

}
