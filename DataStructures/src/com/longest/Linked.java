package com.longest;

public class Linked {

	private static Node main;

	public static void main(String[] args) {

		main = new Node(0);
		Node main1 = main;

		for (int i = 1; i < 10; i++) {

			main.next = new Node(i);
			main = main.next;

		}
		Node main2 = main1;
		while (main2.next != null) {

			System.out.println(main2.data);
			main2 = main2.next;
		}

		Node prev = null;
		Node next = null;
		Node current = main1;

		while (current != null) {

			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		while (prev.next != null) {

			System.out.println(prev.data);
			prev = prev.next;
		}

	}

}

class Node {

	int data;
	Node next;

	Node(int data) {

		this.data = data;
	}
}
