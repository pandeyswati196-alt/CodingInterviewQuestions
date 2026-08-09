package Collectioncoding;

import java.util.ArrayList;
import java.util.List;
//converting list to array
public class comparison {
	

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(22);
		list.add(69);
		list.add(88);
		
		int arr[]=new int[list.size()];
		for(int i=0;i<list.size();i++) {
			arr[i]=list.get(i);
		}
		for(Integer j:arr) {
			System.out.println(j);
		}
		//int arr1[]=list.toArray(new int[list.size()]);
	}

}
