package Collectioncoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

//program to iterate over arraylist
public class program1 {

	public static void main(
			String[] args) { 
		/*
		 * List<Integer> num=new ArrayList<Integer>(); num.add(20); num.add(65);
		 * num.add(88); num.add(10); num.add(100); num.toArray();
		 * System.out.println(num);
		 * 
		 * 
		 * 
		 * //normal for loop for(int i=0;i<num.size();i++) {
		 * System.out.println(num.get(i)); } //foreach for(Integer r:num) {
		 * System.out.println(r); } //while loop int i=0; while(i<num.size()) {
		 * 
		 * System.out.println(num.get(i)); i++; } //using iterator Iterator
		 * it=num.iterator(); while(it.hasNext()) { System.out.println(it.next()); }
		 * //ListIterator ListIterator it1=num.listIterator(); while(it1.hasNext()) {
		 * System.out.println(it1.next()); } //default method num.forEach( (temp) -> {
		 * System.out.println(temp); }); //
		 */								  
								  
								 
		HashSet<String> set = new HashSet<String>();
		set.add("hi");
		set.add("hey");
		set.add("am fine");
		for (String s : set) {
			System.out.println(s);
		}
		set.forEach(System.out::println);
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.hasNext() + " ");
		}

	}

}
