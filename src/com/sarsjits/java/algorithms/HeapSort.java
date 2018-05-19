package com.sarsjits.java.algorithms;

import com.sarsjits.java.util.ArrayUtil;

/**
 * Must read:
 * https://stackoverflow.com/questions/9755721/how-can-building-a-heap-be-on-time-complexity
 * https://www.geeksforgeeks.org/?p=12580 The binary heap is complete binary
 * tree whose last parent node can be calculated as n/2 - 1 (this gives the
 * index of last root in 0 based array). Since it is a complete binary tree it
 * can be very well be represented as an array whose first element is the root
 * of the tree. Heap sort has the time complexity of O(nlogn).
 * 
 * @author Jitendra Sarswat
 *
 */
public class HeapSort {

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		sort(arr);
		ArrayUtil.printArray(arr);
	}

	private static void sort(int[] arr) {
		// Heap sort consists of the following steps: build a heap from the given input.
		// Remove the top element, replace it with the last element and then call
		// heapify at root. Since we build heap from bottom-up (due to efficiency as
		// time complexity O(n)) we will start with the last parent node
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			heapify(arr, arr.length, i);
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			ArrayUtil.swap(arr, 0, i);
			heapify(arr, i, 0);
		}
	}

	/**
	 * Check if left child is greater, then if right child is greater. If either one
	 * of them is greater then swap with it and call heapify on that child.
	 * 
	 * @param arr
	 * @param length
	 * @param node
	 */
	private static void heapify(int[] arr, int length, int node) {
		int parent = node;
		int leftChild = 2 * node + 1;
		int rightChild = 2 * node + 2;

		if (leftChild < length && arr[leftChild] > arr[parent]) {
			parent = leftChild;
		}
		if (rightChild < length && arr[rightChild] > arr[parent]) {
			parent = rightChild;
		}
		if (parent != node) {
			ArrayUtil.swap(arr, parent, node);
			heapify(arr, length, parent);
		}
	}

}
