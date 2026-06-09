package print10;

import java.util.Scanner;

public class Questions03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ContactBook cb = new ContactBook();

		while (true) {
			System.out.println("操作を選択してください。");

			int select = 0;

			while (!(select == 1 || select == 2 || select == 3)) {

				System.out.print("1:登録 2:連絡帳一覧表示 3:電話番号検索 ＞＞");

				
				select = Integer.parseInt(sc.nextLine());
				//select = sc.nextInt();
				//sc.nextLine();

			}
			if (select == 1) {

				//登録処理を呼ぶ 
				register(sc, cb);

			} else if (select == 2) {

				//一覧表示を呼ぶ 
				showList(cb);
			} else if (select == 3) { 
				//検索を呼ぶ 
				search(sc, cb);
			} else {
				System.out.println("1:登録 2:連絡帳一覧表示 3:電話番号検索");
			}
			String yn = "";

			while (!(yn.equals("n") || yn.equals("y"))) {

				System.out.print("続けて操作を行いますか？： y / n ＞ ");
				yn = sc.nextLine();
			}
				if (yn.equals("n")) {
					break;
				}
		}
		System.out.println("連絡帳の操作を終了します。");
	}

	// --- 登録処理 --- 
	private static void register(Scanner sc, ContactBook cb) {

		System.out.println("連絡帳に名前と電話番号を登録します。");

		System.out.println("電話番号は090-XXXX-XXXXの形になります。");

		System.out.println("名前：");
		String name = sc.nextLine();

		System.out.print("電話番号：");
		String tel = sc.nextLine();

		//連絡帳に追加する 				
		boolean result = cb.entryPerson(name, tel);

		if (result) {
			System.out.println("登録をしました。");

		} else {

			System.out.println("登録できませんでした。");
		}
	}

	// --- 一覧表示 --- 
	private static void showList(ContactBook cb) {
		if (cb.getListSize() == 0) {

			System.out.println("連絡帳は登録されていません");

		} else {
			cb.getPersonList();
		}

	}

	// --- 検索 --- 
	private static void search(Scanner sc, ContactBook cb) {

		System.out.print("検索したい名前を入力してください：");

		String name = sc.nextLine();
		String s = (cb.getTel(name));
		System.out.println(s);
	}
}
