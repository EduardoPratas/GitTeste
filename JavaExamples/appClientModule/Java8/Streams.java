package Java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;


public class Streams {

	public static void GroupBy() {
		  //3 apple, 2 banana, others 1
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        System.out.println(result); // Output: // papaya=1, orange=1, banana=2, apple=3
	
	}
	
	public static void GroupBySorting() {
		  //3 apple, 2 banana, others 1
      List<String> items =
              Arrays.asList("apple", "apple", "banana",
                      "apple", "orange", "banana", "papaya");

      Map<String, Long> result =
              items.stream().collect(
                      Collectors.groupingBy(
                              Function.identity(), Collectors.counting()
                      )
              );

      Map<String, Long> finalMap = new LinkedHashMap<>();

      //Sort a map and add to finalMap
      result.entrySet().stream()
              .sorted(Map.Entry.<String, Long>comparingByValue()
                      .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

      System.out.println(finalMap); // Output: apple=3, banana=2, papaya=1, orange=1 
	
	}
	
	public static void Sum_Avg_2_HashMaps() {
	HashMap<String, Integer> map1 = new HashMap<String, Integer>();
	map1.put("str1", 7);
	map1.put("str2", 4);

	HashMap<String, Integer> map2 = new HashMap<String, Integer>();
	map2.put("str1", 3);
	map2.put("str2", 2);
	
	// map2.forEach((k, v) -> map1.merge(k, v, Integer::sum)); 
	
	map2.forEach((k, v) -> map1.merge(k, v, (t, u) -> (t + u) / 2));
	
	System.out.println(map1);
	/* Output
	("str1") = 5;
	("str2") = 3;
	*/
	
	
	/*
	 Map<Person.Sex, Double> averageAgeByGender = roster
    .stream()
    .collect(
        Collectors.groupingBy(
            Person::getGender,                      
            Collectors.averagingInt(Person::getAge)));


	 */
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// GroupBy();      // papaya=1, orange=1, banana=2, apple=3
		// GroupBySorting(); // Output: apple=3, banana=2, papaya=1, orange=1
		// https://mkyong.com/java8/java-8-collectors-groupingby-and-mapping-example/
		 
		// Group by 2 fields
		// https://www.technicalkeeda.com/java-8-tutorials/java-8-stream-grouping
		
		Sum_Avg_2_HashMaps();

	}

}
