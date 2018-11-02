package com.jamesha.javaexercises.javaexercises;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestArraysAndStrings {
	
	@Test
	public void testIsUniqueReturnsTrueWhenAllCharactersAreUnique() {
		assertTrue(ArraysAndStrings.isUnique("abcdef"));
	}
	
	@Test
	public void testIsUniqueReturnsFalseWhenAllCharactersAreNotUnique() {
		assertFalse(ArraysAndStrings.isUnique("aabcdd"));
	}
}
