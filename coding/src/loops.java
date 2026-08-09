import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		int c=0;
		while(c<2) {
			System.out.println("hello");
			c++;	
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		int n=sc.nextInt();
		int sum=0;
		int a=1;
		while( a<=n) {
			sum=sum+a;
			a++;	
		}
		System.out.println(sum);
		
		
		
		
		
		

	}

}
