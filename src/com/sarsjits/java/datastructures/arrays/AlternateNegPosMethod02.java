package com.sarsjits.java.datastructures.arrays;

/**
 * This method will not maintain the order of their appearance. 
 * Time complexity:O(n) 
 * Space Complexity: O(1)
 * 
 * @author Jitendra Sarswat
 *
 */
public class AlternateNegPosMethod02 {

	public static void main(String[] args) {
		int arr[] = {2,3,-4,-1,6,-9};
		rearrange(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

	/**
	 * First shifts all the positive to right side and then
	 * swaps alternate positive from left with the negative
	 * @param arr
	 */
	private static void rearrange(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while(i < j) {
			while(arr[i++] > 0);
			i--;
			while(arr[j--] < 0);
			j--;
			if(i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		if(i == 0 || i == arr.length)
			return;
		for(int k = 0; k < arr.length && i < arr.length; k += 2, i++) {
			int temp = arr[k];
			arr[k] = arr[i];
			arr[i] = temp;
		}
	}

}
