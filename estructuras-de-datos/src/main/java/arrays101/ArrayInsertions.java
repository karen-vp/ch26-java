package arrays101;

public class ArrayInsertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare an integer array of 6 elements
		int[] intArray = new int[6];
		int length = 0;

		// Add 3 elements to the Array
		for (int i = 0; i < 3; i++) {
		    intArray[length] = i;
		    length++;
		}
//		printArray(intArray);
		
		/**Inserting at the End of an Array**/
		// Insert a new element at the end of the Array. Again,
		// it's important to ensure that there is enough space
		// in the array for inserting a new element.
		intArray[length] = 10;
		length++;
		System.out.println("==================");
//		printArray(intArray);
		
		/**Inserting at the Start of an Array**/
		// First, we will have to create space for a new element.
		// We do that by shifting each element one index to the right.
		// This will firstly move the element at index 3, then 2, then 1, then finally 0.
		// We need to go backwards to avoid overwriting any elements.
		for (int i = 3; i >= 0; i--) {
		    intArray[i + 1] = intArray[i];
		}

		// Now that we have created space for the new element,
		// we can insert it at the beginning.
		intArray[0] = 20;
		System.out.println("==================");
//		printArray(intArray);
		
		
		/**Inserting Anywhere in the Array**/
		// Say we want to insert the element at index 2.
		// First, we will have to create space for the new element.
		for (int i = 4; i >= 2; i--)
		{
		    // Shift each element one position to the right.
		    intArray[i + 1] = intArray[i];
		}

		// Now that we have created space for the new element,
		// we can insert it at the required index.
		intArray[2] = 30;
		System.out.println("==================");
//		printArray(intArray);
		
		ArrayInsertions arrayInsertions = new ArrayInsertions();
		//System.out.println(arrayInsertions.duplicateZeros(new int[] {1,0,2,3,0,4,5,0}));
		arrayInsertions.merge(new int[] {1,2,3,0,0,0},3, new int[] {2,5,6}, 3);
	}
	
	public static void printArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
		    System.out.println("Index " + i + " contains " + intArray[i]);
		}
	}
	/*
	 * Given a fixed-length integer array arr, duplicate each occurrence of zero, 
	 * shifting the remaining elements to the right.

		Note that elements beyond the length of the original array are not written. 
		Do the above modifications to the input array in place and do not return anything.
		
		Example 1:

		Input: arr = [1,0,2,3,0,4,5,0]
		Output: [1,0,0,2,3,0,0,4]
		Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
	 * 
	 * */
	public int[] duplicateZeros(int[] arr) {
        
        int zerosToDuplicate = 0;

       // Count the number of zeros in the original array
       for (int num : arr) {
           if (num == 0) {
               zerosToDuplicate++;
           }
       }

       // Traverse the array from the end and perform the shift and duplication
       for (int i = arr.length - 1; i >= 0; i--) {
           if (arr[i] == 0) { // condition to check if number is equal to 0
               if (i + zerosToDuplicate < arr.length) {
                   arr[i + zerosToDuplicate] = 0;
               }
               zerosToDuplicate--;// reduce 1 to zeros counter 

               if (i + zerosToDuplicate < arr.length) {
                   arr[i + zerosToDuplicate] = 0;
               }
           } else {
               if (i + zerosToDuplicate < arr.length) {
                   arr[i + zerosToDuplicate] = arr[i];
               }
           }
       }
       return arr;
   }
	
	/*
	 * Merge Sorted Array

		Solution
		You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
		
		Merge nums1 and nums2 into a single array sorted in non-decreasing order.
		
		The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 
		Example 1:
		
		Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
		Output: [1,2,2,3,5,6]
		Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
		The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
	 * 
	 */
	
	
		public int[] merge(int[] nums1, int m, int[] nums2, int n) {
	        int i = m - 1; // Index for nums1
	        int j = n - 1; // Index for nums2
	        int k = m + n - 1; // Index for merged array
	     
	     while (i >= 0 && j >= 0) {
	         if (nums1[i] > nums2[j]) {
	             nums1[k] = nums1[i];
	             i--;
	         } else {
	             nums1[k] = nums2[j];
	             j--;
	         }
	         k--;
	     }
	     
	     // If there are remaining elements in nums2, copy them to nums1
	     while (j >= 0) {
	         nums1[k] = nums2[j];
	         j--;
	         k--;
	     }
	     
	     for(int num: nums1) {
	    	 System.out.println(num);
	     }
	     return nums1;
	 }

}
