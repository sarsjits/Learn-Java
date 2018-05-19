package com.sarsjits.java.algorithms;

import com.sarsjits.java.util.ArrayUtil;

/**
 * Insertion sort takes maximum time to sort if elements are sorted in reverse
 * order. And it takes minimum time (Order of n) when elements are already
 * sorted. In place sorting. Stable. Online (does not need to know the complete
 * input at the start). Insertion sort is used when number of elements is small.
 * It can also be useful when input array is almost sorted, only few elements
 * are misplaced in complete big array. Worst case comes when the array is
 * reverse sorted.
 * 
 * Why to choose quadratic time complexity sorting algorithm when we have better
 * sorting available. For small arrays (less than 20-30 elements), both
 * insertion sort and selection sort are typically faster than the O(n*logn)
 * alternatives.
 * 
 * @author Jitendra Sarswat
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 2, 6, 3, 12, 56, 8 };
		sort(arr);
		ArrayUtil.printArray(arr);
	}

	private static void sort(int[] arr) {
		// Assume the first element is always sorted. So start from the second element
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

}
