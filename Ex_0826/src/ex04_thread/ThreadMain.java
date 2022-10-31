package ex04_thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		ThreadEx te = new ThreadEx();
		te.start();
		
		for( int i = 0; i < 10; i++ ) {
			
			try {
				Thread.sleep(500);
				System.out.println(i);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}//main
}
