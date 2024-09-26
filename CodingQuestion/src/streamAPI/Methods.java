package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Methods {
	
	public static void main(String[] args) {
		
		
		// filter ( Predicate) // 
		   // boolean value function return only on that basis it filter
		   // e-> true
		 List<Integer> list2 = new ArrayList<>();
		  
		  list2.add(12);
		  list2.add(34);
		  list2.add(23);
		  list2.add(78);
		  List<Integer> collect = list2.stream().filter(e-> e-2==10).collect(Collectors.toList());
		
		  System.out.println(collect);
		
		//map(Function)
           /* each element operation 
            
            */ 
		  
		  List<String> names = List.of("Abhimanyu","Shikha","Ankit","Abhinaw","Duregsh");
		  
		  List<String> collect2 = names.stream().filter(e-> e.startsWith("A"))
		  .collect(Collectors.toList());
		  
		  System.out.println(collect2);
		  
		  List<Integer> list = List.of(23,343,43,4,5,2);
		  
		  List<Integer> collect3 = list.stream().map(i->i*i).collect(Collectors.toList());
		  
		  System.out.println(collect3);
		  
		  collect3.stream().forEach(System.out::println);
	}

}
