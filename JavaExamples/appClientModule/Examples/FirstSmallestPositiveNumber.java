package Examples;

public class FirstSmallestPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testGetFirstSmallestPositiveNumber();
	}

	public static int getFirstSmallestPositiveNumber(int[] A) {

		// set positions of non-positive or out of range elements as free (use 0 as
		// marker)
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= 0 || A[i] > A.length) {
				A[i] = 0;
			}
		}

		// iterate through the whole array again mapping elements [1,n] to positions [0,
		// n-1]
		for (int i = 0; i < A.length; i++) {
			int prev = A[i];
			// while elements are not on their correct positions keep putting them there
			while (prev > 0 && A[prev - 1] != prev) {
				int next = A[prev - 1];
				A[prev - 1] = prev;
				prev = next;
			}
		}

		// now, the first unmapped position is the smallest element
		for (int i = 0; i < A.length; i++) {
			if (A[i] != i + 1) {
				return i + 1;
			}
		}
		return A.length + 1;
	}
	public static void testGetFirstSmallestPositiveNumber() {
		int[][] arrays = new int[][] { { 1, -1, -5, -3, 3, 4, 2, 8 }, { 5, 4, 3, 2, 1 }, { 0, 3, -2, -1, 1 } };

		for (int i = 0; i < arrays.length; i++) {
			System.out.println(getFirstSmallestPositiveNumber(arrays[i]));
		}
	}

}
