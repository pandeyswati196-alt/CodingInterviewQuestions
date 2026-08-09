package stringques;

public class countnoofstring {

	public static void main(String[] args) {
		int count =0;
		int v=0;
		int c=0;
		String str="swati is bored";
		
		  for(int i=0;i<str.length();i++) { 
			  if(str.charAt(i)!=' ')
			  count++; }
		  System.out.println(count);
		  str.toLowerCase();
		  for(int j=0;j<str.length();j++) {
			  if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='u'||str.charAt(j)=='i'||str.charAt(j)=='o') {
				  v++;
	  
			  }
			  else if(str.charAt(j) >= 'a' && str.charAt(j)<='z') {
				  c++;
			  }
		  }
		  System.out.println(v);
			 System.out.println(c);
		 
	}

}
