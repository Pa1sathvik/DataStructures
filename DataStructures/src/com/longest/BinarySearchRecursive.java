package com.longest;

public class BinarySearchRecursive {

	public static void main(String args[]) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int low = 0;
		int high = a.length - 1;
		int search = 2;

		System.out.println("Element is present at "+(findElementInBS(low, high, a, search)+1) +"th position");

	}

	private static int findElementInBS(int low, int high, int[] a, int search) {

		int mid = (high + low) / 2;
		if (a[mid] == search) {

			return mid;
		} else if (a[mid] < search) {

			return findElementInBS(mid + 1, high, a, search);
		} else {

			return findElementInBS(low, mid - 1, a, search);

		}

	}
}
