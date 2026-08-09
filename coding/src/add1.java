
public class add1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		add a=new add();
		add a1=new add();
		System.out.println(a==a1);
		System.out.println(a.equals(a1));
		String str="swati";
		String str1="swati";
		String str2=new String("swati");
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		
		System.out.println(str==str1);
		
		String str3="madam";
		 String tem="";
		for(int i=str3.length()-1;i>=0;i--) {
			tem=tem+str3.charAt(i);
		}
		if(tem==str3) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}

