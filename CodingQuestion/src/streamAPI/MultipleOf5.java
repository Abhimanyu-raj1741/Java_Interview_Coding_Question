package streamAPI;

import java.util.Arrays;
import java.util.List;

public class MultipleOf5 {

	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(20, 23 , 34 ,5, 10);
		
		ls.stream().filter(num->num%5==0).forEach(System.out::println);
		
	}
}
