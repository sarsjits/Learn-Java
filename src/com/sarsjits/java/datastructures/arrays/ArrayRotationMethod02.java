package com.sarsjits.java.datastructures.arrays;

/**
 * This method is known as Juggling Algorithm in which we calculate the GCD of
 * (number of elements) and (number by which array must be rotated)
 * 
 * @author Jitendra Sarswat
 *
 */
public class ArrayRotationMethod02 {

	public static void main(String[] args) {
		ArrayRotationMethod02 rotateArray = new ArrayRotationMethod02();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		rotateArray.rotate(arr, 3);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	/**
	 * Juggling algorithm. Good to know stuff GCD(M,N) * LCM(M,N) = M*N Explanation:
	 * https://stackoverflow.com/a/23321270/4604689 We will reach to the starting
	 * point in the inner loop that is 0th index after LCM(m,n) cycles. Number of
	 * elements swapped in one cycle is LCM(arr.length,rotateBy)/rotateBy. So the
	 * outer loop will run arr.length/(LCM(arr.length,rotateBy)/rotateBy) which is
	 * GCD(arr.length,rotateBy)
	 * 
	 * @param arr
	 * @param rotateBy
	 */
	private void rotate(int[] arr, int rotateBy) {
		if (null != arr && arr.length > 0 && rotateBy <= arr.length) {
			int gcd = calculateGCD(arr.length, rotateBy);
			for (int i = 0; i < gcd; i++) {
				int temp = arr[i], j = i, k;
				while (true) {
					k = j + rotateBy;
					if (k >= arr.length)
						k -= arr.length;
					if (k == i)
						break;
					arr[j] = arr[k];
					j = k;
				}
				arr[j] = temp;
			}
		}
	}

	/**
	 * Calculates the GCD of two numbers
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private int calculateGCD(int a, int b) {
		if (b == 0)
			return a;
		else
			return calculateGCD(b, a % b);
	}

}
