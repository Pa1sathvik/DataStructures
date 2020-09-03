package com.longest;

public class StockSell {

	public static void main(String[] args) {

		// Approach in O(n) time complexity with O(1) space complexity.
		
		int[] array = {500,400,300,200,10,200,240,1000,900,910};
		
		int maxProfit = 0;
		int minStock = Integer.MAX_VALUE;
		int startIndex= 0;
		int endindex = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] < minStock) {
				minStock = array[i];
				startIndex = i;
			}
			
			if(array[i] - minStock > maxProfit) {
				
				maxProfit = array[i] - minStock;
				endindex = i;
				
			}
		}
		
		System.out.println("Max profit is::"+maxProfit);
		System.out.println("Start index is::"+startIndex);
		System.out.println("min index is::"+endindex);
	}

}
