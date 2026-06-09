package print09;

public class PersonBuilder2 {

	//フィールド 
	private String name;
	private int age;

	/* 
	 * メソッド名：name 
	 *  引数：String型   
	 *  戻り値：PersonBuilder型 
	 *  処理：引数の値をセットし、自身（インスタンス）を戻り値とする 
	*/
	public PersonBuilder2 name(String n) {
		this.name = n;
		return this;
	}

	/* 
	 * メソッド名：age 
	 *  引数：int型 
	 *   戻り値：PersonBuilder型 
	 *    処理：引数の値をセットし、自身（インスタンス）を戻り値とする 
	 *    
	 */
	public PersonBuilder2 age(int a) {
		this.age = a;
		return this;
	}

	/*
	
	* メソッド名：build 
	*  引数：なし 
	*  戻り値：Person型 
	*  処理：Personインスタンスを生成（引数はフィールド値）し、インスタンスを返す。 
	*  */

	public Person2 build() {
		//int age =10;//ローカル優先
		Person2 p = new Person2(this.name, age);//this.は省略されてる
		return p;

	}
}