package program;

public class StringDriver {
    public static void main(String[] args) {
		
    	String str1 = "Abc";   // Literal Created in String pool 
    	String str2 = "Abc";
    	String str3 = new String("abc");  // it will created in  our heap meomory
    	
    	
    	System.out.println(str1==str2); //true  here we are comparing reference which are same
    	System.out.println(str1==str3); // false  here we are comparing both are differnt which are string constant
    	                                // one is heap 
    	System.out.println(str1.equals(str3)); // .equals check the content of your string and return true
    	System.out.println(str1.equalsIgnoreCase(str3));
	}
}
