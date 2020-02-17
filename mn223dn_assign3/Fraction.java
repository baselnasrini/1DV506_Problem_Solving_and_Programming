package mn223dn_assign3;

public class Fraction {
	private int nume;
	private int deno;

	public Fraction(int n, int d) {
		if (d == 0)
			System.err.println("The Denominator shouldn't be zero.");

		nume = n;
		deno = d;
	}

	public void setNumerator(int n) {
		nume = n;
	}

	public void setDenominator(int d) {
		if (d == 0)
			System.err.println("The Denominator shouldn't be zero.");

		deno = d;
	}

	public int getNumerator() {
		return nume;
	}

	public int getDenominator() {
		return deno;
	}

	public boolean isNegative() {
		if ((nume < 0 && deno > 0) || (deno < 0 && nume > 0)) {
			return true;
		} else
			return false;
	}

	public String toString() {
		return nume + "/" + deno;
	}

	public Fraction add(Fraction a) {
		int n;
		int d;

		if (deno == a.deno) {
			n = nume + a.nume;
			d = deno;
		} else {
			n = (nume * a.deno) + (a.nume * deno);
			d = deno * a.deno;
		}

		Fraction fra = new Fraction(n, d);
		return fra;

	}

	public Fraction subtract(Fraction a) {
		int n;
		int d;

		if (deno == a.deno) {
			n = nume - a.nume;
			d = deno;
		} else {
			n = (nume * a.deno) - (a.nume * deno);
			d = deno * a.deno;
		}

		Fraction fra = new Fraction(n, d);
		return fra;
	}

	public Fraction multiply(Fraction a) {

		int n = nume * a.nume;
		int d = deno * a.deno;

		Fraction fra = new Fraction(n, d);
		return fra;
	}

	public Fraction divide(Fraction a) {

		int n = nume * a.deno;
		int d = deno * a.nume;

		Fraction fra = new Fraction(n, d);

		return fra;
	}

	public boolean isEqual(Fraction a) {

		if ((double) nume / deno == (double) a.nume / a.deno)
			return true;

		return false;

	}

}