package Examples;

public class isSubstring {
	
	
	public static String is_Substring(String s1, String s2) {
		
		// alex
		// alextelles
		int s1_size = s1.length();
		int s2_size = s2.length();
		int limit = s2.length() - s1.length() +1;
		int i=0;
		String sub="";
		
		while( i < limit) {
			sub = s2.substring(i, i+s1_size);
			System.out.println("sub: "+sub );
			if(s1.equals(sub)){
				
				return s1;
				
			}
			
			i++;
			
		}
   
			return "Not";
		
	}
	
	public static void main(String[] args) 
    { 
       String s1 = "vvv";
       String s2 = "aaabbbcccvvv";
        System.out.println("is_Substring: "+is_Substring(s1,s2)); 
    } 
	
	
	
	

}
