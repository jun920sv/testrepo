package practice06_print01;

import practice06_print01_comment.Zenhan;//前半はimport 後半完全修飾名

public class Main {
	public static void main(String[] args) throws Exception {

		Zenhan.doWarusa();
		Zenhan.doTogame();
		practice06_print01_comment.Kouhan.callDeae();
		practice06_print01_comment.Kouhan.showMondokoro();
		Thread.sleep(5000); 
		Zenhan.doTogame();
	}

}
