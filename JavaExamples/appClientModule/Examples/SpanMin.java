package Examples;

/**
 *
 * @author Pratas
 */

public class SpanMin {

	public static void display(int[] a) {
		int gap = 0, min = 10, min_number = 10;

		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j] & i != j & j > i) {
					gap = j - i;
					min_number = a[i];

					// System.out.println("i: " + i + " j: " + j);
					System.out.println("gap: " + gap);

					System.out.println("min_number: " + min_number);
				}
				if (gap < min & gap > 0) {
					min = gap;
					min_number = a[i];
				}

			}
		System.out.println("Min gap: " + min + " Min numba: " + min_number);
	}

	public static void main(String[] args) {

		int[] ar = { 11, 21, 3, 4, 6, 4, 1, 1 };

		display(ar);

		/*
		 * String s = "12.655f"; double d = 333.4556d;
		 * 
		 * Float f = Float.parseFloat(s); // int num = Integer.par
		 */

		// System.out.println("Result: "+(void)display(ar));
	}

}
