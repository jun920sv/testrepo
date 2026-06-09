package print13;

/*
 * 具象クラス
 * 文字列が数字だけで構成されているかチェックするクラス
 */

public class NumberValidator extends Validator{
	
	//コンストラクタ
    public NumberValidator() {
        super("NumberValidator");
    }
    
    @Override
	protected boolean check(String value) {
    	if(value.matches("\\d+")) {
    		return true;
    	}
		return false;
	}
    /*
     * 具象メソッド：check
     * アクセス修飾子：protected
     * 抽象メソッドをオーバーライドして実装する
     * 処理：判定する文字列が、正規表現を用いて、全て数字かどうか判定する
     */

}
