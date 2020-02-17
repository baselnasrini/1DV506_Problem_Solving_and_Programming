package mn223dn_assign4;

import java.io.*;
import java.util.*;

public class CountChar {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		try {
			String text = readFile("C:\\temp\\history.txt");
			sb.append(text);
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Number of upper case letters: " + upperCaseCount(sb.toString()));
		System.out.println("Number of lower case letters: " + lowerCaseCount(sb.toString()));
		System.out.println("Number of \"whitespaces\" : " + whitespaceCount(sb.toString()));
		System.out.println("Number of others: " + otherLettersTypeCount(sb.toString()));

	}

	private static String readFile(String path) throws IOException {
		StringBuilder sb = new StringBuilder();
		File file = new File(path);
		Scanner scan = new Scanner(file);
		while (scan.hasNext()) {
			sb.append(scan.nextLine() + "\n");
		}
		scan.close();
		return sb.toString();
	}

	public static int upperCaseCount(String text) {
		int upperCount = 0;

		for (int i = 0; i < text.length(); i++) {

			if (Character.isUpperCase(text.charAt(i)))
				upperCount++;
		}
		return upperCount;
	}

	public static int lowerCaseCount(String text) {
		int lowerCount = 0;

		for (int i = 0; i < text.length(); i++) {
			if (Character.isLowerCase(text.charAt(i)))
				lowerCount++;
		}
		return lowerCount;
	}

	public static int whitespaceCount(String text) {
		int whitespaceCount = 0;

		for (int i = 0; i < text.length(); i++) {
			if (Character.isWhitespace(text.charAt(i)))
				whitespaceCount++;
		}
		return whitespaceCount;
	}

	public static int otherLettersTypeCount(String text) {
		int otherCount = 0;

		for (int i = 0; i < text.length(); i++) {
			if (!Character.isWhitespace(text.charAt(i)) && !Character.isLowerCase(text.charAt(i))
					&& !Character.isUpperCase(text.charAt(i)))
				otherCount++;
		}
		return otherCount;
	}
}