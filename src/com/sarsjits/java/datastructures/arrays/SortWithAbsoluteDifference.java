package com.sarsjits.java.datastructures.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Sort the error by calculating the absolute difference from number X with each
 * element in the array. If the difference is same then the numbers should be in
 * the same order as they appear in the array
 * 
 * @author Jitendra Sarswat
 *
 */
public class SortWithAbsoluteDifference {

	public static void main(String[] args) {
		int x = 5;
		int arr[] = { 2,6,8,3 };
		ComplexObject[] obj = new ComplexObject[arr.length];
		for (int i = 0; i < arr.length; i++) {
			obj[i] = new ComplexObject();
			obj[i].number = arr[i];
			obj[i].difference = Math.abs(arr[i] - x);
		}
		arrange(obj, x);
		for(ComplexObject c : obj) {
			System.out.print(c.number + " ");
		}
	}

	private static void arrange(ComplexObject[] obj, int x) {
		Arrays.sort(obj, new ComplexObjectComparator());
	}

}

class ComplexObject {
	@Override
	public String toString() {
		return "ComplexObject [number=" + number + ", difference=" + difference + "]";
	}
	int number;
	int difference;
}

class ComplexObjectComparator implements Comparator<ComplexObject> {

	@Override
	public int compare(ComplexObject o1, ComplexObject o2) {
		return o1.difference - o2.difference;
	}
	
}
