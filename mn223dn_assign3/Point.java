package mn223dn_assign3;

public class Point {
	private int xc = 0;
	private int yc = 0;
	private double distance = 0;
	private boolean isEqual = false;

	public Point() {

	}

	public Point(int x, int y) {
		xc = x;
		yc = y;
	}

	public String toString() {
		return "(" + xc + "," + yc + ")";
	}

	public boolean isEqualTo(Point other) {
		if (xc == other.xc && yc == other.yc) {
			isEqual = true;
		}
		return isEqual;
	}

	public void move(int x, int y) {
		xc = xc + x;
		yc = yc + y;
	}

	public void moveToXY(int x, int y) {
		xc = x;
		yc = y;
	}

	public double distanceTo(Point a) {

		distance = Math.sqrt(Math.pow((a.xc - xc), 2) + Math.pow((a.yc - yc), 2));

		return distance;
	}

}