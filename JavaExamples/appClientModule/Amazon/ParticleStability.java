package Amazon;

import java.math.*;

public class ParticleStability {

	public static void main(String[] args) {
		//int ranks[] = { 3, 0, 2, 2, 3, 0, 0, 0, 1 };
		int ranks[] = { 2, 4, 6, 1, 0, 0 };

		System.out.println("\n"+solution(ranks));

	}

	public static boolean solution(int[] A) {
		// write your code in Java SE 8

		int dif = 0;
		int stable_count = 1; // minimum of 3

		dif = Math.abs(A[0] - A[1]);
		for (int i = 0; i < A.length - 1; i++) {
			System.out.print("\n i=" + i + " ");
			if ((A[i] == (A[i + 1]))) {
				stable_count++;
			} else

			if (Math.abs(A[i] - (A[i + 1])) == dif) {
				
				dif = Math.abs(A[i] - (A[i + 1]));
				stable_count++;
				
				System.out.print(" stable_count=" + stable_count);
				System.out.print(" dif=" + dif);
			} else {
				
				stable_count = 1;
			}
			
			
			if (stable_count == 3)
				return true;
		}

		/*
		 * for (int i = 0; i < A.length; i++) { for (int j = 0; j < A.length; j++) { if
		 * ((A[i] == (A[j]) )) { stable_count++; System.out.println(" stable_count=" +
		 * stable_count); } else stable_count = 0;
		 * 
		 * if(stable_count==3) return true;
		 * 
		 * dif = Math.abs(A[i] - (A[j]));
		 * 
		 * 
		 * 
		 * 
		 * // System.out.println(" A["+i+"]="+A[i]+" A["+j+"]="+A[j]); // break;
		 * 
		 * } }
		 */

		return false;
	}
}