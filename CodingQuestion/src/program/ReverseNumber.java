package program;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int number =1234;
		int reverse;
		
		StringBuilder sb = new StringBuilder(String.valueOf(number));
		reverse = Integer.valueOf(sb.reverse().toString());
		
		System.out.println(reverse);
		
	}

}
