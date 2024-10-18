package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(2 ,2,5,5,3,22,12,45);
		
		
		List<Integer> collect = ls.stream().distinct().collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
