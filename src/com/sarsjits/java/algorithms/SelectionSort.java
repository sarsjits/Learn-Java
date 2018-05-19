package com.sarsjits.java.algorithms;

import com.sarsjits.java.util.ArrayUtil;

/**
 * Why to choose quadratic time complexity sorting algorithm when we have better
 * sorting available. For small arrays (less than 20-30 elements), both
 * insertion sort and selection sort are typically faster than the O(n*logn)
 * alternatives.
 * 
 * It is not stable sort. Time complexity is O(n^2). Mantra for selection sort
 * is find the minimum and swap it with the right most sorted element to the
 * left of the current element.
 * 
 * @author Jitendra Sarswat
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 64, 25, 12, 22, 11 };
		sort(arr);
		ArrayUtil.printArray(arr);
	}

	/**
	 * We assume that the rightmost element will be sorted once we sort n-1
	 * elements.
	 * 
	 * @param arr
	 */
	private static void sort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int minIdx = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
			if(i != minIdx)
				ArrayUtil.swap(arr, i, minIdx);
		}
	}

}
