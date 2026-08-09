
public class reversearr {

	public static void main(String[] args) {
		
		int arr[]=new int[] {1,2,4,5,6};
		int n=arr.length;
		//System.out.println(n);
		for(int i=0;i<n/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;	
		}
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
			

	}

}
