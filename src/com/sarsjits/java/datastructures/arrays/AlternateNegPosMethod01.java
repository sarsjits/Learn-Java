package com.sarsjits.java.datastructures.arrays;

/**
 * Maintaining the order of appearance.
 * 
 * It is implemented by the following method: An out of place element is the one
 * which shouldn't be at that place So if want the array to be arranged in a way
 * where there are neg pos ... etc elements in the alternate fashion and
 * assuming 0 based index, the negative element at odd index and positive
 * element at even index is an out of place element
 * 
 * Look for the first out of place element and once found, look for the first
 * element of the opposite sign. Then right rotate the sub-array including the
 * two out of place elements.
 * 
 * @author Jitendra Sarswat
 *
 */
public class AlternateNegPosMethod01 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -4, -1, 4 };
	}

}
