package com.jamesha.javaexercises.javaexercises;

import java.util.Arrays;

/*
 * Cracking the Coding Interview, 6th
 * Chapter 1 Solutions
 */
public class ArraysAndStrings {

	/*
	 * p.90 1.1
	 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
	 */
	public static boolean isUnique(String string) {
		char[] charArray = string.toCharArray();
		Arrays.sort(charArray);
		char previousChar = charArray[0];
		for (int i = 1; i < charArray.length; i++) {
			if (previousChar == charArray[i]) {
				return false;
			}
			previousChar = charArray[i];
		}
		return true;
	}
	
	/*
	 * p.90 1.2
	 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
	 */
	public static boolean checkPermutation(String stringA, String stringB) {
		char[] charArrayA = stringA.toLowerCase().toCharArray();
		char[] charArrayB = stringB.toLowerCase().toCharArray();
		Arrays.sort(charArrayA);
		Arrays.sort(charArrayB);
		return Arrays.equals(charArrayA, charArrayB);
	}

	/*
	 * p.90 1.3
	 * URLify: Write a method to replace all spaces in a string with '%20: You may assume that the string has sufficient space at the end to hold the additional characters, 
	 * and that you are given the "true" length of the string. (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
	 */
	public static String urlify(String string, int trueLengthOfString) {
		char[] charArray = string.toCharArray();
		String urlifyString = "";
		for (int i = 0; i < trueLengthOfString; i++) {
			if (charArray[i] == ' ') {
				urlifyString = urlifyString + "%20";
			} else {
				urlifyString = urlifyString + charArray[i];
			}
		}
		return urlifyString;
	}
	
	/*
	 * p.91 1.4
	 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. 
	 * A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. 
	 * The palindrome does not need to be limited to just dictionary words. EXAMPLE
	 */
	public static boolean palindromePermutation(String string) {
		return true;
	}
}