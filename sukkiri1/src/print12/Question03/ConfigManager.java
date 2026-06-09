package print12.Question03;

import java.util.HashMap;

public class ConfigManager {
	private static ConfigManager instance;

	/*
	 * 静的フィールド
	 * ConfigManager型　変数名：instance
	 */

	//動的フィールド
	private HashMap<String, String> config = new HashMap<>();

	private ConfigManager() {
	}
	/*
	 * コンストラクタ
	 * ①アクセス修飾はprivate
	 * 引数：なし
	 * 処理：なし
	 */

	public static ConfigManager getInstance() {
		if (ConfigManager.instance == null) {//nullのときだから実質１つ
			instance = new ConfigManager();
		}
		return instance;

	}
	/*
	 * 静的メソッド
	 * メソッド名：getInstance
	 * 引数：なし
	 * 戻り値：ConfigManager型
	 * 処理：静的フィールドがnullの場合は、ConfigManagerクラスのインスタンスを生成
	 */

	public void set(String key, String value) {
		config.put(key, value);
	}

	/*
	 * 動的メソッド
	 * メソッド名：set
	 * 引数：String key, String value
	 * 戻り値：なし
	 * 処理：HashMapに登録
	 */

	public String get(String key) {
		return config.get(key);

	}
	/*
	 * 動的メソッド
	 * メソッド名：get
	 * 引数：String key
	 * 戻り値：String
	 * 処理：HashMapから取得。
	 */

}
