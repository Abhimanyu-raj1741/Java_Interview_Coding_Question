package CodePractice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPractice extends Thread {
	
	public void run() {
		System.out.println(" Hello");
	}
	public void display() {
		System.out.println("display method ");
	}
	public static void main(String[] args) {
		
		
		// can i re use a thread ? 
		// 1.5 
		
		// Thread Pool - Executor 
		// Single Thread Pool
		// Cached Thread Pool 
		// Scheduled YThread pool
		// Fixed Thread Pool 
		
		Employee e1 = new Employee(123,"Abhi",2300,12);
		Employee e2 = new Employee(124,"Rakesh",1300,23);
		Employee e3 = new Employee(125,"Shikha",1000,27);
		Employee e4 = new Employee(126,"Muskan",300,31);
		Employee e5 = new Employee(127,"bratin",2333,21);
		Employee e6 = new Employee(128,"ashish",2100,26);
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		
	    ExecutorService ex = Executors.newFixedThreadPool(3);
	    
	    for(int i=0;i<empList.size();i++) {
	    	
	    	SalaryCalculation s  = new SalaryCalculation(empList.get(i));
	    	ex.submit(s);
	    }
	    ex.shutdown();
		
		System.out.println(" Progrma Finished");
		
	}
}
