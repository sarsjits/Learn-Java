package com.sarsjits.java.datastructures.arrays;

import java.util.Arrays;

/**
 * This is done by finding the pivot point and then doing
 * binary search on both sides of the array as both sides 
 * will be sorted.
 * @author Jitendra Sarswat
 *
 */
public class SearchSortedRotatedArray {

	public static void main(String[] args) {
		SearchSortedRotatedArray obj = new SearchSortedRotatedArray();
		int arr[] = {4,5,6,7,1,2,3};
		obj.search(arr,0);
	}

	/**
	 * Searches the key in the sorted rotated array
	 * @param arr
	 * @param key
	 */
	private void search(int[] arr, int key) {
		int pivotIdx = findPivot(arr);
		if(pivotIdx != -1) {
			int result = Arrays.binarySearch(arr, 0, pivotIdx + 1, key);
			if(result < 0)
				result = Arrays.binarySearch(arr, pivotIdx + 1, arr.length, key);
			if(result < 0)
				System.out.println("No match found.");
			else
				System.out.println("Match found at " + result + " index (0 Based Indexing).");
		}
	}

	private int findPivot(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1])
				return i;
		}
		return -1;
	}

}
