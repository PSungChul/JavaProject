package ex03_thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		ThreadTest tt = new ThreadTest();
		tt.start();//run()메서드가 독립적으로 실행하게 하는 메서드
		
		try {
			Thread.sleep(11000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인클래스 종료");
		
	}//main
}
