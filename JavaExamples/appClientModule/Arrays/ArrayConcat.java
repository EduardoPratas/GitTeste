package Arrays;

public class ArrayConcat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = { 1, 2, 3, 4, 5 };
		int B[] = { 6, 7, 8, 9, 10 };

		int C[] = numbers(A, B);

		for (int i = 0; i < C.length; i++) {// length is the property of array
			System.out.println("C[" + i + "] = " + C[i]);
		}

	}

	public static int[] numbers(int[] A, int[] B) {
		int[] C = new int[A.length + B.length];

		///////////////////////////////////////////////////////////////////////
		//// For Cicle
		/*
		for (int i = 0; i < A.length; i++) {// length is the property of array
			C[i] = A[i];
		}

		int k = A.length;
		for (int i = 0; i < B.length; i++) {// length is the property of array
			C[k++] = B[i];
		}
		*/
		//// For Cicle
		///////////////////////////////////////////////////////////////////////
		int d = A.length + B.length;
		int i = 0, j=0;
		int k = 0;
		while (k < d) {
				C[k++] = A[i++];
				C[k++] = B[j++];
				
		}

		return C;

	}

}
