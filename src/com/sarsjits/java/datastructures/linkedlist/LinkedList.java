package com.sarsjits.java.datastructures.linkedlist;

/**
 * In this we will add the basic functionality of linkedlist and will be used as
 * a base in other classes solving related problems.
 * 
 * @author Jitendra Sarswat
 *
 */
public class LinkedList {

	// For all reference types, the default value is null.
	Node head;

	public static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void printList() {
		Node traversalNode = head;
		System.out.print("[ ");
		while (traversalNode != null) {
			System.out.print(traversalNode.data + " ");
			traversalNode = traversalNode.next;
		}
		System.out.print("]\n");
	}

	/**
	 * This would insert at the beginning of the list. This is done by creating a
	 * new node, the point new node's next to head and then head to new node.
	 * 
	 * @param d
	 */
	public void insertAtBeginning(int d) {
		Node newNode = new Node(d);
		newNode.next = head;
		head = newNode;
	}

	/**
	 * This is sometimes also referred to as the append function. This is done by
	 * creating a new node, then checking if the list is being created. If yes, then
	 * the head is pointed to the new node. Else, we traverse to the last node and
	 * point the last node to the new node.
	 * 
	 * @param d
	 */
	public void insertAtEnd(int d) {
		Node newNode = new Node(d);
		if (head == null) {
			head = newNode;
			return;
		}
		Node lastNode = head;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
		}
		lastNode.next = newNode;
	}

	/**
	 * This is done by first checking if the prevNode is not null and if it isn't
	 * then the new node is created and then it is same as if we have to insert in
	 * the beginning. This time at the beginning of prev.next
	 * 
	 * @param prevNode
	 * @param d
	 */
	public void insertAfterNode(Node prevNode, int d) {
		if (prevNode == null)
			return;
		Node newNode = new Node(d);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}

	/**
	 * Insert the array elements into the list. This will act as a helper function
	 * in other classes to make the coding simpler.
	 * 
	 * @param arr
	 */
	public static void insertArrayInList(int[] arr, LinkedList list) {
		for(int a: arr)
			list.insertAtEnd(a);
		list.printList();
	}

	/**
	 * Given a key, delete the node with the first occurrence of the key. Need to
	 * have two reference, one is current and another is prev.
	 * 
	 * @param key
	 */
	public void deleteNode(int key) {
		Node cur = head;
		Node prev = null;

		// If the head contains the key
		if (cur != null && cur.data == key) {
			head = head.next;
			return;
		}

		while (cur != null && cur.data != key) {
			prev = cur;
			cur = cur.next;
		}

		// the key was not found
		if (cur == null)
			return;

		prev.next = cur.next;
	}

	/**
	 * Delete the node at given index.
	 * 
	 * @param idx
	 */
	public void deleteAtIndex(int idx) {
		int i = 0;
		Node tmp = head;
		Node prev = null;

		if (tmp != null && idx == 0) {
			head = head.next;
			return;
		}

		while (tmp != null && i != idx) {
			prev = tmp;
			tmp = tmp.next;
			i++;
		}

		if (i != idx) {
			System.out.println("Index out of bound.");
			return;
		}

		prev.next = tmp.next;
	}

	/**
	 * Calculates the length of the linked list iteratively
	 * 
	 * @return
	 */
	public int lengthIterative() {
		Node tmp = head;
		int len = 0;
		while (tmp != null) {
			tmp = tmp.next;
			len++;
		}
		return len;
	}

	/**
	 * Calculates the length of the linked list recursively
	 * 
	 * @return
	 */
	public int lengthRecur() {
		Node tmp = head;
		return getLengthRecur(tmp);
	}

	private int getLengthRecur(Node node) {
		if (node == null)
			return 0;
		return 1 + getLengthRecur(node.next);
	}
}
