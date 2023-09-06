package arrays101;

public class ArrayDeletions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Declare an integer array of 10 elements.
		int[] intArray = new int[10];

		// The array currently contains 0 elements
		int length = 0;

		// Add elements at the first 6 indexes of the Array.
		for(int i = 0; i < 6; i++) {
		    intArray[length] = i;
		    length++;
		}
		
		/*Deleting from the End of the Array*/
		// Deletion from the end is as simple as reducing the length
		// of the array by 1.
		length--;
		
		// Iterating through the valid indexes of the array
		System.out.println("Iterating through the valid indexes of the array");
		for (int i = 0; i < intArray.length; i++) {
		    System.out.println("Index " + i + " contains " + intArray[i]);
		}
		
		System.out.println("===================");
		System.out.println("Iterating through the values we've put in the array (after deleting 1 value)");
		// Iterating through the values we've put in the array
		for (int i = 0; i < length; i++) {
		    System.out.println("Index " + i + " contains " + intArray[i]);
		}
		
		/*
		 * Yup, that's it! Even though we call it a deletion, it's not like we actually 
		 * freed up the space for a new element, right? This is because we don't actually 
		 * need to free up any space. Simply overwriting the value at a certain index 
		 * deletes the element at that index. Seeing as the length variable in our 
		 * examples tells us the next index where we can insert a new element, 
		 * reducing it by one ensures the next new element is written over the 
		 * deleted one. This also indicates that the Array now contains one less 
		 * element, which is exactly what we want programmatically.
		 */
		
		/*
		 * Deleting From the Start of an Array
		 * 
		   Next comes the costliest of all deletion operations for an Array—deleting 
		   the first element. If we want to delete the first element of the Array, 
		   that will create a vacant spot at the 0th index. To fill that spot, we 
		   will shift the element at index 1 one step to the left. Going by the ripple 
		   effect, every element all the way to the last one will be shifted one place 
		   to the left. This shift of elements takes O(N) time, where N is the number 
		   of elements in the Array. 
		 * */
		
		int[] arrayStart = new int[] {1,2,3,4,5,6,7,8};
		int lengthStart = 8;
		
		// Starting at index 1, we shift each element one position
		// to the left.
		for (int i = 1; i < lengthStart; i++) {
		    // Shift each element one position to the left
			arrayStart[i - 1] = arrayStart[i];
		}

		// Note that it's important to reduce the length of the array by 1.
		// Otherwise, we'll lose consistency of the size. This length
		// variable is the only thing controlling where new elements might
		// get added.
		lengthStart--;
		
		/*
		 * Starting from index 1, we'll move every element one position to its left, 
		 * effectively "deleting" the element at index 0. We also need to reduce 
		 * length by 1 so that the next new element is inserted in the correct position.
		 */

		//And here's the output we'll get, with our updated printArray function.
		System.out.println("===============");
		System.out.println("Deleting a value from the START of the ARRAY");
		printArray(arrayStart, lengthStart);
		
		
		/*
		 * Deleting From Anywhere in the Array
		 * 
			 For deletion at any given index, the empty space created by the deleted 
			 item will need to be filled. Each of the elements to the right of the
			 index we're deleting at will get shifted to the left by one. 
			 Deleting the first element of an Array is a special case of 
			 deletion at a given index, where the index is 0. This shift 
			 of elements takes O(K) time where K is the number of elements
			 to the right of the given index. Since potentially K = N,
			 we say that the time complexity of this operation is also O(N)
		 * */
		int[] arrayAnywhere = new int[] {1,2,3,4,5,6,7,8};
		int lengthAnywhere = 8;
		// Say we want to delete the element at index 1
		for (int i = 2; i < lengthAnywhere; i++) {
		    // Shift each element one position to the left
			arrayAnywhere[i - 1] = arrayAnywhere[i];
		}

		// Again, the length needs to be consistent with the current
		// state of the array.
		lengthAnywhere--;
		
		System.out.println("===============");
		System.out.println("Deleting a value from the ANYWHERE of the ARRAY (we're deleting a value at index 1)");
		printArray(arrayAnywhere,lengthAnywhere );
		System.out.println("===============");
		System.out.println(" Remove Duplicates from Sorted Array");
		System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
	}
	
	static void printArray(int[] intArray, int length) {
		// Iterating through the array with the values we've put in the array
				for (int i = 0; i < length; i++) {
				    System.out.println("Index " + i + " contains " + intArray[i]);
				}
	}
	
	/*
	 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such 
	 * that each unique element appears only once. The relative order of the elements should be kept the 
	 * same. Then return the number of unique elements in nums.

		Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

		Change the array nums such that the first k elements of nums contain the unique elements in the order 
		they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
		Return k.
	 * 
	 * Example 1:

		Input: nums = [1,1,2]
		Output: 2, nums = [1,2,_]
		Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
		It does not matter what you leave beyond the returned k (hence they are underscores).

	 * 
	 * */
	
	static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // No unique elements
        }
        
        int k = 1; // Count of unique elements
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i]; // Move unique elements to the front
                k++; // Increment count
            }
        }
        for(int num: nums) {
        	System.out.println(num);
        }
        return k;
        }

}
