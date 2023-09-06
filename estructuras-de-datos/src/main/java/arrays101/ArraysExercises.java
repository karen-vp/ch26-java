package arrays101;

public class ArraysExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysExercises arrayExercises = new ArraysExercises();
		
		//System.out.println(arrayExercises.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
		//System.out.println(arrayExercises.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
//		System.out.println(arrayExercises.findNumbers(new int[]{12,345,2,6,7896}));
		System.out.println(arrayExercises.sortedSquares(new int[]{-4,-1,0,3,10}));
	}
	
	/*
	 * Given a binary array nums, return the maximum number of consecutive 1's in the array.

		Example 1:
		
		Input: nums = [1,1,0,1,1,1]
		Output: 3
		Explanation: The first two digits or the last three digits are consecutive 1s.
		The maximum number of consecutive 1s is 3
	 * */
	 public int findMaxConsecutiveOnes(int[] nums) {
		 int maxCount = 0;
	        int currentCount = 0;

	        for (int num : nums) {
	            if (num == 1) {
	                currentCount++;
	                maxCount = Math.max(maxCount, currentCount);
	            } else {
	                currentCount = 0;
	            }
	        }

	        return maxCount;
	    }
	 
	 /*
	  Given an array nums of integers, return how many of them contain an even number of digits.
	  
	  Example:
	   Input: nums = [12,345,2,6,7896]
		Output: 2
		Explanation: 
		12 contains 2 digits (even number of digits). 
		345 contains 3 digits (odd number of digits). 
		2 contains 1 digit (odd number of digits). 
		6 contains 1 digit (odd number of digits). 
		7896 contains 4 digits (even number of digits). 
		Therefore only 12 and 7896 contain an even number of digits.
	   */
	 public int findNumbers(int[] nums) {
	        int evenNumbers = 0;
	        int numberOfDigits=0;
	        for(int i=0; i<nums.length; i++){
	            while (nums[i] != 0) {
	            nums[i] /= 10; 
	            numberOfDigits++;     
	        }
	            if(numberOfDigits % 2 == 0){
	                evenNumbers++;
	            }
	            numberOfDigits = 0;
	        }
	        return evenNumbers;
	    }
	 
	 /*
	  * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

		Example 1:
		
		Input: nums = [-4,-1,0,3,10]
		Output: [0,1,9,16,100]
		Explanation: After squaring, the array becomes [16,1,0,9,100].
		After sorting, it becomes [0,1,9,16,100].
	  * 
	  * */
	 public int[] sortedSquares(int[] nums) {
         
		 for (int i = 0; i < nums.length; i++) {
	            nums[i]= (int)Math.pow(nums[i],2);
	        }
		 //Bubble sort algorithm
	        for (int i = 0; i < nums.length - 1; i++) {
	            for (int j = 0; j < nums.length - i - 1; j++) {
	                
	                if (nums[j] > nums[j + 1]) {
	                    int temp = nums[j];
	                    nums[j] = nums[j + 1];
	                    nums[j + 1] = temp;
	                }
	            }
	        }
	        
	        return nums;
	        
	    }

}
