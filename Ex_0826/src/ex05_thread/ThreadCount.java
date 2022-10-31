package ex05_thread;

public class ThreadCount extends Thread{
	
	private int n;
	
	public void setN(int n) {
		this.n = n;
	}
	
	@Override
	public void run() {
		
		for( int i = n; i > 0; i-- ) {
			
			try {
				
				System.out.println(i);
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}//for
		
	}//run()
	
}
