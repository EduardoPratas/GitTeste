package Examples;


import java.util.*;

class LongestRepeatingSubsequence {
	//////////////////////////////////////////////////////////////////////
	// Function to find the longest repeating subsequence
	static int findLongestRepeatingSubSeq(String str) {
		int n = str.length();

		// Create and initialize DP table
		int[][] dp = new int[n + 1][n + 1];

		// Fill dp table (similar to LCS loops)
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				// If characters match and indexes are not same
				if (str.charAt(i - 1) == str.charAt(j - 1) && i != j)
					dp[i][j] = 1 + dp[i - 1][j - 1];

				// If characters do not match
				else
					dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
			}
		}
		return dp[n][n];
	}
	/////////////////////////////////////////////////////////////////////

	
	// subsequence using recursion
	/////////////////////////////////////////////////////////////////////
	static int dp[][] = new int[1000][1000];

	// This function mainly returns LCS(str, str)
	// with a condition that same characters at
	// same index are not considered.
	static int findLongestRepeatingSubSeq(char X[], int m, int n) {

		if (dp[m][n] != -1) {
			return dp[m][n];
		}

		// return if we have reached the end of either string
		if (m == 0 || n == 0) {
			return dp[m][n] = 0;
		}

		// if characters at index m and n matches
		// and index is different
		if (X[m - 1] == X[n - 1] && m != n) {
			return dp[m][n] = findLongestRepeatingSubSeq(X, m - 1, n - 1) + 1;
		}

		// else if characters at index m and n don't match
		return dp[m][n] = Math.max(findLongestRepeatingSubSeq(X, m, n - 1), findLongestRepeatingSubSeq(X, m - 1, n));
	}

	// driver program to check above function
	public static void main(String[] args) {
		
		/////////////////////////////////////////////////////////////////////////////////////
		String str = "aabb";
		System.out.println("The length of the largest subsequence that" + " repeats itself is : "
				+ findLongestRepeatingSubSeq(str));
		/////////////////////////////////////////////////////////////////////////////////////


		
		// subsequence using recursion
		/////////////////////////////////////////////////////////////////////////////////////
		String mystr = "aabb";
		int m = mystr.length();
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		System.out.println("The length of the largest subsequence that" + " repeats itself is : "
				+ findLongestRepeatingSubSeq(mystr.toCharArray(), m, m));
		/////////////////////////////////////////////////////////////////////////////////////

	}
}