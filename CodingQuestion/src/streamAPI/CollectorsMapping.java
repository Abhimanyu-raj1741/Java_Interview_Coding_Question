package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsMapping {

	public static void main(String[] args) {
		
		List<String> ls = Arrays.asList("apple","banana","cherry","Abhimanyu Kumar");
		
		 List<Integer> collect = ls.stream().collect(Collectors.mapping(String::length, Collectors.toList()));
		
		System.out.println(collect);
	}
}
