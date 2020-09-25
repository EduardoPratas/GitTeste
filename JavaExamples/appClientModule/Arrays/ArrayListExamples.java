package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ArrayListExamples {

	public static void main(String[] args) {
		// initializing ArrayList
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		/////////////////////////////////////////////////// String array to ArrayList 
		String[] str = {"aa","xx","ff","yy"};
		List<String> al = Arrays.asList(str); 
        
		/////////////////////////////////////////////////// ArrayList to String array 
		String[] stringArray = al.toArray(new String[0]);
		for (String s : stringArray)
			System.out.print("stringArray: "+ s + " ");
		
		
		/////////////////////////////////////////////////// ArrayList SORT && REVERSE
		Collections.sort(al);
		Collections.reverse(al);
		
		al.forEach((k) -> {
		
				System.out.println("Geek mode ON Bitch!!!!"+k);
		});

		/* For Loop for iterating ArrayList */
		System.out.println("\nFor Loop");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i));
		}

		/* While Loop for iterating ArrayList */
		System.out.println("\n\nWhile Loop");
		int count = 0;
		while (numbers.size() > count) {
			System.out.print(numbers.get(count));
			count++;
		}

		// For Each Loop for iterating ArrayList
		System.out.println("\n\nFor Each Loop");
		for (Integer i : numbers)
			System.out.print(i + " ");

		// Looping ArrayList using Iterator
		System.out.println("\n\nUsing Iterator");
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}

		// Looping ArrayList using Iterator
		System.out.println("\n\nRemove element");
		// numbers.remove(2);

		// lambda
		System.out.println("\n\nUsing lambda");
		numbers.forEach(number -> System.out.print(number));

		///////////////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("alex", "brian", "charles", "alex"));

		System.out.println(namesList);

		namesList.removeIf(name -> name.equals("alex"));

		System.out.println(namesList);

	}

}
