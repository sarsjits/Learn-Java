package com.sarsjits.java.datastructures.linkedlist;

public class SwapNodesInList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int arr[] = { 10, 15, 12, 13, 20, 14 };
		LinkedList.insertArrayInList(arr, list);
		swapNode(10, 14, list);
		list.printList();
	}

	private static void swapNode(int x, int y, LinkedList list) {
		LinkedList.Node curX = list.head, curY = list.head;
		LinkedList.Node prevX = null, prevY = null;
		
		// This means the list is empty
		if(curX == null) return;
		
		// If both the keys are equal, then no swap is required
		if(x == y) return;
		
		// Search for x, if found, get its previous. If not found, return.
		while(curX != null && curX.data != x) {
			prevX = curX;
			curX = curX.next;
		}
		
		// This means that the x was not found
		if(curX == null) return;

		// Search for y, if found, get its previous. If not found, return.
		while(curY != null && curY.data != y) {
			prevY = curY;
			curY = curY.next;
		}
		
		// This means that the y was not found
		if(curY == null) return;

		// swap
		if(prevX == null) {
			list.head = curY;
		} else {
			prevX.next = curY;
		}
		
		if(prevY == null) {
			list.head = curX;
		} else {
			prevY.next = curX;
		}
		
		LinkedList.Node tmp = curX.next;
		curX.next = curY.next;
		curY.next = tmp;
	}

}
