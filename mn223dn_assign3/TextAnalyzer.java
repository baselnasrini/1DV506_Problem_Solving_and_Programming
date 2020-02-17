package mn223dn_assign3;

public class TextAnalyzer {
	private int charCounter = 0;
	private int spaceCounter = 0;
	private int upperCounter = 0;
	private int digitCounter = 0;
	private String tex = "";
	private boolean charIn = false;
	private boolean subStringIn = false;

	public TextAnalyzer(String text) {
		tex = text;
	}

	public int charCount() {
		charCounter = tex.length();
		return charCounter;
	}

	public int upperCaseCount() {
		for (int i = 0; i < tex.length(); i++) {
			if (Character.isUpperCase(tex.charAt(i)) == true)
				upperCounter++;
		}
		return upperCounter;
	}

	public int whitespaceCount() {
		for (int i = 0; i < tex.length(); i++) {
			if (Character.isWhitespace(tex.charAt(i)) == true)
				spaceCounter++;
		}
		return spaceCounter;
	}

	public int digitCount() {
		for (int i = 0; i < tex.length(); i++) {
			if (Character.isDigit(tex.charAt(i)) == true)
				digitCounter++;
		}
		return digitCounter;
	}

	public boolean containsChar(char a) {
		for (int i = 0; i < tex.length(); i++) {
			if (tex.charAt(i) == a) {
				charIn = true;
				break;
			}
		}
		return charIn;
	}

	public boolean containsString(String a) {
		int count = 0;

		for (int i = 0; i < tex.length(); i++) {

			if (tex.charAt(i) == a.charAt(count)) {

				if (count == a.length() - 1) {
					subStringIn = true;
					return subStringIn;
				}
				count++;
			} else {
				count = 0;
			}

		}
		subStringIn = false;
		return subStringIn;

	}
}
