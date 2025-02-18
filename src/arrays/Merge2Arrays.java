package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Merge2Arrays {
	private int[] merge(int[] arr1, int[] arr2) {
		int[] arr = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).toArray();
		return arr;
		
	}
	private List mergeArraylist(List<Integer> arrList,List<Integer> arrList2) {
		
		arrList.addAll(arrList2);
		
		return arrList;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Merge2Arrays obj = new Merge2Arrays();
		int [] arr1 = {3,5,3,7,4,9}, arr2 = {3,2,4,56,7};
		int[] arr =obj.merge(arr1,arr2);
		System.out.println(arr);
        List<Integer> arraylist1 = new ArrayList<Integer>();
        List<Integer> arraylist2 = new ArrayList<Integer>();
        for(int nums:arr1) {
        	arraylist1.add(nums);
        }
        for(int nums:arr2) {
        	arraylist2.add(nums);
        }
        System.out.println(obj.mergeArraylist(arraylist1, arraylist2));
        List<Integer> mergedList = obj.mergeArraylist(arraylist1, arraylist2);
        List<Integer> sortedList= mergedList.stream().distinct().sorted().toList();
        System.out.println(sortedList);
	}

	
}
