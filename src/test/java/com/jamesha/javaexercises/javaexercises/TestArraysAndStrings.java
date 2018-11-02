package com.jamesha.javaexercises.javaexercises;

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
}
