package streamAPI;

import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		// Stream API - collection process 
		// collection  / group of object / arrays
		
		// 1 - blank 
		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(e-> {
			System.out.println(e);
		});
		
	}
}
