package coding;

import java.util.Scanner;

public class missingno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter length of array");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements in array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(missingno(arr));
		
		
		
	}
	public  static int missingno(int a[]) {
		 int n=a.length+1;
	        int sum=n*(n+1)/2;
	        System.out.println(sum);
	        int restSum=0;
	        for (int i = 0; i < a.length; i++) {
	            restSum+=a[i];
	        }
	        int missingNumber=sum-restSum;
	        return missingNumber;
		
	}

}
