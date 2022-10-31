package ex03_thread;

public class ThreadTest extends Thread{
	//스레드는 독립적인 실행단위(멀티태스킹)
	
	@Override
	public void run() {
		//프로세스의 독립적인 수행을 위한 영역
		for( int i = 0; i < 10; i++ ) {
			try {
				
				Thread.sleep(1000);
				System.out.println("스레드 실행중");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}
}
