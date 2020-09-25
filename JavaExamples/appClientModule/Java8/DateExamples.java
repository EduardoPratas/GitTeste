package Java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DateExamples {

	public static void LocalDateTimeApi() {

		LocalDate currentDate = LocalDate.now(); 
		LocalTime currentTime = LocalTime.now();
		LocalDateTime fromDateAndTime = LocalDateTime.of(currentDate, currentTime); 
        System.out.println("LocalDateTime created by combining LocalDate" + " and LocalTime" + fromDateAndTime);

        LocalDateTime aDateTime = LocalDateTime.of(2015, Month.JULY, 29, 19, 30, 40); // Output: 2015-07-29T19:30:40
        System.out.println("LocalDateTime: "+aDateTime);
        
		// https://javarevisited.blogspot.com/2017/01/how-to-create-localdatetime-in-java-8.html
	}

	public static void timeBetweenPeriods() {
		LocalDate date1 = LocalDate.now();

		LocalDate date2 = LocalDate.of(2014, Month.DECEMBER, 12);

		Period gap = Period.between(date2, date1);
		System.out.println("gap between dates " + "is a period of " + gap);
	}

	// Function to check duration
	public static void addingTime() {

		LocalTime time1 = LocalTime.now();
		System.out.println("the current time is " + time1);

		Duration fiveHours = Duration.ofHours(5);

		// adding five hours to the current
		// time and storing it in time2
		LocalTime time2 = time1.plus(fiveHours);

		System.out.println("after adding five hours " + "of duration " + time2);

		Duration gap = Duration.between(time2, time1);
		System.out.println("duraion gap between time1" + " & time2 is " + gap);
	}
	
	 // Function to check ChronoUnit  
    public static void addingPeriods() 
    { 
        LocalDate date = LocalDate.now(); 
        System.out.println("current date is :" +  
                            date); 
      
        // adding 2 years to the current date 
        LocalDate year =  
             date.plus(2, ChronoUnit.YEARS); 
          
        System.out.println("next to next year is " +  
                            year); 
              
        // adding 1 month to the current data 
        LocalDate nextMonth =  
                  date.plus(1, ChronoUnit.MONTHS); 
          
        System.out.println("the next month is " +  
                            nextMonth); 
      
        // adding 1 week to the current date 
        LocalDate nextWeek =  
                  date.plus(1, ChronoUnit.WEEKS); 
          
        System.out.println("next week is " + nextWeek); 
      
        // adding 2 decades to the current date 
        LocalDate Decade =  
                  date.plus(2, ChronoUnit.DECADES); 
                    
        System.out.println("20 years after today " +  
                            Decade); 
    } 
    

	public static void main(String[] args) {

		// LocalDateTimeApi();
		//timeBetweenPeriods();
		//addingTime(); // adds time to local time
		
		// addingPeriods(); 

		// https://stackoverflow.com/questions/45060886/grouping-items-by-date
		// https://www.geeksforgeeks.org/new-date-time-api-java8/
		 
		///////////////////////////////////////////////////////////////////////////////
		LocalDateTime aDateTime = LocalDateTime.of(2015, Month.JULY, 29, 19, 30, 40); // Output: 2015-07-29T19:30:40

		
		  Map<String, Integer> citiesWithCodes = new HashMap<String, Integer>();
		    citiesWithCodes.put("Berlin", 49);
		    citiesWithCodes.put("Frankfurt", 49);
		    citiesWithCodes.put("Hamburg", 49);
		    citiesWithCodes.put("Cologne", 49);
		    citiesWithCodes.put("Salzburg", 43);
		    citiesWithCodes.put("Vienna", 43);
		    citiesWithCodes.put("Zurich", 41);
		    citiesWithCodes.put("Bern", 41);
		    citiesWithCodes.put("Interlaken", 41);


		    Map<Integer, List<String>> result =  citiesWithCodes.entrySet().stream().collect(Collectors.groupingBy(
		            Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
		    System.out.println(result);
		
		 
		    System.out.println(aDateTime);
		 
		 
		 

	}

}
