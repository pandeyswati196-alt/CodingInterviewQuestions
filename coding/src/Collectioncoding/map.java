package Collectioncoding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class map {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("abc", "cde");
		map.put("fgh", "ijk");
		map.put("lmn", "opq");
		//for each
		for(Map.Entry<String, String> e:map.entrySet()) {
			System.out.println("key "+ e.getKey() +" "+"value "+ e.getValue());	
		}
		Iterator<Map.Entry<String, String>> itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String,String> t=itr.next();
			t.getKey();
			t.getValue();
		}
		map.forEach((k,v)->System.out.println(k +" "+ v));
		//for(String s:map) {
			
		//}
		
		// TODO Auto-generated method stub

	}

}
