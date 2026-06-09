package sukkiri1.code18.code03;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

public class Main {

	public static void main(String[] args) {
		try {
			URI u = URI.create("https://cal.co.jp");
			try (InputStream is = u.toURL().openStream()) {
				int i = is.read();
				while (i != -1) {
					System.out.print((char) i);
					i = is.read();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
