package Amazon;

public class ReportRanks {

	public static void main(String[] args) {
		int ranks[] = { 3, 4, 3, 0, 2, 2, 3, 0, 0 };
		// int ranks[] = { 4, 4, 3, 3, 1, 0 };

		System.out.println(solution(ranks));

	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		int rank_count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if ((A[i] == (A[j] - 1) && (i != j))) {
					rank_count++;
					// System.out.println(" A["+i+"]="+A[i]+" A["+j+"]="+A[j]);
					break;

				}
			}
		}

		return rank_count;
	}
}