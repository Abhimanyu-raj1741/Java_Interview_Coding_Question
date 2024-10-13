package Lambda;

public class Main {

	public static void main(String[] args) {
		
		// Anonymous class.. for implementing Interface 
		FucntionInterface f1 = new FucntionInterface() {
			@Override	
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println(" This is first Anonymous class");
				
			}
			};
			//using our interface with the help of Lambda Expression 
			
			 FucntionInterface f =()->System.out.println(" this is first time i am using lambda ");
			 f.sayHello();
			
			 SumInter s1 =(a,b)-> a+b;
			System.out.println(s1.sum(12,14));
			
			lengthInter l1 = (str)-> str.length();
			
			System.out.println(l1.getLength("Abhimanyu Kumar"));
			 
	}
	
	


	}
