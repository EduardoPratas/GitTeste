package Mindera;

import java.awt.List;
import java.util.ArrayList;

public class A { 

	 void greeting() { System.out.println("Hi from A class"); }
	 
	public static void main(String[] args) {
		final  String  prefix = "Maxi";
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
       // prefix = "Ultra";
        animals.stream().forEach(animal -> System.out.println(prefix + animal));
        
      A a = new B();
      a.greeting();
       
        // 
    }
}

