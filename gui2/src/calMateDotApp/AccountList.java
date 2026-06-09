package calMateDotApp;

import java.util.HashMap;
import java.util.Map;

public class AccountList {
	// アカウントリスト<ID, PW>
	private Map<String, String> accountsList;

	// アカウント作成
	public AccountList() {
		accountsList = new HashMap<String, String>();
		accountsList.put("dan", "1111");
		accountsList.put("kawamura", "1111");
		accountsList.put("nakayama", "1111");
		accountsList.put("kusumoto", "1111");
		accountsList.put("guest", "1111");
	}

	public Map<String, String> getAccountInfo(String inputId) {
		for (String accountId : accountsList.keySet()) {
			if (inputId.equals(accountId)) {
				// 指定アカウントのIDとPWのみ入ったMapを返す
				String accountPw = accountsList.get(accountId);
				Map<String, String> account = new HashMap<String, String>();
				account.put(accountId, accountPw);
				return account;
			}
		}
		// 指定アカウントが存在しなければNullを返す
		return null;
	}
}
