package Multithreading;

// Daemon thread in java is a service provider thread that provides services to the user thread
// Garbage Collector
public class DaemonThread {

	int n ;
    boolean f=false;
	synchronized public void produce_item(int n) {
		if(f) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.n=n;
		System.out.println("Produced : " + this.n);
		f=true ;
		notify();
	}

	synchronized public void consume_item(int n) {
		if(!f)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		f=false ;
		this.n=n;
		System.out.println("Consumed : " + this.n);
	}
    

}
