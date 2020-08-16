package com.longest;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static void main(String args[]) {

		System.out.println("len is " + lengthOfLongestSubstring("qerwererqwwewabcdefghijkl"));

	}

	public static int lengthOfLongestSubstring(String s) {

		int n = s.length();

		int ans = 0;
		int i = 0;
		int j = 0;
		Set<Character> hashSet = new HashSet<>();
		
		while(i<n && j<n) {
			
			if(!hashSet.contains(s.charAt(j))) {
				
				hashSet.add(s.charAt(j++));
				ans = Math.max(ans, j-i);
				
				
			}else {
				
				hashSet.remove(s.charAt(i++));
				
					
			}
			
		}
		
		System.out.println(hashSet.toString());
		return ans;

	}
}