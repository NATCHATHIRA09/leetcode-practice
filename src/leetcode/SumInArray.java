package leetcode;

public class SumInArray {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
      for(int i=0;i<=nums.length-1;i++){
        for(int j=i+1;j<=nums.length-1;j++){
            if(nums[i]+nums[j]==target){
                result[0]=i;
                result[1]= j;
                break;

            }
        }
      }  
   return result; }
    public static void main(String[] args) {
		
	}
}