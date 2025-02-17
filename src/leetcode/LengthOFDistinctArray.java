package leetcode;

import java.util.Arrays;



public class LengthOFDistinctArray {
	
	    public static int removeDuplicatesJava8(int[] nums) {
	        Arrays.stream(nums).distinct().toArray();
	        int distinctLength = nums.length;
	        for(int num: nums) {
	        System.out.print(num+" ");}
	        System.out.println();
	    return distinctLength;
	    }
	    public static int removeDuplicates(int[] nums)
	    //removing duplicates using convention way with creating new variable
	    {
	        
	        int distinctLength = 1;
	            for (int i = 1; i < nums.length; i++) {
	                if (nums[i] != nums[i - 1]) {
	                    nums[distinctLength] = nums[i];
	                    distinctLength++;
	                }
	            }
	            return distinctLength;
	        }
	    public static void main(String[] args) {
	    	int[] arr = {0,0,1,1,1,2,2,3,3,4};
	    	int[] a =Arrays.stream(arr).distinct().toArray();
	    	System.out.println(removeDuplicates(arr));
	    	int[] expectedNums = {0,1,2,3,4}; // The expected answer with correct length

	    	int k = removeDuplicates(arr); // Calls your implementation

	    	assert k == expectedNums.length;
	    	for (int i = 0; i < k; i++) {
	    	    assert arr[i] == expectedNums[i];
	    	    System.out.println(arr[i]);
	    	}
			
		}
	}

