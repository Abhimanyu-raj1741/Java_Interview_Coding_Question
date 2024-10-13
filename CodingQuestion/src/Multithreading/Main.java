package Multithreading;

public class Main {
	
	public static void main(String[] args) {
		
		
		DaemonThread t = new DaemonThread();
		Producer p  = new Producer(t);
		Consumer c = new Consumer(t);
		p.start();
		c.start();
	}

}

