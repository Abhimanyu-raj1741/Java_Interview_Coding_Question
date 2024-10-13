package Multithreading;

public class Producer extends Thread {

	DaemonThread d;
	
	Producer(DaemonThread d){
		this.d=d;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=1;
		while(true) {
			this.d.produce_item(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
		
	}
}
