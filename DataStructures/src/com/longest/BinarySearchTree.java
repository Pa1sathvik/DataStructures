package com.longest;

public class BinarySearchTree {

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

class Nada {

	int data;
	Nada left, right;

	Nada(int data) {

		this.data = data;
	}

}
