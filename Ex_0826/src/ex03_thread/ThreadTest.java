package ex03_thread;

public class ThreadTest extends Thread{
	//������� �������� �������(��Ƽ�½�ŷ)
	
	@Override
	public void run() {
		//���μ����� �������� ������ ���� ����
		for( int i = 0; i < 10; i++ ) {
			try {
				
				Thread.sleep(1000);
				System.out.println("������ ������");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}
}
