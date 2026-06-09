package test.controller;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import test.service.LoginService;
import test.view.MainCardPanel;

public class LoginButtonLisner {
	
	
	public LoginButtonLisner(JTextField userField,JPasswordField passField, MainCardPanel mcp) {
	  // 入力された文字列を取得
	String inputId = userField.getText();
	String inputPass = new String(passField.getPassword()); 
	
	if (inputId.isEmpty() || inputPass.isEmpty()) {
        // 空文字の場合のアラート（第一引数は this または null）
        JOptionPane.showMessageDialog(null, 
            "ユーザーIDとパスワードを入力してください", 
            "入力エラー", 
            JOptionPane.ERROR_MESSAGE);
        return;
    }
	
	// LoginServiceを使って認証
    LoginService service = new LoginService();
	
    if (service.authenticate(inputId, inputPass,mcp)) {
        // 成功時
    	
    	mcp.changePanel("メイン");
        
        // : 次の画面へ遷移する処理
    } else {
        // 失敗時
        System.out.println("失敗: IDまたはPWが違います");
        JOptionPane.showMessageDialog(null, 
            "ユーザーIDまたはパスワードが間違っています。", 
            "エラー", JOptionPane.ERROR_MESSAGE);
        mcp.loginPanel.initialization();
    }
}


}
