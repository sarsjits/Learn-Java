package com.sarsjits.java.datastructures.linkedlist;

/**
 * In this we will add the basic functionality of linkedlist and will be used as
 * a base in other classes solving related problems.
 * 
 * @author Jitendra Sarswat
 *
 */
public class LinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void printList() {
		Node traversalNode = head;
		while (traversalNode != null) {
			System.out.print(traversalNode.data + " ");
			traversalNode = traversalNode.next;
		}
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
		if(prevNode == null)
			return;
		Node newNode = new Node(d);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}

}
