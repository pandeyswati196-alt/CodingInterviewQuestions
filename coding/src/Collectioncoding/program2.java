package Collectioncoding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class program2 {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("1", "swati");
		map.put("2", "wati");
		map.put("3", "sti");
		map.put("4", "swti");
		map.put("5", "swai");
		map.put("6", "swat");
		Iterator<Map.Entry<String, String>> it=map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String,String> entry= it.next();
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+" "+value);
		}
		map.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));
		for(Entry<String,String> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		// TODO Auto-generated method stub

	}

}
