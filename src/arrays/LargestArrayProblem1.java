package arrays;

import java.util.Arrays;

public class LargestArrayProblem1 {
	
	int[] sortArray(int[] array1) {
		
		int [] arr1 = array1;
	    Arrays.sort(arr1);
		
		
	return arr1;
	}

	public static void main(String[] args) {
		
		int[] arr = {5,7,4,8,0,3};
		LargestArrayProblem1 obj = new LargestArrayProblem1();
		int[] b = obj.sortArray(arr);
		System.out.println(b[b.length-1]);
		
		 

	}

}
