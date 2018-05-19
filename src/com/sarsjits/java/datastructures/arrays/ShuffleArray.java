package com.sarsjits.java.datastructures.arrays;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import com.sarsjits.java.util.ArrayUtil;

/**
 * Fisher-Yates shuffle using Java 7's ThreadLocalRandom.
 * https://dzone.com/articles/java-7s-threadlocalrandom
 * 
 * @author Jitendra Sarswat
 *
 */
public class ShuffleArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		shuffle(arr);
		ArrayUtil.printArray(arr);
	}

	private static void shuffle(int[] arr) {
		// If using Java 6 or lower use new Random() in the R.H.S.
		Random rnd = ThreadLocalRandom.current();
		for (int i = arr.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			ArrayUtil.swap(arr, i, index);
		}
	}

}
