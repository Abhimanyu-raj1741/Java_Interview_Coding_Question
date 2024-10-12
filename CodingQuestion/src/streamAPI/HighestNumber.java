package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HighestNumber {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(3,5,6,8,12,3,34);
		
		
		Integer max = ls.stream().max((i,j)-> i.compareTo(j)).get();
		
		List<Integer> collect = ls.stream().filter(i->i>=8).collect(Collectors.toList());
		
		System.out.println(collect);
		System.out.println(max);
	}
   
}
