package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterList {
	public static void main(String[] args) {
		
		// Q) Create a List and Filter all even numbers from List
		
		  List<Integer> list1 = List.of(2,4,5,50,21,22,67); // this is immuatable list 
		  
		  List<Integer> list2 = new ArrayList<>();
		  
		  list2.add(12);
		  list2.add(34);
		  list2.add(23);
		  list2.add(78);
		  
		  List<Integer> asList = Arrays.asList(23,567,12 ,677,24);
		  
		
		  
		   List<Integer> collect = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		  
		  System.out.println(asList);
	}

}
