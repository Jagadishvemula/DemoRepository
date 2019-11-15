package Maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,Integer> tm= new TreeMap<String,Integer>();
		tm.put("abc", 100);
		tm.put("ab", 200);
		tm.put("pqr", 3000);
		tm.put("q", 400);
		System.out.println("elements"+tm);
		Set<Map.Entry<String,Integer>> entrs = tm.entrySet();
		for(Entry<String, Integer> e:entrs){
			System.out.println(e.getKey()+"\t"+e.getValue());
			
		}
	}

}
