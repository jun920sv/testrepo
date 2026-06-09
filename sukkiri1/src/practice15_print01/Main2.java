package practice15_print01;

public class Main2 {
	public static String concat(String folder, String file) {
		StringBuilder sb = new StringBuilder();
		sb.append(folder);

		if (!folder.endsWith("\\")) {
			folder += "\\";
		}

		return folder + file;
	}

	public static void main(String[] args) {

	}

}
