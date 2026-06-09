package print13;

/*
* 具象クラス
* 文字列の長さをチェックするクラス
*/

public class LengthValidator extends Validator{

	private int min;	//判定基準の長さ
    //コンストラクタ
    public LengthValidator(int min) {
        super("LengthValidator");
        this.min = min;
    }
    @Override
	protected boolean check(String value) {
    	if(min <= value.length()) {
    		return true;
    	}
		return false;
	}
    /*
    * 具象メソッド：check
    * アクセス修飾子：protected
    * 抽象メソッドをオーバーライドして実装する
    * 処理：判定する文字列が、判定基準の長さ以上かどうかチェックする
    */
  
}
