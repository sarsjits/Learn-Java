package com.sarsjits.java.datastructures.arrays;

/**
 * Given an unsorted array of nonnegative integers, find a continuous sub-array
 * which adds to a given number. We can solve this by having two pointers. The
 * end pointer moves if the current sum is less than the required sum, and the
 * start pointer moves if the current sum is greater than the required sum.
 * 
 * @author Jitendra Sarswat
 *
 */
public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 20, 3, 10, 5 };
		int sum = 33;
		solve(arr, sum);
	}

	private static void solve(int[] arr, int sum) {
		int start = 0, i, curSum = arr[0];
		for(i = 1; i <= arr.length; i++) {
			while(curSum > sum && start < i - 1) {
				curSum -= arr[start++];
			}
			if(curSum == sum) {
				System.out.println("Sub-array with given sum is between: " + ( start + 1 ) + " and " + i);
				return;
			}
			if(i < arr.length)
				curSum += arr[i];
		}
		System.out.println("Sub-array not found");
	}

}
