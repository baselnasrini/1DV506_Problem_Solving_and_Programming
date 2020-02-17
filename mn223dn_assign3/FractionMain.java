package mn223dn_assign3;

public class FractionMain {

	public static void main(String[] args) {

		Fraction a = new Fraction(1, 1);
		Fraction b = new Fraction(5, 8);

		System.out.println("Numenator: " + a.getNumerator());

		System.out.println("Denominator: " + a.getDenominator());

		System.out.println("Is Negative: " + a.isNegative());

		System.out.println("To String: " + a.toString());

		System.out.println("Add: " + a.add(b));

		System.out.println("Subtract: " + a.subtract(b));

		System.out.println("Multiply: " + a.multiply(b));

		System.out.println("Division: " + a.divide(b));

		System.out.println("Is Equal: " + a.isEqual(b));
	}
}
