package com.sarsjits.java.datastructures.arrays;

/**
 * The method here we use is the one we use in sorted array.
 * That is to have two pointers one from start and one from the end
 * and then increment and decrement them respectively according to a 
 * condition. arr[l] + arr[r] <= sum
 * @author Jitendra Sarswat
 *
 */
public class PairOfGivenSumInRotatedArray {

	public static void main(String[] args) {
		int arr[] = {4,5,6,7,1,2,3};
		if(pairExist(arr,14))
			System.out.println("Pair found.");
		else
			System.out.println("No match found.");
	}

	private static boolean pairExist(int[] arr, int sum) {
		int pivotIdx = findPivot(arr);
		// If pivot is found
		if(pivotIdx != -1) {
			// Converting it to a similar problem as of not rotated array
			// start index can be pivotIdx + 1 and end index can be pivotIdx
			int start = pivotIdx + 1, end = pivotIdx;
			while(start != end) {
				int condition = arr[start] + arr[end];
				if( condition == sum)
					return true;
				else if(condition < sum)
					start = (start + 1) % arr.length;
				else
					end = (end - 1 + arr.length) % arr.length;
			}
			return false;
		}
		return false;
	}

	private static int findPivot(int[] arr) {
		for(int i=0; i< arr.length - 1; i++) {
			if(arr[i] > arr[i+1])
				return i;
		}
		return -1;
	}

}
