package sukkiri1.code17.code12;

public class UnsupporeedMusicFileException extends Exception{//ここで例外を決めてる
	//別名を付けてる　分かりやすいように　ただのException
	public UnsupporeedMusicFileException(String msg) {
		msg="予期せぬ音楽が"+msg;
		super(msg);
	}

}


