package Multithreading;

public class MainThread {

	public static void main(String[] args) {
		CreatingThread t = new CreatingThread();
		 
		 Thread t1 = new Thread(t);
		 MyThead t2 = new MyThead();
		 
		 t1.start();
		 t2.start();
		 
		
	}
}
