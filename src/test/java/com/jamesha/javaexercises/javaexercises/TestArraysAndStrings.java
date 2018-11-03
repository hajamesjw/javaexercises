package com.jamesha.javaexercises.javaexercises;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestArraysAndStrings {
	
	@Test
	public void testIsUniqueReturnTrueWhenAllCharactersAreUnique() {
		assertTrue(ArraysAndStrings.isUnique("abcdef"));
	}
	
	@Test
	public void testIsUniqueReturnFalseWhenAllCharactersAreNotUnique() {
		assertFalse(ArraysAndStrings.isUnique("aabcdd"));
	}
	
	@Test
	public void testCheckPermutationReturnTrueWhenStringsArePermutations() {
		assertTrue(ArraysAndStrings.checkPermutation("Abba", "Baba"));
	}
	
	@Test
	public void testCheckPermutationReturnFalseWhenStringsAreNotPermutations() {
		assertFalse(ArraysAndStrings.checkPermutation("Abba", "Wxyz"));
	}
	
	@Test
	public void testUrlify() {
		assertEquals("Mr%20John%20Smith", ArraysAndStrings.urlify("Mr John Smith    ", 13));
	}
	
	@Test
	public void testPalindromePermutationReturnTrueWhenStringIsPermutationOfPalindrome() {
		assertTrue(ArraysAndStrings.palindromePermutation("Tact Coa"));
	}
}
