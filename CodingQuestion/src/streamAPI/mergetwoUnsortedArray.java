package streamAPI;

import java.util.Arrays;
import java.util.stream.IntStream;

public class mergetwoUnsortedArray {

	public static void main(String[] args) {
		
		int[] a  = new int[]{2,3,1,0,0};
		int[] b = new int[]{12 ,10,9,5};
		
		int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
		
		// without duplicates 
		
		int[] d = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().distinct().toArray();
		
		
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		
		
		
	}
	
}
