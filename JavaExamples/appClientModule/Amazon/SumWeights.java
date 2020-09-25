package Amazon;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import java.util.*; 



public class SumWeights {

	// function to sort hashmap by values 
	/////////////////////////////////////////////////////////////////////////////////
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 

        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
    
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
    
	
	public static void list_ordered_weights(String nums) {

		String num = "";
		int sum = 0; 
		TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
		
		
		String[] nums_array = nums.split(" ",0);
		
		for (int i = 0; i < nums_array.length; i++) {
			sum=0;
			num = nums_array[i];
			
			for (int j = 0; j < num.length(); j++) {
				
				sum+=Integer.parseInt(""+num.charAt(j));
			}
			
			tm.put(num, sum);
			sum=0;
		}
		
		
		
		//Map<String, Integer> hm1 = sortByValue(hm); 
		System.out.println("tm: "+tm);
		
		 Map<String, Integer> treemap =  
	               new TreeMap<String, Integer>(Collections.reverseOrder()); 
		 
		 treemap.putAll(tm);
		 
		 System.out.println("treemap: "+treemap);
		 
		 String str[] = {"c","a","b"};
		 Arrays.sort(str);
		 
		// Collections.reverse(Arrays.asList(str));
		 
		 for(String s: str) System.out.println("str: "+s);
		 
		
		
	//	System.out.println("mapInversed: "+mapInversed);
		
		
		
		
		
	//	TreeMap<String,Integer> tmap=new TreeMap<String,Integer>(hm);
		
		/*
		
lass GFG { 
    public static void main(String args[]) 
    { 
        // Map to store the elements 
        Map<String, String> treemap =  
               new TreeMap<String, String>(Collections.reverseOrder()); 
  
        // Put elements to the map 
        treemap.put("1", "Welcome"); 
        treemap.put("2", "to"); 
        treemap.put("3", "the"); 
        treemap.put("4", "Geeks"); 
        treemap.put("5", "Community"); 
  
        Set set = treemap.entrySet(); 
        Iterator i = set.iterator(); 
  
        // Traverse map and print elements 
        while (i.hasNext()) { 
            Map.Entry me = (Map.Entry)i.next(); 
            System.out.print(me.getKey() + ": "); 
            System.out.println(me.getValue()); 
        } 
    } 
} 


		 */
		  

	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nums = "56 65 74 100 99 68 86 180 90";

		list_ordered_weights(nums);

	}

}
