package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ArrayExamples {
	public static void main(String[] args) {

		int a[] = new int[5];// declaration and instantiation
		a[0] = 10;// initialization

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		int b[] = { 33, 3, 4, 5 };// declaration, instantiation and initialization
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		// printing array using for-each loop
		for (int i : a) {
			System.out.println(i);
		}

		int c[] = { 33, 3, 4, 5 };// declaring and initializing an array
		min(c);// passing array to method

		printArray(new int[] { 10, 22, 44, 66 });// passing anonymous array to method

		// declaring and initializing 2D array
		int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
		}

		// declaring a 2D array with odd columns
		int arr2[][] = new int[3][];

		// creating two matrices
		int aa[][] = { { 1, 3, 4 }, { 3, 4, 5 } };
		int bb[][] = { { 1, 3, 4 }, { 3, 4, 5 } };

		// creating another matrix to store the sum of two matrices
		int cc[][] = new int[2][3];
		// adding and printing addition of 2 matrices
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				cc[i][j] = aa[i][j] + bb[i][j];
				System.out.print(cc[i][j] + " ");

				// declaring a source array
				char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
				// declaring a destination array
				char[] copyTo = new char[7];
				// copying array using System.arraycopy() method
				System.arraycopy(copyFrom, 2, copyTo, 0, 7);
				// printing the destination array
				System.out.println(String.valueOf(copyTo));
			}
		}

		/////////////////////////////////////// Converting CHAR TO STRING
		char[] ch = { 'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g' };
		String str = new String(ch);
		System.out.println(str);

		/////////////////////////////////////// Converting STRING TO CHAR
		String str3 = "GeeksForGeeks";
		char[] ch3 = str3.toCharArray();

		for (char c3 : ch3) { // Printing array
			System.out.println(c3);
		}
		//////////////////////////////////////////////////////////////////////////////

		//////////////////////////////////// Concat
		String s1 = "aaaa";
		String s2 = "bbbbb";
		String s3 = "ccccc";
		String s4 = s1.concat(s2).concat(s3);
		System.out.println(s4);
		//////////////////////////////////////////////////////////////////////////////

	}/////////////////////////// End main

	// creating a method which receives an array as a parameter and returns min
	static void min(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
