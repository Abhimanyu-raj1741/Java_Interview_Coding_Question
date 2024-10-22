package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class secondLargest {

	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(12,54,12,34,22,56);
		
		Integer integer = ls.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		
		
		
		System.out.println(integer);
		
	}
	
}
