package program;

public class pallindromeWordFromSentence {
  
	public static void main(String[] args) {
		

		String input = "My name is nitin and I can speak malayalam";
		
		String[] words=input.split(" ");
		
		for(String word:words) {
			if(isPallindrome(word))
				System.out.println(word + " is pallindrome");
		}
		
	}
	
	public static boolean isPallindrome(String input) {
		int i=0;
		int l=input.length()-1;
		
		while(i<l)
		{
			if(input.charAt(i)!=input.charAt(l))
				return false;
			
			i++;
			l--;
		}
		
		return true;
	}
}
