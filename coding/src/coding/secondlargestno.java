package coding;

import java.util.Scanner;

public class secondlargestno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sortarray(arr,n);
		System.out.println(arr[n-2]);
		
			
		
		
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
			
		}
	}

}
