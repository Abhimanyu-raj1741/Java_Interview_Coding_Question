package streamAPI;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class FrequencyNames {
	
    public static void main(String[] args) {
		
    	List<String> list = Arrays.asList("apple","banana","apple","grapes");
    	
    	Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    	
    	System.out.println(collect);
    	
    	
		int size = list.stream().collect(Collectors.collectingAndThen(Collectors.toSet(),Set::size));
		
		System.out.println(size);
	}

}
