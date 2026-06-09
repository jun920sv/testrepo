package print10;

public class Person {

	private String name; //名前 

	private int age; //年齢 

	private int gender; //性別（0:男性、1:女性） 

	private String hobby; //趣味 

	/* 
	 * コンストラクタ（名前、年齢、性別の指定） 
	 * 引数：name（名前）、age（年齢）、gender（性別コード） 
	 * 処理内容：各setterを呼び出し、バリデーション済みの値をセットする */

	public Person(String name, int age, int gender) {

		setName(name);
		setAge(age);
		setGender(gender);
	}

	/*
	  コンストラクタ（趣味まで含めた指定
	  引数：name（名前）、age（年齢）、gender（性別）、hobby（趣味）
	  処理内容：3つの引数のコンストラクタを呼び出した後、趣味をセットする 
	 */
	public Person(String name, int age, int gender, String hobby) {
		this(name, age, gender);
		setHobby(hobby);
	}

	/* 
	 *  メソッド名：getName（名前の取得） 
	 *  引数：なし * 戻り値：名前（String）
	 *  処理内容：名前が空（nullまたは空文字）なら「名無し」を返し、それ以外はそのまま返す 
	 *  */
	public String getName() {
		if (name == null || name.equals("")) {
			return "名無し";
		}
		return name;
	}

	/*
	 * メソッド名：setName（名前の設定
	 * 引数：name（設定したい名前
	 * 戻り値：なし
	 * 処理内容：引数が空なら「名無し」を代入し、それ以外はそのまま代入する 
	 */
	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			this.name = "名無し";
		} else {
			this.name = name;
		}
	}

	/*メソッド名：getAge（年齢の取得
	*引数：なし
	* 戻り値：年齢（int）
	* 処理内容：保持している年齢が0未満の場合は0を返し、それ以外はそのまま返す
	*/
	public int getAge() {
		if (this.age < 0) {
			return 0;
		}
		return this.age;
	}

	/*  メソッド名：setAge（年齢の設定）
	* 引数：age（設定したい年齢） 
	* 戻り値：なし 
	* 処理内容：0未満の値が指定された場合は0をセットし、それ以外はそのままセットする 
	*/

	public void setAge(int age) {
		this.age = Math.max(age, 0);
	}

	/* メソッド名：getGender（性別コードの取得） 
	 * 引数：なし 
	 * 戻り値：性別コード（int） 
	 * 処理内容：現在保持している性別の数値（0または1）を返す */

	public int getGender() {
		return this.gender;
	}

	/*メソッド名：setGender（性別コードの設定）
	 * 引数：gender（0:男性、1:女性）
	 * 戻り値：なし 
	 * 処理内容：0または1以外の値が指定された場合は0をセットし、それ以外はそのままセットする 
	 */
	public void setGender(int gender) {
		if (gender != 0 && gender != 1) {
			gender = 0;
		} else {
			this.gender = gender;
		}
	}

	/*メソッド名：getHobby（趣味の取得
	 * 引数：なし 
	 * * 戻り値：趣味（String
	 * 処理内容：趣味が空（nullまたは空文字）なら「ありません」を返し、それ以外はそのまま返す */

	public String getHobby() {
		if (hobby == null || name.equals("")) {
			return "ありません";

		}
		return hobby;

	}

	/* メソッド名：setHobby（趣味の設定）
	* 引数：hobby（設定したい趣味
	* 戻り値：なし 
	* 処理内容：引数が空なら内部的にnullをセットし、それ以外はそのままセットする 
	* 
	* */
	public void setHobby(String hobby) {
		if (hobby == "") {
			hobby = null;
		} else {
			this.hobby = hobby;
		}
	}

	/*メソッド名：getGenderLabel（性別名称の取得）
	 * 引数：なし * 戻り値：性別の漢字表記（String）
	 * 処理内容：性別コードが0なら「男性」、それ以外なら「女性」を返す */

	public String getGenderLabel() {
		if (gender == 0) {
			return "男性";
		} else {
			return "女性";
		}
	}
	/* * メソッド名：show（情報の表示） 
	 * 引数：なし * 戻り値：なし 
	 * 処理内容：各getterを利用して、整形された自己紹介メッセージを画面に表示する */

	public void show() {
		System.out.printf("%sさんの性別は%sで、年齢は%d歳、趣味は%s。\n", getName(), getGenderLabel(), getAge(), getHobby());

	}
	/* メソッド名：hasSameName（同名判定）
	 * 引数：name（比較したい名前）
	 * 戻り値：一致するかどうか（boolean
	 * 処理内容：引数がnullならfalseを返す。
	 * それ以外はgetNameの結果と比較した結果を返す */

	public boolean hasSameName(String name) {
		if (name == null) {
			return false;
		} else {
			return getName().equals(name);

		}
	}
}
