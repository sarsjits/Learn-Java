package com.sarsjits.java.datastructures.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Idea is to take or convert the integer array to strings and then write a
 * custom comparator such that if the two numbers are X, Y then compare XY and
 * YX whichever is greater, put the number in that sequence
 * 
 * @author Jitendra Sarswat
 *
 */
public class SortArrayToFormBiggestNumber {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("54");
		arr.add("546");
		arr.add("548");
		arr.add("60");
		sort(arr);
		for(String s : arr) {
			System.out.print(s + " ");
		}
	}

	private static void sort(ArrayList<String> arr) {
		Collections.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String X, String Y) {
				String XY = X + Y;
				String YX = Y + X;
				return XY.compareTo(YX) > 0 ? -1: 1;
			}
		});
	}

}
