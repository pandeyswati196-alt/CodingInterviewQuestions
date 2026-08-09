package Collectioncoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reversearraylist {

	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>();
		num.add(12);
		num.add(85);
		num.add(28);
		num.add(98);
		num.add(1);
		System.out.println(num);
		/*Collections.reverse(num);
		System.out.println(num);
		for(int i=num.size()-1;i>=0;i--) {
			System.out.println(num.get(i));*/
		//}
		for(int j=0;j<num.size()/2;j++) {
			int temp=num.get(j);
			num.set(j, num.get(num.size()-j-1));
			num.set(num.size()-j-1, temp);
		}
		System.out.println(num);
		
		



	}

}
