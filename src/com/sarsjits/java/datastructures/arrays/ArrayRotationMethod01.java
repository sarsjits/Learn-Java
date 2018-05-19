package com.sarsjits.java.datastructures.arrays;

/**
 * This is a naive solution Rotate the array one by one, n times Input =
 * [1,2,3,4,5,6,7] N = 3 Output = [4,5,6,7,1,2,3]
 * 
 * @author Jitendra Sarswat
 *
 */
public class ArrayRotationMethod01 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		leftRotate(arr, 3);
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}

	/**
	 * Rotates the array by rotateBy
	 * 
	 * @param arr
	 * @param rotateBy
	 */
	private static void leftRotate(int[] arr, int rotateBy) {
		for (int i = 0; i < rotateBy; i++) {
			leftRotateOneByOne(arr);
		}
	}

	/**
	 * Rotates the array one by one
	 * 
	 * @param arr
	 */
	private static void leftRotateOneByOne(int[] arr) {
		if (null != arr && arr.length > 0) {
			int temp = arr[0];
			for (int i = 1; i < arr.length; i++) {
				arr[i - 1] = arr[i];
			}
			arr[arr.length - 1] = temp;
		}
	}

}
