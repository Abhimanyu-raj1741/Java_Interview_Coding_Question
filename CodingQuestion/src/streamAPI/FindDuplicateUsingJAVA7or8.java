package streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
	    List<Integer> collect = list.stream().filter(num->!st.add(num)).collect(Collectors.toList());
	    
	     System.out.println(collect);
		
		
	}
}
