package Collectioncoding;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
//basically to remove duplicate you should keep the element in set and then clear the list and then copy back to the list
public class Duplicatesfromarraylist {

	public static void main(String[] args) {
		List<String> duplicate=new ArrayList<String>();
		duplicate.add("hi");
		duplicate.add("huh");
		duplicate.add("hey");
		duplicate.add("hiee");
		duplicate.add("hi");
		
		/*
		 * LinkedHashSet<String> copy=new LinkedHashSet<String>(duplicate);
		 * copy.addAll(duplicate); duplicate.clear(); duplicate.addAll(copy);
		 * System.out.println(copy); System.out.println(duplicate);
		 */
		
		List<String> newlist=new ArrayList<String>();
		for(String s:duplicate) {
			if(!newlist.contains(s)) {
				newlist.add(s);
			}
		}
		System.out.println(newlist);
		for(int i=0;i<duplicate.size();i++) {
			if(!newlist.contains(duplicate.get(i))) {
				newlist.add(duplicate.get(i));
			}
			
		}
		System.out.println(newlist);
		duplicate.stream().distinct().collect(Collectors.toList()).forEach(x->System.out.println(x));
		

	}

}
