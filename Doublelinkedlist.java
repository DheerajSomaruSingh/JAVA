package com.Doublelinkedlist;

public class Doublelinkedlist {
	Node head;
	//insertfirst
	public void insertFirst(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		newNode.prev = null;
		if(head != null) {
			head.prev = newNode;
		}
		head = newNode;
	}
	
	//display
	public void display() {
		Node newNode = head;
		Node last = null;
		while(newNode != null) {
			System.out.print(newNode.val + "->");
			last = newNode;
			newNode = newNode.next;
		}
		System.out.println("NULL");
		
		while(last != null) {
			System.out.print(last.val + "->");
			last = last.prev;
		}
		System.out.println("start");
	}
	
	class Node{
		int val;
		Node next;
		Node prev;
		
		public Node(int val) {
			this.val = val;
		}
		
		public Node(int val, Node next, Node prev) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
	}
	public static void main(String[] args) {
		Doublelinkedlist list = new Doublelinkedlist();
		list.insertFirst(8);
		list.insertFirst(2);
		list.insertFirst(9);
		list.insertFirst(10);
		list.display();
		
	}

}
