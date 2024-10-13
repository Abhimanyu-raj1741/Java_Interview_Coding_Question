package Multithreading;

public class ThreadOp {
  
	public static void main(String[] args) {
		
		System.out.println("Program started...");
		
		int x=56+34;
		System.out.println("sum is "+x);
		// Thread
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());
		System.out.println(currentThread.getId());
		currentThread.setPriority(10);
		System.out.println(currentThread.getPriority());
		
		
		
		System.out.println("program ended..");
		
		
	
		
		
	}
}
