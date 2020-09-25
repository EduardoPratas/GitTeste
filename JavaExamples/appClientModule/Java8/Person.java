package Java8;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Person {
	private int personId;
	private String name;
	private LocalDate birthDate;
	private Gender gender;

	public Person(int personId, String name, LocalDate birthDate, Gender gender) {
		super();
		this.personId = personId;
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
	
	}

	public boolean isMale() {
		return this.gender == Gender.MALE;
	}

	public boolean isFemale() {
		return this.gender == Gender.FEMALE;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

		StringBuilder str = null;
		str = new StringBuilder();
		str.append("Person Id:- " + getPersonId() + " Gender:- " + getGender() + " Name:- " + getName()
				+ " Birthdate:- " + dateFormat.format(getBirthDate()));
		return str.toString();
	}

	public static enum Gender {
		MALE, FEMALE
	}

	private static DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		  try {
			  
	            List <Person> persons = new ArrayList <Person> ();
	            persons.add(new Person(1, "Yashwant", LocalDate.of(1990, Month.DECEMBER, 15), Gender.MALE));
	            persons.add(new Person(2, "Mahesh",LocalDate.of(1990, Month.DECEMBER, 15), Gender.MALE));
	            persons.add(new Person(3, "Vinay",LocalDate.of(1990, Month.DECEMBER, 16), Gender.MALE));
	            persons.add(new Person(4, "Dinesh", LocalDate.of(1990, Month.DECEMBER, 17), Gender.MALE));
	            persons.add(new Person(5, "Kapil", LocalDate.of(1990, Month.DECEMBER, 18), Gender.MALE));
	            persons.add(new Person(6, "Ganesh", LocalDate.of(1990, Month.DECEMBER, 19), Gender.MALE));
	            persons.add(new Person(7, "Nita", LocalDate.of(1990, Month.DECEMBER, 5), Gender.FEMALE));
	            persons.add(new Person(8, "Pallavi",LocalDate.of(1990, Month.DECEMBER, 25), Gender.FEMALE));
	            persons.add(new Person(9, "Mayuri",LocalDate.of(1990, Month.DECEMBER, 23), Gender.FEMALE));
	            persons.add(new Person(10, "Divya",LocalDate.of(1990, Month.DECEMBER, 11), Gender.FEMALE));
	         
	            
	        	//	public Person(int personId, String name, Date birthDate, Gender gender) {
	 
	            Map <Person.Gender, Long> byGender = persons.stream()
	                .collect(Collectors.groupingBy(p -> p.getGender(), Collectors.counting()));
	 
	            Map <Object, Long> byBirthDate = persons.stream()
	                .collect(Collectors.groupingBy(p -> p.getBirthDate(), Collectors.counting()));
	 
	            Map <Gender, Map <Object, String>> byGenderAndBirthDate = persons.stream()
	                .collect(Collectors.groupingBy(p -> p.getGender(),
	                    Collectors.groupingBy(p -> p.getBirthDate(),
	                        Collectors.mapping(p -> p.getName(), Collectors.joining(", ")))));
	 
	            System.out.println("Group By Gender");
	            System.out.println(byGender);
	            System.out.println("\nGroup By BirthDate");
	            System.out.println(byBirthDate);
	            System.out.println("\nGroup By Gender & BirthDate");
	            System.out.println(byGenderAndBirthDate);
	 
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 
	    

	}

}
