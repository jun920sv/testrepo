package test.service;

import test.Member;
import test.User;
import test.view.MainCardPanel;

public class LoginService {

    // IDとパスワードをチェックし、一致すればログインユーザーとして保持する
     
     
    public boolean authenticate(String id, String pass,MainCardPanel mcp) {
       
        // 比較用のダミーユーザー
        User inputUser = new User(null, null, id, pass);

        for (User user : Member.membersList) {
            if (user.equals(inputUser)) {
               mcp.mainPanel.setUser(user);
                return true;
            }
        }
        return false;
    }
}

