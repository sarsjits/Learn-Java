package com.sarsjits.java.datastructures.arrays;

import com.sarsjits.java.util.ArrayUtil;

/**
 * For K sorted arrays, almost always insertion sort wins, but heap solution is
 * even more efficient. In this we build min heap for first k + 1 elements, time
 * complexity for this is O(k) and then insert the remaining elements one by one
 * by removing the min element. This would take O((n-k)logk) time.
 * 
 * @author Jitendra Sarswat
 *
 */
public class KSortedHeapSolution {

	private static int calledHowManyTimes = 0;

	public static void main(String[] args) {
		int arr[] = { 2, 6, 3, 12, 56, 8 };
		int k = 3;
		sort(arr, k);
		ArrayUtil.printArray(arr);
	}

	private static void sort(int[] arr, int k) {
		// Let's create a min heap of first k + 1 elements
		int[] heapArray = new int[k + 1];
		for (int i = 0; i <= k; i++) {
			heapArray[i] = arr[i];
		}

		// Bottom up heap starts with n/2 - 1, here n = k + 1
		for (int i = (k - 1) / 2; i >= 0; i--) {
			heapify(heapArray, k + 1, i);
		}

		// Now since the min heap is built, we have to extract the min
		// element one by one and then replace it with the next arr element
		// once the elements are finished in arr, we will extract instead of
		// replacing.
		for (int i = k + 1, j = 0; j < arr.length; j++, i++) {
			if (i < arr.length) {
				arr[j] = replaceMin(heapArray, arr[i], k);
			} else {
				arr[j] = extractMin(heapArray, k);
			}
		}
	}

	/**
	 * A bad hack is used in this function. Once you review this code don't move on
	 * and leave the code to rot behind. Next time keep a variable named size as
	 * global variable.
	 * 
	 * @param heapArray
	 * @param k
	 * @return
	 */
	private static int extractMin(int[] heapArray, int k) {
		int minToBeReturned = heapArray[0];
		heapArray[0] = heapArray[k + 1 - calledHowManyTimes - 1];
		calledHowManyTimes++;
		heapify(heapArray, k + 1 - calledHowManyTimes, 0);
		return minToBeReturned;
	}

	private static int replaceMin(int[] heapArray, int replaceWith, int k) {
		int minToBeReturned = heapArray[0];
		heapArray[0] = replaceWith;
		if (replaceWith > minToBeReturned) {
			heapify(heapArray, k + 1, 0);
		}
		return minToBeReturned;
	}

	private static void heapify(int[] heapArray, int length, int node) {
		int parent = node;
		int leftChild = 2 * parent + 1;
		int rightChild = 2 * parent + 2;
		if (leftChild < length && heapArray[leftChild] < heapArray[parent]) {
			parent = leftChild;
		}
		if (rightChild < length && heapArray[rightChild] < heapArray[parent]) {
			parent = rightChild;
		}
		if (parent != node) {
			ArrayUtil.swap(heapArray, parent, node);
			heapify(heapArray, length, parent);
		}
	}

}
