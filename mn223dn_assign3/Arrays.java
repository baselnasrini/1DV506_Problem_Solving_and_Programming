package mn223dn_assign3;

public class Arrays {

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public static String toString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length - 1; i++) {
			sb.append(arr[i] + ",");
		}
		sb.append(arr[arr.length - 1]);
		String str = "n = [" + sb.toString() + "]";
		return str;
	}

	public static int[] addN(int[] arr, int n) {
		int[] newArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i] + n;
		}

		return newArr;
	}

	public static int[] reverse(int[] arr) {
		int[] arrRev = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {

			for (int n = (arr.length - 1) - i; n <= (arr.length - 1) - i; n++) {
				arrRev[n] = arr[i];
			}
		}
		return arrRev;
	}

	public static boolean hasN(int[] arr, int n) {
		for (int i : arr)
			if (i == n)
				return true;
		return false;
	}

	public static void replaceAll(int[] arr, int old, int nw) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == old) {
				arr[i] = nw;
			}
		}
	}

	public static int[] sort(int[] arr) {

		int[] newArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}

		for (int i = 0; i < newArr.length; i++) {
			for (int j = i + 1; j < newArr.length; j++) {
				int tmp = 0;
				if (newArr[i] > newArr[j]) {
					tmp = newArr[i];
					newArr[i] = newArr[j];
					newArr[j] = tmp;
				}
			}
		}

		return newArr;

	}

	public static boolean hasSubsequence(int[] arr, int[] sub) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == sub[count]) {

				if (count == sub.length - 1) {
					return true;
				}
				count++;
			} else {
				count = 0;
			}

		}
		return false;

	}

	public static void main(String[] args) {

		int[] n = { 3, 6, 7, 2, 4 };

		System.out.println("Sum: " + sum(n));

		System.out.println("To String: " + toString(n));

		System.out.print("Add N: ");
		for (int a : addN(n, 1))
			System.out.print(a);

		System.out.println();

		System.out.print("Reverse: ");
		for (int a : reverse(n))
			System.out.print(a);
		System.out.println();

		System.out.println("Has n: " + hasN(n, 7));

		System.out.print("Replace an integer: ");
		replaceAll(n, 6, 2);
		for (int a : n)
			System.out.print(a);

		System.out.println();

		System.out.print("Sort the array: ");
		for (int a : sort(n))
			System.out.print(a);

		System.out.println();

		int[] a = { 6, 7, 8, 9, 10 };
		int[] tru = { 6, 7, 8 };
		int[] fal = { 6, 8, 9 };
		System.out.println(hasSubsequence(a, tru));
		System.out.println(hasSubsequence(a, fal));

	}

}
