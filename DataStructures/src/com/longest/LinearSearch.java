package com.longest;

public class LinearSearch {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 3, 45, 56, 3, 4, 3, 2, 3, 4, 2, 34, 100 };

		int search = 56;
		int i = 0;
		while (i <= a.length - 1) {

			if (a[i] == search) {

				System.out.println("Found at ::" + (i + 1) + "th position");
			}
			i++;

		}

	}

}
