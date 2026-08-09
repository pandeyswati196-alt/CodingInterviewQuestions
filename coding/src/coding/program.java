package coding;

import java.util.HashMap;

public class program {
	

	public static void main(String[] args) {
		String [] str={"A", "C", "A", "D", "Z", "J", "A", "C", "E", "C","D"};
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(String s:str) {
			if(map.containsKey(s)) {
				map.put(s,map.get(s)+1);
			}
			else {
				map.put(s, 1);
			}
		}
System.out.println(map);

	}

}
