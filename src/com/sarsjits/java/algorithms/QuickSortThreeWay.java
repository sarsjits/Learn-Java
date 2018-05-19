package com.sarsjits.java.algorithms;

import com.sarsjits.java.util.ArrayUtil;

/**
 * Quick sort using 3 way partition similar to Dutch National Flag problem. The
 * array is arranged in the following way: [elements less than pivot][equal to
 * pivot][greater than pivot]
 * 
 * @author Jitendra Sarswat
 *
 */
public class QuickSortThreeWay {

	public static void main(String[] args) {
		int arr[] = { 4, 9, 4, 4, 1, 9, 4, 4, 9, 4, 4, 1, 4 };
		sort(arr, 0, arr.length - 1);
		ArrayUtil.printArray(arr);
	}

	private static void sort(int[] arr, int low, int high) {
		if (low < high) {
			int lessThan = low, greaterThan = high;
			int i = low, pivot = arr[low];
			while (i <= greaterThan) {
				if (arr[i] < pivot) {
					ArrayUtil.swap(arr, i, lessThan);
					i++;
					lessThan++;
				} else if (arr[i] > pivot) {
					ArrayUtil.swap(arr, i, greaterThan);
					greaterThan--;
				} else {
					i++;
				}
			}
			sort(arr, low, lessThan - 1);
			sort(arr, greaterThan + 1, high);
		}
	}

}
