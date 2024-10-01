package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class HighestNumber {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(3,5,6,8,12,3,34);
		
		
		Integer max = ls.stream().max((i,j)-> i.compareTo(j)).get();
		
		System.out.println(max);
	}
   
}
