package com.sarsjits.java.algorithms;

/**
 * Merge sort algorithm with extra space allowed. This is a stable sort which
 * means the order of appearance will be maintained. Time complexity of merge
 * sort is O(nlogn) in all the 3 cases that is in worst, best and average cases.
 * 
 * @author Jitendra Sarswat
 *
 */
public class MergeSortWithExtraSpace {

	public static void main(String[] args) {
		int arr[] = { 4, 6, 2, 1, 3 };
		sort(arr, 0, arr.length - 1);
		for (int i : arr)
			System.out.print(i + " ");
	}

	private static void sort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (high + low) >>> 1;
			sort(arr, low, mid);
			sort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		// Calculate the size of the left and right array
		int leftArraySize = mid - low + 1;
		int rightArraySize = high - mid;

		// Declare the array
		int leftArray[] = new int[leftArraySize];
		int rightArray[] = new int[rightArraySize];

		// Filling the temporary array
		for (int i = 0; i < leftArraySize; i++)
			leftArray[i] = arr[low + i];
		for (int i = 0; i < rightArraySize; i++)
			rightArray[i] = arr[mid + 1 + i];

		// Start the merging process
		int i = 0, j = 0;
		int k = low;
		while (i < leftArraySize && j < rightArraySize) {
			// This exact comparison would make this sorting a stable sort
			if (leftArray[i] <= rightArray[j]) {
				arr[k++] = leftArray[i++];
			} else {
				arr[k++] = rightArray[j++];
			}
		}

		while (i < leftArraySize) {
			arr[k++] = leftArray[i++];
		}
		while (j < rightArraySize) {
			arr[k++] = rightArray[j++];
		}
	}
}
