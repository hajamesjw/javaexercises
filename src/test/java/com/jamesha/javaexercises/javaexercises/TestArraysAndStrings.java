package com.jamesha.javaexercises.javaexercises;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Assert;
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
	
	@Test
	public void testPalindromePermutationRetrunFalseWhenStringIsNotPermutationOfPalindrome() {
		assertFalse(ArraysAndStrings.palindromePermutation("Zenith"));
	}
	
	@Test
	public void testOneAwayWhenOneCharacterReplacedReturnTrue() {
		assertTrue(ArraysAndStrings.oneAway("abcde", "abcdz"));
	}
	
	@Test
	public void testOneAwayWhenTwoCharacterReplacedReturnFalse() {
		assertFalse(ArraysAndStrings.oneAway("abcde", "abczz"));
	}
	
	@Test
	public void testOneAwayWhenOneCharacterAddedReturnTrue() {
		assertTrue(ArraysAndStrings.oneAway("abcde", "abzcde"));
	}
	
	@Test
	public void testOneAwayWhenTwoCharacterAddedReturnFalse() {
		assertFalse(ArraysAndStrings.oneAway("abcde", "abcdeyz"));
	}
	
	@Test
	public void testOneAwayWhenOneCharacterRemovedReturnTrue() {
		assertTrue(ArraysAndStrings.oneAway("abcde", "abcd"));
	}
	
	@Test
	public void testOneAwayWhenTwoCharacterRemovedReturnFalse() {
		assertFalse(ArraysAndStrings.oneAway("abcde", "abc"));
	}
	
	@Test
	public void testOneAwayWhenOneCharacterRemovedAndOneCharacterChangedReturnFalse() {
		assertFalse(ArraysAndStrings.oneAway("abcde", "abcx"));
	}
	
	@Test
	public void testOneAwayWhenOneCharacterAddedAndOneCharacterChangedReturnFalse() {
		assertFalse(ArraysAndStrings.oneAway("abcde", "abcdxx"));
	}
	
	@Test
	public void testOneAwayWithSameStringsReturnFalse() {
		assertFalse(ArraysAndStrings.oneAway("abcde", "abcde"));
	}
	
	@Test
	public void testStringCompression() {
		assertEquals("a2b1c5a3", ArraysAndStrings.stringCompression("aabcccccaaa"));
	}
	
	@Test
	public void testStringCompressionWithLongerCompressedStringReturnInputString() {
		assertEquals("abccd", ArraysAndStrings.stringCompression("abccd"));
	}
	
	@Test
	public void testRotateMatrix() {
		int[][] inputMatrix = {{1, 2}, 
							   {3, 4}};
		int[][] expectedMatrix = {{3, 1},
								  {4, 2}};
		Assert.assertArrayEquals(expectedMatrix, ArraysAndStrings.rotateMatrix(inputMatrix));
	}
}
