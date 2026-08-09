
public class countele {

	public static void main(String[] args) {
		String str="hello my ym";
		int count;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			count=0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j])
					count++;	
			}
			System.out.println(ch[i] + " " + count);
		}
		// TODO Auto-generated method stub

	}

}