package com.sarsjits.java.datastructures.arrays;

import com.sarsjits.java.util.ArrayUtil;

/**
 * Replace the current array element with the next greatest element on the right
 * of the element. This method uses O(1) space and O(n) time complexity.
 * 
 * @author Jitendra Sarswat
 *
 */
public class ReplaceNextGreatRight {

	public static void main(String[] args) {
		int arr[] = { 16, 17, 4, 3, 5, 2 };
		rearrange(arr);
		ArrayUtil.printArray(arr);
	}

	/**
	 * Traverse from right to left and keep maximum element seen. Replace the
	 * current element with the max and update max if condition is met.
	 * 
	 * @param arr
	 */
	private static void rearrange(int[] arr) {
		int maxSoFar = arr[arr.length - 1];
		arr[arr.length - 1] = -1;
		for(int i = arr.length - 2; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = maxSoFar;
			if(maxSoFar < temp)
				maxSoFar = temp;
		}
	}

}
