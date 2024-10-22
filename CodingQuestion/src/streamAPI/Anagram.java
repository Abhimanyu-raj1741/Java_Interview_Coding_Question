package streamAPI;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		String s1 = "RaceCar";
		String s2 = "CarRace";
		
		s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		
		
		long count = s1.chars().filter(ch-> ch=='A').count();
	
		System.out.println(count);
		
		if(s1.equals(s2)) {
			System.out.println(" Yes it is anagram");
		}
		else {
			System.out.println("NO it is not anagram");
		}
	}
	
	
}
