package com.longest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//find-longest-word-in-dictionary-that-subsequence-of-given-string
//https://techdevguide.withgoogle.com/paths/foundational/find-longest-word-in-dictionary-that-subsequence-of-given-string/#code-challenge
public class LongestSubsequence {

	public static void main(String[] args) {

		String mainString = "bashjjfgsby";
		//List<String> list = Arrays.asList("able", "ale", "apple", "bale", "kangaroo");
		List<String> list = Arrays.asList("bagsby", "bby", "apple", "bashsby", "kangaroo");
		Map<Character, Store> hashMap = new HashMap<>();

		for (int i = 0; i < mainString.length(); i++) {

			if (!hashMap.containsKey(mainString.charAt(i))) {

				List<Integer> listC = new ArrayList<>();
				listC.add(i + 1);
				hashMap.put(mainString.charAt(i), new Store(1, listC));

			} else {

				List<Integer> listB = hashMap.get(mainString.charAt(i)).position;
				listB.add(i + 1);
				hashMap.put(mainString.charAt(i), new Store(hashMap.get(mainString.charAt(i)).count + 1, listB));
			}

		}

		//System.out.println(hashMap);

		Map<Character, Integer> hashM = new HashMap<>();
		
		String max = "";
		for (String string : list) {/*

			boolean isBreak = false;
			//System.out.println(string);
			hashMap.keySet().forEach(x -> {
				
				hashM.put(x, 0);
			});
			
			int lenNum = 0;
			int charCount = 0;
			for (int i = 0; i < string.length(); i++) {

				if (!hashMap.containsKey(string.charAt(i))) {

					isBreak = true;
					break;
				} else if ((hashMap.get(string.charAt(i)).count >= charCount
						&& hashMap.get(string.charAt(i)).position.get(hashM.get(string.charAt(i))) > lenNum)) {

					charCount++;
					lenNum = hashMap.get(string.charAt(i)).position.get(hashM.get(string.charAt(i)));
					hashM.put(string.charAt(i), hashM.get(string.charAt(i))+1);

				} else {
					
					break;
				}
			}
			
			if(!isBreak)
			max = max.length() > string.length() ?max:string;

		*/}
		
		System.out.println("Max string in sub sequence is ::"+max);

	}

}

class Store {

	int count;

	@Override
	public String toString() {
		return "Store [count=" + count + ", position=" + position + "]";
	}

	List<Integer> position;

	Store() {

	}

	Store(int count, List<Integer> position) {

		this.count = count;
		this.position = position;
	}

}