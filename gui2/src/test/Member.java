package test;

import java.util.ArrayList;

public class Member {
	public static ArrayList<User> membersList = new ArrayList<User>();;
	
	public Member() {
	
		//public User(familyName,firstName,id,password) 
		membersList.add(new User("井上","真由弥","inoue","mayumi"));
		membersList.add(new User("キム","テヒョン","kimu","tehon"));
		membersList.add(new User("三木","朝子","miki","asako"));
		membersList.add(new User("永松","菫","nagamatsu","sumire"));
		membersList.add(new User("土井","葵","doi","aoi"));
		membersList.add(new User("増田","裕介","masuda","yusuke"));
		membersList.add(new User("苗字","名前","test","testtest"));
	}
}
//ログインアカウント増やす場合は同様にインスタンス作成してmemberListにadd
//例）new User( 苗字 , 名前 , ID ,password)