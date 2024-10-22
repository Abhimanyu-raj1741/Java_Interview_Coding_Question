package streamAPI;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sumofAlldigit {

	public static void main(String[] args) {
		
		int i =32421;
		
		Integer collect = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		
		System.out.println(collect);
	}
}
