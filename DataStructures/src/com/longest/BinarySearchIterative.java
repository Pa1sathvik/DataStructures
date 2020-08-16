package com.longest;

public class BinarySearchIterative {

	// Iterative approach.
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int search = 9;

		int low = 0;
		int mid = 0;
		int high = a.length - 1;

		while (low >= 0 && high <= a.length - 1) {

			mid = (low + high) / 2;
			if (a[mid] == search) {

				System.out.println("Element is present at ::" + (mid + 1) + "th position");
				break;
			} else if (a[mid] < search) {

				low = mid + 1;
			} else {

				high = mid - 1;
			}

		}

	}

}
