package Multithreading;

public class Consumer extends Thread {
    DaemonThread d;
	
	Consumer(DaemonThread d){
		this.d=d;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=1;
		while(true) {
			this.d.consume_item(i);
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
