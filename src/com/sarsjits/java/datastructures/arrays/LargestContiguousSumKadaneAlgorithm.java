package com.sarsjits.java.datastructures.arrays;

/**
 * Watch this for better understanding: https://bit.ly/2Iv7udz
 * 
 * @author Jitendra Sarswat
 *
 */
public class LargestContiguousSumKadaneAlgorithm {

	public static void main(String[] args) {
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		solve(arr);
	}

	private static void solve(int[] arr) {
		int maxCurrent = arr[0], maxGlobal = arr[0];
		for(int i = 0; i < arr.length; i++) {
			maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);
			maxGlobal = Math.max(maxCurrent, maxGlobal);
		}
		System.out.println("Largest Contiguous Sum is: " + maxGlobal);
	}

}
