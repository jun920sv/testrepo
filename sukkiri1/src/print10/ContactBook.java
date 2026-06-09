package print10;

import java.util.ArrayList;

public class ContactBook {
	private ArrayList<Person3> list = new ArrayList<Person3>();

	public void ContcBook() {

	}

	public boolean entryPerson(String name, String tel) {

		if (name == null || name.isEmpty()) {
			return false;
		}

		for (Person3 p : list) {
			if (p.getName().equals(name))
				return false;
		}
		if (!chkInput(tel)) {
			return false;
		}

		if (!chkTel(tel)) {
			return false;
		}
		createPerson(name, tel);

		return true;

	}

	private void createPerson(String name, String tel) {
		Person3 p = new Person3(name, tel);
		list.add(p);
	}

	private boolean chkInput(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		}
		return true;
	}

	private boolean chkTel(String tel) {
		if (!tel.matches("[\\d]{3}-[\\d]{4}-[\\d]{4}")) {
			return false;
		}
		return true;
	}

	public void getPersonList() {
		for (Person3 per3 : this.list) {
			System.out.printf("%s:%s\n", per3.getName(), per3.getTel());
		}
	}

	public String getTel(String name) {

		for (Person3 per3 : this.list) {
			if (per3.getName().equals(name)) {
				return per3.getTel();
			}
		}

		return "登録されていない人物です";
	}

	public boolean chkName(String name) {
		for (Person3 p : this.list) {
			if (p.getName().equals(name))
				return false;
		}
		return true;
	}

	public int getListSize() {
		return list.size();

	}

}
