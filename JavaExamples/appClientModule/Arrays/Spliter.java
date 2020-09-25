package Arrays;

public class Spliter {
	    public static void main(String args[]) 
	    { 
	        String str = "foo/bar/&id"; 
	        String[] arrOfStr = str.split("&", 0); 

	        for (String a : arrOfStr) 
	            System.out.println(a); 
	    } 
	} 