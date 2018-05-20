package com.sarsjits.java.datastructures.linkedlist;

public class MiddleElementInList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int arr[] = {1,2,3,4,5};
		LinkedList.insertArrayInList(arr, list);
		System.out.println("Middle element is: " + findMiddle(list));
	}

	private static int findMiddle(LinkedList list) {
		LinkedList.Node slow = list.head;
		LinkedList.Node fast = list.head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow.data;
	}

}
