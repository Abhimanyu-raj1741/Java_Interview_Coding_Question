package Multithreading;

import java.util.ArrayList;
import java.util.List;



// Creating thread using runnable 
public class CreatingThread implements Runnable {

	 @Override
	public void run() {
		// TODO Auto-generated method stub
		 for(int i=0;i<5;i++) {
		 System.out.println(" Thread 1 is running ");
		 try {
    		 Thread.sleep(1000);
    	 }
    	 
    	 catch(Exception e) {
    		 
    	 }
		 }
		
	}
	 
	 
}
