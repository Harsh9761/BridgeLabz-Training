package com.example.junit.junit_testing;

public class StringUtils {
	
	public String reverse(String str) {
		StringBuilder s = new StringBuilder(str);
		return s.reverse().toString();
	}
	
	public boolean isPalindrome(String str) {
		int l = 0;
		int r = str.length()-1;
		while(l<r) {
			if(str.charAt(l)!=str.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
	
	public String toUpperCase(String str) {
		return str.toUpperCase();
	}
}
