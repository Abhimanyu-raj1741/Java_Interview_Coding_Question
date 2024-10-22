package AshokITStreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		
		// get the cusotmer information from collection object 
		List<Person> customerData = PersonUtils.getCustomerData();
		
		
		// Converting the collection object into Stream Object
		Stream<Person> stream = customerData.stream();
		
		// wanted to display the customer  information by using stream of customer
		
		//stream.forEach(cust -> System.out.println(cust));
		
		// getting all the customer names from the list of customer
		// map() is an intermediate operation which is used to extract  require property from object
		
	 Stream<String> map = stream.map(cust -> cust.getName()).sorted();
		
		
	  // map.forEach(c -> System.out.println(c));
	   
	   List<String> collect = customerData.stream().map(c->c.getName() + " "+ c.getLocation()).sorted().collect(Collectors.toList());
	   
	    for(String s : collect) {
	    	System.out.println(s);
	    }
		 List<Person> collect2 = customerData.stream().sorted((p1,p2)->p2.getName().compareTo(p1.getName())).collect(Collectors.toList());
		
		System.out.println(collect2);
	}

}
