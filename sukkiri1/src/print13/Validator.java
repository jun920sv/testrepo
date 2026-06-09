package print13;
/*
 * 抽象クラス
 * Validator : 検証する
 */

public abstract class Validator {
	protected String validatorName; //クラス名を受け取る
	//コンストラクタ

	public Validator(String validatorName) {
		this.validatorName = validatorName;
	}
	
	public boolean validate(String value) {
		
		
		
		if(value == null) {
			return false;
		}
		
		String newValue = before(value);		
		boolean result= check(newValue);
		after(result);
		
		return result;
	}

	/*
	 * 動的メソッド：validate
	 * アクセス修飾子：public
	 * 引数：String value（検証する文字列）
	 * 戻り値：boolean
	 * 処理：①null判定し、nullならfalse
	 *       ②beforeメソッドを呼ぶ
	 *       ③checkメソッドを呼ぶ
	 *       ④afterメソッドを呼ぶ
	 *       戻り値を返す
	 * ②→③→④がテンプレート箇所
	 */

	
	protected String before(String value) {
		String a =value.trim();
		return a;
		
	}
	/*
	 * 動的メソッド：before
	 * アクセス修飾子：protected
	* 引数：String value（検証する文字列）
	 * 戻り値：String
	 * 処理：検証前に文字列の前後の空白を取り除く
	 */

	protected abstract boolean check(String value);
	
	/*
	 * 抽象メソッド：check
	 * アクセス修飾子：protected
	 * 引数：String value（検証する文字列）
	 * 戻り値：boolean
	 * 検証したい内容は子クラスで実装する。
	 */

	protected void after(boolean result) {
		
	System.out.printf("%s => 結果%s\n,lor",validatorName,result);
	}
	
	/*
	 * 動的メソッド：after
	 * アクセス修飾子：protected
	 * 引数：boolean result(検証結果）
	 * 戻り値：なし
	 * 処理：「validatorName => 結果」の形で表示する
	 */

}
