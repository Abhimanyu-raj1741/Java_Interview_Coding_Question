package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DecimalReverseOrder {

	public static void main(String[] args) {
		
		List<Double> ls = Arrays.asList(12.34,12.12,45.11,53.23,2.15);
		
		ls.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}
}
