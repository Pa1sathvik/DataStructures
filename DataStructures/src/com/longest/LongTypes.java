package com.longest;

public class LongTypes {

	public static void main(String[] args) {

		
		String name = "vtkgn";
		String typed = "vttkgnn";
		boolean isFlop = false;
		int i = 0;
		int j = 0;
		char prevChar = '\u0000';
		while (i < name.length() && j < typed.length()) {

			if (name.charAt(i) == typed.charAt(j)) {

				prevChar = name.charAt(i);
				i++;
				j++;

			} else if (name.charAt(i) != typed.charAt(j) && prevChar == typed.charAt(j)) {

				j++;
			} else {

				isFlop = true;
				System.out.println("flop");
				break;
			}

		}

		System.out.println(i);
		System.out.println(j);

		if (isFlop)
			System.out.println("flop");

		if (i-1 == name.length() - 1 && j-1 == typed.length() - 1)
			System.out.println("flop!");
		else
			System.out.println("flop");
	}

}
