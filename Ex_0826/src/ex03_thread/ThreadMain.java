package ex03_thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		ThreadTest tt = new ThreadTest();
		tt.start();//run()�޼��尡 ���������� �����ϰ� �ϴ� �޼���
		
		try {
			Thread.sleep(11000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("����Ŭ���� ����");
		
	}//main
}
