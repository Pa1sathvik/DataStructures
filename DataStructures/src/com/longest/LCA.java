package com.longest;

public class LCA {
	
	private static int lheight, rheight;;

	public static void main(String args[]) {

		Nade main = new Nade(2);
		main.left = new Nade(1);
		main.right = new Nade(4);
		main.right.left = new Nade(3);
		main.right.right = new Nade(5);
		main.right.right.right = new Nade(6);
		// printInorder(main);
		System.out.println(lca(main, 1, 4).data);
		maxDepth(main, lheight, rheight);

	}

	private static void maxDepth(Nade main, int lheight, int rheight) {

		if (main.left != null) {


		}

	}

	private static Nade lca(Nade main, int i, int j) {

		if (i > main.data && j > main.data) {

			return lca(main.right, i, j);
		}

		if (i < main.data && j < main.data) {

			return lca(main.left, i, j);
		}

		return main;

	}

	private static void printInorder(Nade main) {

		if (main != null) {

			printInorder(main.left);
			System.out.println(main.data);
			printInorder(main.right);
		}
	}
}

class Nade {

	int data;
	Nade left, right;

	Nade(int data) {

		this.data = data;
	}
}