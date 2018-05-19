package com.sarsjits.java.datastructures.arrays;

/**
 * This method uses the method in which we reverse the array thrice. The
 * starting and the end point will be different all the three times.
 * 
 * @author Jitendra Sarswat
 *
 */
public class ArrayRotationMethod03 {

	public static void main(String[] args) {
		ArrayRotationMethod03 rotate = new ArrayRotationMethod03();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		rotate.leftRotate(arr, 3);
		for (int i : arr)
			System.out.print(i + " ");
	}

	private void leftRotate(int[] arr, int rotateBy) {
		reverseArray(arr, 0, rotateBy);
		reverseArray(arr, rotateBy, arr.length);
		reverseArray(arr, 0, arr.length);
	}

	private void reverseArray(int[] arr, int start, int end) {
		for (int i = start, j = end - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

}
