package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {

	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(34 , 2 ,3 ,42 ,45 ,34);
		
		Integer integer = ls.stream().max(Comparator.naturalOrder()).get();
		
		System.out.println(integer);
		
		Integer integer2 = ls.stream().min(Comparator.naturalOrder()).get();
		
		System.out.println(integer2);
		
	}
}
