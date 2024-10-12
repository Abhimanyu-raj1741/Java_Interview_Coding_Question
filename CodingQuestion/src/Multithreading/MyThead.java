package Multithreading;

// Creating By extending thread
public class MyThead extends Thread{
  
     public void run() {
    	 for(int i=0 ;i<5;i++) {
    	 System.out.println("Thread 2 is running ");
    	 try {
    		 Thread.sleep(1000);
    	 }
    	 
    	 catch(Exception e) {
    		 
    	 }
     }
}
}