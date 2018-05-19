package com.sarsjits.java.datastructures.arrays;

/**
 * This problem can be solved using linear search as well O(n) Here we will try
 * to solve this problem in O(logn) using binary search Output will be the
 * anti-clockwise rotation count and similarly clockwise can be found with some
 * minor changes.
 * 
 * @author Jitendra Sarswat
 *
 */
public class RotationCountInRotatedSortedArray {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7, 1, 2, 3 };
		System.out.println("Anti-clockwise rotation count is: " + rotationCount(arr));
	}

	private static int rotationCount(int[] arr) {
		// Find the pivot using binary search
		int pivotIdx = findPivot(arr, 0, arr.length - 1);
		return pivotIdx;
	}

	/**
	 * Method returns the index of the smallest element That means if the method
	 * returns 0 then the array is not rotated.
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	private static int findPivot(int[] arr, int low, int high) {
		// Handles the condition if the array is not rotated
		if(high < low)
			return 0;
		// If the array has only one element
		if(high == low)
			return low;
		int mid = low + (high - low) / 2;
		if (mid < high && arr[mid + 1] < arr[mid])
			return mid + 1;
		if(mid > low && arr[mid - 1] > arr[mid])
			return mid;
		if(arr[mid] < arr[high])
			return findPivot(arr, low, mid - 1);
		return findPivot(arr, mid + 1, high);
	}

}
