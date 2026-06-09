
package Typing.Model;

public class SoundManager {

	private static Sound[] typeSounds = {
			new Sound("キーボード1.wav"),
			new Sound("キーボード1.wav"),
			new Sound("キーボード1.wav")

	};

	private static int index = 0;

	public static void playType() {
		typeSounds[index].play();
		index = (index + 1) % typeSounds.length;
	}

	public static Sound TYPE = new Sound("キーボード1.wav");
	public static Sound SELECT = new Sound("ボタン5.wav");
	public static Sound TIME_OVER = new Sound("ビープ音.wav");
	public static Sound WIN = new Sound("Win.wav");
	public static Sound CLEAR = new Sound("Clear.wav");
	//	public static sound CLEAR = new sound("clear.wav");
}
