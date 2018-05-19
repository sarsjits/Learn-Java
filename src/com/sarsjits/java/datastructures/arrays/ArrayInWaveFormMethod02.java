package com.sarsjits.java.datastructures.arrays;

/**
 * In this method we will achieve the wave form in 0(n) time and O(1) space
 * complexity. There are two steps involved: 1) Compare the even indexed
 * elements with the previous elements, if the previous element is greater,
 * swap. 2) Compare the even indexed elements with the next elements, if the
 * next element is greater, swap.
 * 
 * @author Jitendra Sarswat
 *
 */
public class ArrayInWaveFormMethod02 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		sortInWaveForm(arr);
		for (int i : arr)
			System.out.print(i + " ");
	}

	private static void sortInWaveForm(int[] arr) {
		for (int i = 0; i < arr.length; i += 2) {
			if (i > 0 && arr[i - 1] > arr[i])
				swap(arr, i - 1, i);
			if (i < arr.length - 1 && arr[i] < arr[i + 1])
				swap(arr, i, i + 1);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
