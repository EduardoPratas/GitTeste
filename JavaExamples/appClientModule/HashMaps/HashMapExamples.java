package HashMaps;

import java.util.*;
import java.util.LinkedList;

class HashMapExamples {

	////////////////// SORT HASHMAP BY VALUE ////////////////////////////
	//////////////////////////////////////////////////////////////////////
	public static HashMap<Integer, String> sortByValue(HashMap<Integer, String> hm) {
		// Create a list from elements of HashMap
		List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(hm.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// put data from sorted list to hashmap
		HashMap<Integer, String> temp = new LinkedHashMap<Integer, String>();
		for (Map.Entry<Integer, String> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		// Consider the hashmap contains
		// student name and their marks
		HashMap<Integer, String> hm = new HashMap();

		// Adding mappings to HashMap
		hm.put(54, "GeeksforGeeks");
		hm.put(82, "For geeks");
		hm.put(80, "A computer portal");
		hm.put(34, "A computer ");

		/*
		System.out.println("\nAntes ");
		hm.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		
			if (value.equals("For geeks")) {
				hm.replace(key, "Simp!!!!");
			}

		});
		hm.remove(54);
		System.out.println("\nDepois ");
		hm.forEach((k, v) -> System.out.println(k + " : " + v));
		  hm.remove(54);  // removes GeeksforGeeks

		  
		 ////////////////////////////////////////////// SORT && REVERSE TREEMP
		System.out.println("ANTES hm: "+hm);
		 
		 Map<Integer, String> treemap = new TreeMap<Integer, String>(Collections.reverseOrder());
		 
		 treemap.putAll(hm); // CONCAT MAP
		 
		 System.out.println("REVERSE hm: "+treemap);
		 /////////////////////////////////////////////////////////////////////////
		 ////////////////////////////////////////////// SORT HASHMAP BY VALUE
		 Map<Integer, String> myHash = sortByValue(hm);
		 
		 System.out.println("Sorted by value: "+myHash);
		 //////////////////////////////////////////////////////////////////////
		 
		 */

		   HashMap<Integer ,HashMap<Integer ,String>> map = new HashMap<>();
		 
		   HashMap<Integer ,String> hm1 = new HashMap<>(); 
		   hm1.put(1,"a");
		   hm1.put(2,"b");
		   hm1.put(3,"c"); 
		   map.put(1, hm1); 
		   System.out.println("hm1:   "+hm1.entrySet());
	

		   HashMap<Integer ,String> hm2 = new HashMap<>(); 
		   hm2.put(44,"A"); 
		   hm2.put(55,"B"); 
		   hm2.put(66,"C"); 
		   map.put(2, hm2); 
		   System.out.println("hm2:   "+ hm2.entrySet()); 
		   
		   System.out.println("map:   "+ map.entrySet()); 
		   
		   map.forEach((k,v)->{
			   Map<Integer ,String> im = v;
			   TreeMap<Integer ,String> tm = new TreeMap<Integer ,String>(Collections.reverseOrder());
			   tm.putAll(im);
			   
			   			im.forEach((kk,vv)->{System.out.println("Key: "+kk+" Value:"+vv);
			   			
			   			});
					
			   				tm.forEach((kk,vv)->{System.out.println("tm Key: "+kk+" tm Value:"+vv);
			   			
			   			});

		   });
		 
		
		
		
		
		 
	} // End main()
}
