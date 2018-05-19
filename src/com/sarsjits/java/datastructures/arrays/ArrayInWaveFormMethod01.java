package com.sarsjits.java.datastructures.arrays;

import java.util.Arrays;

/**
 * In this method, sort the array and then swap adjacent elements
 * 
 * @author Jitendra Sarswat
 *
 */
public class ArrayInWaveFormMethod01 {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 2, 4, 6 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i += 2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		for(int i: arr)
			System.out.print(i + " ");
	}

}
