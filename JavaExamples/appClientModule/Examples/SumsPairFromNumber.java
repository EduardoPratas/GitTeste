/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;
import java.util.Arrays;
/**
 *
 * Find all Pairs in Array of Integers Whose sum is Equal to a Given Number - Java Solution
 */
public class SumsPairFromNumber {
	 public static void main(String[] args) {
	    	
	    	int max = 0;
	        int[] numbers = {2, 4, 3, 5, 7, 8, 9};
	        int[] numbersWithDuplicates = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
	        prettyPrint(numbers, 7);
	        prettyPrint(numbersWithDuplicates, 7);
	        
	        max = maxValue(numbers);
	        System.out.println("\nMax value : " + max);
	        prettyPrint(numbers, max);
	    }
	    
    public static void printPairs(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            int first = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int second = array[j];
                if ((first + second) == sum) {
                    System.out.printf("(%d, %d) %n", first, second);
                }
            }
        }
    }
    private static int maxValue(int[] chars) {
        int max = chars[0];
        for (int ktr = 0; ktr < chars.length; ktr++) {
            if (chars[ktr] > max) {
                max = chars[ktr];
            }
        }
        return max;
    }
    public static void prettyPrint(int[] givenArray, int givenSum) {
        System.out.println("Given array : " + Arrays.toString(givenArray));
        System.out.println("Given sum : " + givenSum);
        System.out.println("Integer numbers, whose sum is equal to value : " + givenSum);
        printPairs(givenArray, givenSum);
    }
}
