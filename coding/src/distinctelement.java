import java.util.Arrays;

public class distinctelement {

	public static void main(String[] args) {
		int arr[]=new int []{1,2,8,6,2,8,4,5,7,6,8,9};
		int j=0;
		int arr1[]=new int[arr.length];
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr1[j++]=arr[i];	
			}
		}
		arr1[j++]=arr[arr.length-1];
		for(int k=0;k<j;k++)
			System.out.println(arr1[k]);
		
	}

}
