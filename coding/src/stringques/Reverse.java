package stringques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Reverse {

	public static void main(String[] args) {
		String s1 = "swati";
		char ch[] = s1.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			char s2 = ch[i];
			System.out.print(s2);
		}

		String s3 = "arya";
		String s4 = "";
		for (int j = s3.length() - 1; j >= 0; j--) {
			s4 = s4 + s3.charAt(j);
		}
		System.out.println(s4);

		StringBuffer sbf = new StringBuffer(s3);
		sbf.reverse();
		System.out.println(sbf);
		
		
		String s = "Geeks";

		// Copying elements to Character Array
		char[] arr = s.toCharArray();

		// Creating new ArrayList
		List<Character> l = new ArrayList<>();

		// Adding char elements to ArrayList
		for (char c : arr)
			l.add(c);

		// Reversing the ArrayList
		Collections.reverse(l);

		// Using ListIterator
		ListIterator it = l.listIterator();

		while (it.hasNext())
			System.out.print(it.next());

	}

}

