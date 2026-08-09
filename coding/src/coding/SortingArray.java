package coding;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter length of array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter the elements of array");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	sortarray(arr,n);
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
	/*
	 * Arrays.sort(arr); for(int i=0;i<arr.length;i++) { System.out.println(arr[i]);
	 */
		
	}
	
	
	public static void sortarray(int arr[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			//System.out.println(arr);
		}
	}

}
