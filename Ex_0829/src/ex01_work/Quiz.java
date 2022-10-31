package ex01_work;

import java.util.Random;
import java.util.Scanner;

public class Quiz extends Thread{
	
	Scanner sc = new Scanner(System.in);
	Random rnd = new Random();
	int su1, su2;
	int timer = 0;//��������ð��� ����ϴ� ����
	int playCount = 0;//5�� �Ǹ� ������ ����
	boolean isCheck = true;//��������� �����带 ���߱� ���� ����
	
	public void startGame() {
		
		while(isCheck) {
			
			su1 = rnd.nextInt(100) + 1;
			su2 = rnd.nextInt(100) + 1;
			//������ �ΰ��� ������ ���ϴ� ������ ����
			System.out.print( su1 + " + " + su2 + " = " );
			
			//�����̶�� �����Ǵ� ���� Ű���忡�� �޾��ش�
			int result = sc.nextInt();
			
			if( su1 + su2 == result ) {
				System.out.println("����!!");
				playCount++;
			}else {
				System.out.println("����...");
			}
			
			//5������ ����ó�� �Ǿ����� Ȯ��
			if(playCount == 5) {
				System.out.println("��� : " + timer + "��");
				isCheck = false;
			}
			
		}//while
		
	}//stertGame()
	
	@Override
	public void run() {
		
		//1�� �������� ī��Ʈ�� �ϴ� ���
		while(isCheck) {
			try {
				Thread.sleep(1000);
				timer++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}//run()
	
}
