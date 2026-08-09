package stringques;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String s1="my name is swati";
		String s2="ym emna si atiws";
		s1.toLowerCase();
		s2.toLowerCase();
		char str[]=s1.toCharArray();
		char str1[]=s2.toCharArray();
		Arrays.sort(str);
		Arrays.sort(str1);
		if(Arrays.equals(str, str1)==true) {
			System.out.println("anagrams");
		}
		else {
			System.out.println("not anagram");
		}
		// TODO Auto-generated method stub

	}

}
