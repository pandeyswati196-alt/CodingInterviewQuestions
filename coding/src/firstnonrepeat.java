
public class firstnonrepeat {

	public static void main(String[] args) {
		int arr[]=new int[] {2,10,12,2,10,1,5,8};
		for(int i=0;i<arr.length;i++) {
			int j;
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
			
			  if(j!=arr.length) { System.out.println(arr[i]); break; }
			 
		}
		
			
		
	

	}

}
