import java.util.Arrays;
import java.util.Scanner;

public class countofelement {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length of array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter elements in array");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int ar[]=new int[arr.length];
	int visit=-1;
	for(int i=0;i<arr.length;i++) {
		int count=1;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				ar[j]=visit;
			}	
		}
		if(ar[i]!=visit)
		ar[i]=count;
	}
	for(int i=0;i<ar.length;i++) {
		if(ar[i]!=visit) {
			System.out.println("frequency of " + arr[i]+ " : " + ar[i]);
			
		}
		
	}
	
	
	}

}
