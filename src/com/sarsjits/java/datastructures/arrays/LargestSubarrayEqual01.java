package com.sarsjits.java.datastructures.arrays;

import java.util.HashMap;

/**
 * To find the largest sub-array that contains the equal number of 0s and 1s.
 * There is a naive way of implementing it via nested loops and that would give
 * time complexity of O(n^2) and no auxiliary space. So the efficient solution
 * in terms of time complexity is to use array of size of given elements.
 * 
 * @author Jitendra Sarswat
 *
 */
public class LargestSubarrayEqual01 {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 1, 1, 1, 0, 0 };
		int maxLength = findSubarrayMaxLength(arr);
		if (maxLength != -1)
			System.out.println("Max length: " + maxLength);
		else
			System.out.println("No subarray found.");
	}

	/**
	 * Returns the max length sub-array with equal 0s and 1s Idea is to have replace
	 * all 0s with -1 and calculate the cumulative sum from left to right. Now the
	 * max length can be calculated in two ways. If the starting index is 0th then
	 * we need to look for sum = 0 and calculate the length. If the starting index
	 * is anything other than 0 then we need to look for two index start and end
	 * such that sum[start] is equal to sum[end]
	 * 
	 * @param arr
	 * @return
	 */
	private static int findSubarrayMaxLength(int[] arr) {
		// To keep the count of equal sum if the max sub-arrays starting point is not
		// the
		// 0th index
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int maxLength = -1;
		int startIdx = 0;
		int endIdx = -1;
		int cumSum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				arr[i] = -1;
		}

		for (int i = 0; i < arr.length; i++) {
			cumSum += arr[i];

			if (cumSum == 0) {
				endIdx = i;
				maxLength = i - 0 + 1;
			}

			if (hmap.containsKey(cumSum)) {
				// Here the length will not be i - hmap + 1 because the hmap entity is not
				// included
				int tempMax = i - hmap.get(cumSum);
				if (maxLength < tempMax) {
					maxLength = tempMax;
					endIdx = i;
				}
			} else {
				hmap.put(cumSum, i);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				arr[i] = 0;
			}
		}

		if (maxLength != -1) {
			startIdx = endIdx - maxLength + 1;
			System.out.println("Subarray starts from " + startIdx + " index and ends at " + endIdx + " index.");
		}
		return maxLength;
	}

}
