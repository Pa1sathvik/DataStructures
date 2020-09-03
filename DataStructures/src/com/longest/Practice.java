package com.longest;

public class Practice {

	/*
    5
   / \
  1   8
     / \
    0   10 */

	private static TreeNode main = null;
	public static void main(String[] args) {

		
		main = new TreeNode(5);
		main.left = new TreeNode(1);
		main.right = new TreeNode(8);
		main.right.left = new TreeNode(0);
		main.right.right = new TreeNode(10);
		
		System.out.println(isValidBST(main));
		
	}

	static boolean BST(TreeNode root, TreeNode left, TreeNode right) {

		if (root == null) {

			return true;
		} else if (left != null && root.val <= left.val) {

			return false;

		} else if (right != null && root.val >= right.val) {

			return false;
		}

		// checks for each every node

		return (BST(root.left, left, root) && BST(root.right, root, right));

	}

	public static boolean isValidBST(TreeNode root) {

		return BST(root, null, null);

	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {

		this.val = val;
		this.left = left;
		this.right = right;
	}
}
