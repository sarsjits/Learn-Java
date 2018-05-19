package com.sarsjits.java.datastructures.arrays;

/**
 * Sort 0s, 1s, and 2s. This can be done with one simple approach in which we
 * count the number of occurrences of all 3 and simply iterate and put the value
 * in the array. Second solution is similar to solving Dutch National Flag
 * problem. We partition the array in 4 parts. One with 0s, another with 1s,
 * next the unknown and last with 2s. Our aim is to minimize the unknown and
 * finally sort all.
 * 
 * @author Jitendra Sarswat
 *
 */
public class Sort012DutchNationalAlgo {

	public static void main(String[] args) {
		int arr[] = { 2, 1, 0, 0, 0, 1, 1, 0, 2, 2, 2, 1 };
		sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void sort(int[] arr) {
		// Start with keeping index of low and mid as equal and high as length - 1
		int low = 0, mid = 0, high = arr.length - 1;
		while (mid <= high) {
			switch (arr[mid]) {
			case 0:
				swap(arr, low, mid);
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(arr, mid, high);
				high--;
				break;
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
