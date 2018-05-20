package com.sarsjits.java.datastructures.linkedlist;

/**
 * This class will make use of LinkedList class in this package to test the
 * basic operation of the linked list.
 * 
 * @author Jitendra Sarswat
 *
 */
public class LinkedListConcrete {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtEnd(1);
		list.printList();
		list.insertAtBeginning(7);
		list.printList();
		list.insertAtBeginning(17);
		list.printList();
		list.insertAtBeginning(117);
		list.printList();
		System.out.println("length of the linked list is: " + list.lengthRecur());
		list.insertAtEnd(1117);
		list.printList();
		list.deleteAtIndex(0);
		list.printList();
		list.deleteAtIndex(12);
		list.printList();
		list.deleteAtIndex(3);
		list.printList();
	}

}
