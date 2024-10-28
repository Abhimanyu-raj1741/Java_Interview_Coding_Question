package streamAPI;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingInt {

	public static void main(String[] args) {
	   
		List<Integer> ls = Arrays.asList(2,5,12,34,11,1,55);
		
		IntSummaryStatistics collect = ls.stream().collect(Collectors.summarizingInt(Integer::intValue));
		
		System.out.println(collect );
		
		
		
		
	}
	
}
