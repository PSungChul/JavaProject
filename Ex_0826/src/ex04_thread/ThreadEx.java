package ex04_thread;

public class ThreadEx extends Thread{
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				Thread.sleep(500);
				System.out.println("스레드 일하는 중");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}//while
		
	}
	
}
