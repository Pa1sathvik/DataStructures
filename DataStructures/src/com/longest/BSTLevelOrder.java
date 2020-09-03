package com.longest;

import java.util.LinkedList;
import java.util.Queue;

public class BSTLevelOrder {

	private static Nada main = null;

	public static void main(String[] args) {

		int a[] = { 11, 0, 10, 2, 3, 4, 5, 6, 7 };

		for (int i = 0; i < a.length; i++) {

			insertIntoTree(a[i]);
		}

		inOrderTraversal(main); // Returns BST elements in Sorted order...
		System.out.println("=========================================================");
		preOrderTraversal(main);
		System.out.println("=========================================================");
		postOrderTraversal(main);
		System.out.println("=========================================================");
		levelOrderTraversal(main);

	}

	private static void levelOrderTraversal(Nada main2) {

		
		Queue<Nada> qu = new LinkedList<Nada>();
		qu.add(main2);
		
		while(!qu.isEmpty()) {
			
			Nada mainn = qu.poll();
			System.out.println(mainn.data);
			if(mainn.left != null)
				qu.add(mainn.left);
			if(mainn.right != null)
				qu.add(mainn.right);
			
			
		}
		
		
	}

	private static void inOrderTraversal(Nada main2) {

		
		if (main2 != null) {

			preOrderTraversal(main2.left);
			System.out.println(main2.data);
			preOrderTraversal(main2.right);
			
			
		}

	}

	private static void preOrderTraversal(Nada main2) {

		if (main2 != null) {
			System.out.println(main2.data);
			inOrderTraversal(main2.left);
			inOrderTraversal(main2.right);
		}

	}

	
	private static void postOrderTraversal(Nada main2) {

		if (main2 != null) {
			
			inOrderTraversal(main2.left);
			inOrderTraversal(main2.right);
			System.out.println(main2.data);
		}

	}

	private static void insertIntoTree(int i) {

		main = insertInTree(main, i);

	}

	private static Nada insertInTree(Nada main2, int i) {

		if (main2 == null) {

			main2 = new Nada(i);
			return main2;
		} else if (i < main2.data) {

			main2.left = insertInTree(main2.left, i);

		} else {

			main2.right = insertInTree(main2.right, i);
		}

		return main2;

	}

}


