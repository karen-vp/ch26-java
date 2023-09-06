package arrays101test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import arrays101.ArrayInsertions;

public class TestArrayInsertions {

	ArrayInsertions arrayInsertions = new ArrayInsertions();
	
	@Test
	public void testDuplicateZeros() {
		assertArrayEquals(new int[] {1,0,0,2,3,0,0,4}, arrayInsertions.duplicateZeros(new int[]{1,0,2,3,0,4,5,0}));
		assertArrayEquals(new int[] {1,2,3}, arrayInsertions.duplicateZeros(new int[]{1,2,3}));
	}
	
	@Test
	public void testMerge() {
		assertArrayEquals(new int[] {1,2,2,3,5,6}, arrayInsertions.merge(new int[] {1,2,3,0,0,0},3, new int[] {2,5,6}, 3));
		assertArrayEquals(new int[] {1}, arrayInsertions.merge(new int[] {1},1, new int[] {}, 0));
	}
}
