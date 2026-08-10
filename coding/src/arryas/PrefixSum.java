package arryas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrefixSum {
//a prefix sum is a new array created from original list of array where each element is the sum of its previous elment
// so if arr is [10.20.30] new array will be [10,30'50]
	
	
	public static int[] prefixsum(int[]arr) {
		int[] newarr = new int[arr.length];
		newarr[0]= arr[0];
		for(int i =1;i<arr.length;i++) {
			newarr[i] = newarr[i-1]+arr[i];
		}
		return newarr;
	}
	
	public static List<Integer> prefixsum(List<Integer> list) {
		List<Integer> newlist = new ArrayList<>();
		int sum = 0;
		for (int i : list) {
			sum = sum + i;
			newlist.add(sum);
		}
		return newlist;

	}
	
	public static ArrayList<Integer> prefSum(int[] arr) {
		int n = arr.length;
		ArrayList<Integer> newArray = new ArrayList<>();
		newArray.add(arr[0]);
		for (int i = 1; i < n; i++) { // i
			newArray.add(newArray.get(i - 1) + arr[i]);
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,4,8,10);
		int a[] ={2,8,9,12};
		System.out.println("prefixsum with list "+ prefixsum(list));
		System.out.println("prefixsum with array "+ Arrays.toString(prefixsum(a)));
		System.out.println("prefixsum with list but parameter as array "+ Arrays.toString(prefixsum(a)));


	}

}
