package sukkiri1.code15.code08_2;

import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) {
		
		String str ="こんにちはJava";
		char[]deta =str.toCharArray();//これは覚えよう
		System.out.println(deta);
		byte[]deta2=str.getBytes();
		System.out.println(deta2);
		byte[]deta3=str.getBytes(StandardCharsets.UTF_8);
		System.out.println(deta3);
	}

}
