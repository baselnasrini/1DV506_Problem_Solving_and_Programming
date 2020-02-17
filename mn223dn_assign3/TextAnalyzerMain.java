package mn223dn_assign3;

public class TextAnalyzerMain {
	public static void main(String[] args) {
		TextAnalyzer a = new TextAnalyzer("My name is Anakin Skywalker. My age is 42.");

		System.out.println("Character Count: " + a.charCount());

		System.out.println("Upper Case Count: " + a.upperCaseCount());

		System.out.println("Whitespace Count: " + a.whitespaceCount());

		System.out.println("Digit Count: " + a.digitCount());

		if (a.containsChar('m'))
			System.out.println("The text contains char \'x\'");

		if (a.containsString("My age"))
			System.out.println("True");

	}
}
