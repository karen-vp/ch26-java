package com.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {

    MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    @DisplayName("Merge Sorted Arrays should work")
    public void mergeTest(){
        
        int[] expected = new int[]{1,2,2,3,5,6};
        int[] actual = mergeSortedArray.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);

        assertArrayEquals(expected, actual);
        assertArrayEquals(new int[]{1}, mergeSortedArray.merge(new int[]{1}, 1, new int[]{}, 0));
        assertArrayEquals(new int[]{1}, mergeSortedArray.merge(new int[]{0}, 0, new int[]{1}, 1));
        
    }
}
