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
		list.insertAtBeginning(7);
		list.insertAtBeginning(17);
		list.insertAtBeginning(117);
		list.insertAtEnd(1117);
		list.printList();
	}

}
