package streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateUsingJAVA7or8 {

	public static void main(String[] args) {
		
		// Java 7 aproach
		List<Integer> list = Arrays.asList(10,20,30,30,40,50,50);
		
		Set<Integer> st= new HashSet<>();
		
//		for(int i :list)
//		{
//			if(!(st.contains(i)))
//			st.add(i);
//			else 
//				System.out.println(i);
//		}
		
		// Java 8 approach 
	    list.stream().filter(num->!st.add(num)).forEach(System.out::println);
	    
	     
		
		
	}
}
