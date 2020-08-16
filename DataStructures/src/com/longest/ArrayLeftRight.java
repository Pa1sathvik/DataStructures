package com.longest;

public class ArrayLeftRight {

	public static void main(String[] args) {

		//Index from which point sum of all elements to its right and left are equal.
		
		int arr[] = { 0, -3, 5, -4, -2, 3, 1, 0 };
		int sum = 0;
		int leftSum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}

		for (int i = 0; i < arr.length; i++) {

			sum -= arr[i];
			if (leftSum == sum) {

				System.out.println("inde i::" + i);
			}
			leftSum += arr[i];

		}
	}

}
