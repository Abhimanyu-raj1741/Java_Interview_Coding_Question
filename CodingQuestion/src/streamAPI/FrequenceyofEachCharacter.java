package streamAPI;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequenceyofEachCharacter {
	
	public static void main(String[] args) {
		
		String str = "abhimanyu";
		
		Map<Character, Long> collect = str.chars().mapToObj(c->(char)c )
				                      .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(collect);
		
		
	}

}
