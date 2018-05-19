package com.sarsjits.java.datastructures.arrays;

import java.util.Arrays;
import java.util.Comparator;

import com.sarsjits.java.util.ArrayUtil;

/**
 * Sort the array according to the frequency of the numbers appearing. If the
 * frequency of two or more numbers are same then the number appearing first in
 * the original array should come first in the sorted array.
 * 
 * @author Jitendra Sarswat
 *
 */
public class SortByFrequency {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 8, 2, 8, 8, 5 };
		sort(arr);
		ArrayUtil.printArray(arr);
	}

	private static void sort(int[] arr) {
		NumberInfo[] num = new NumberInfo[arr.length];
		for (int i = 0; i < arr.length; i++) {
			num[i] = new NumberInfo(arr[i], 1, i);
		}

		// It is a stable sort so we can be assured that the index appearing first will
		// remain the first. In this comparator is simple.
		Arrays.sort(num, new Comparator<NumberInfo>() {

			@Override
			public int compare(NumberInfo o1, NumberInfo o2) {
				return o1.number - o2.number;
			}

		});

		// Now we calculate the frequency in the sorted array by comparing the current
		// element with the previous element.
		for (int i = 1; i < arr.length; i++) {
			if (num[i].number == num[i - 1].number) {
				num[i].frequency += num[i - 1].frequency;
				num[i - 1].frequency = -1;
				num[i].firstAppearingIndex = num[i - 1].firstAppearingIndex;
			}
		}

		// In this sort we sort the array by first comparing the frequency, if the
		// frequency is same then according to the index
		Arrays.sort(num, new Comparator<NumberInfo>() {

			@Override
			public int compare(NumberInfo o1, NumberInfo o2) {
				if (o1.frequency != o2.frequency)
					return o1.frequency - o2.frequency;
				else
					return o1.firstAppearingIndex - o2.firstAppearingIndex;
			}
		});

		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num[i].frequency != -1) {
				for (int j = 0; j < num[i].frequency; j++) {
					arr[k++] = num[i].number;
				}
			}
		}
	}

}

class NumberInfo {
	int number;
	int frequency;
	int firstAppearingIndex;

	public NumberInfo() {
	}

	public NumberInfo(int number, int freq, int index) {
		this.number = number;
		this.frequency = freq;
		this.firstAppearingIndex = index;
	}
}
