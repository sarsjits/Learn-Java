package com.sarsjits.java.datastructures.linkedlist;

public class ReverseLinkedListConcreteClass {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int arr[] = {1,2,3,4,5,6};
		LinkedList.insertArrayInList(arr, list);
		LinkedList.reverseIteratively(list);
		list.printList();
	}

}
