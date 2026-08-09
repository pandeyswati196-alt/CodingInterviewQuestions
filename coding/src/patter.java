
public class patter {

	public static void main(String[] args) {
		int n=4;
		
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		/*
		 * for(int i=1;i<=n;i++) { for(int j=1;j<=i;j++) { System.out.print(j); }
		 * System.out.println();
		 * 
		 * }
		 * 
		 * System.out.println();
		 * 
		 * for(int i=1;i<=4;i++) { for(int j=i;j<=4;j++) { System.out.print("*"); }
		 * System.out.println(); }
		 */
		

	}

}
