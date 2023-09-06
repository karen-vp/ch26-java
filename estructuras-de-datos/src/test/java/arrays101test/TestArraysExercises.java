package arrays101test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import arrays101.ArraysExercises;

public class TestArraysExercises {
		
	ArraysExercises arrayExercises = new ArraysExercises();
	
	@Test
	public void testFindMaxConsecutiveOnes() {
		int expected = 3;
		int actual = arrayExercises.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1});
		assertEquals(expected, actual);
		assertEquals(2, arrayExercises.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
	}
	
	@Test
	public void testFindNumbers() {
		assertEquals(2, arrayExercises.findNumbers(new int[]{12,345,2,6,7896}));
		assertEquals(1, arrayExercises.findNumbers(new int[]{555,901,482,1771}));
	}
	
	@Test
	public void testsortedSquares() {
		assertArrayEquals(new int[]{0,1,9,16,100}, arrayExercises.sortedSquares(new int[]{-4,-1,0,3,10}));
		assertArrayEquals(new int[]{4,9,9,49,121}, arrayExercises.sortedSquares(new int[]{-7,-3,2,3,11}));
	}
	
}
