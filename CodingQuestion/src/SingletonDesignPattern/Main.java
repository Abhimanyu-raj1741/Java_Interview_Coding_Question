package SingletonDesignPattern;

import java.security.Security;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Singelton s2 = Singelton.getInstance();
		System.out.println(s2.hashCode());
		
		Singelton s3 = Singelton.getInstance();
		System.out.println(s3.hashCode());
		
	}
}
