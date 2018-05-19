package com.sarsjits.java.util;

/**
 * This class is created to have some utility function handy while focusing on
 * implementation of data structures and algorithms.
 * 
 * @author Jitendra Sarswat
 *
 */
public class ArrayUtil {
	/**
	 * Swaps two integer elements of the array
	 * @param arr
	 * @param i
	 * @param j
	 */
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * Prints integer array elements
	 * @param arr
	 */
	public static void printArray(int arr[]) {
		for(int i: arr)
			System.out.print(i + " ");
	}
}
