package com.sarsjits.java.algorithms;

/**
 * Quick sort implementation. This is a recursive implementation in which pivot
 * is selected as the last element. It has good locality of reference and is tail
 * recursive.
 * 
 * @author Jitendra Sarswat
 *
 */
public class QuickSortPivotLastElement {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 7, 1, -1, 0 };
		sort(arr, 0, arr.length - 1);
		for(int i : arr)
			System.out.print(i + " ");
	}

	private static void sort(int[] arr, int low, int high) {
		if (low < high) {
			// pivot is the index of the pivot element
			int pivot = partition(arr, low, high);
			// pivot is excluded as it will always be at the right position in the sorted array
			sort(arr, low, pivot - 1);
			sort(arr, pivot + 1, high);
		}
	}

	/**
	 * In this partition algorithm we are taking last element as the pivot and then
	 * we will put all the smaller elements on the left side of the pivot and the
	 * bigger elements on the right side of the pivot. Pivot is always at the right
	 * position in the sorted array.
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 * @return index of the pivot
	 */
	private static int partition(int[] arr, int low, int high) {
		int pivotElement = arr[high];
		int leftMovingIndex = low;
		// high will not be included in swapping as it is equal to arr.length - 1
		for(int i = low; i < high; i++) {
			if(arr[i] <= pivotElement) {
				swap(arr,i,leftMovingIndex);
				leftMovingIndex++;
			}
		}
		swap(arr,leftMovingIndex,high);
		return leftMovingIndex;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
