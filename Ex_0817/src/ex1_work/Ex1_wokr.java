package ex1_work;

import java.util.Random;

public class Ex1_wokr {
	public static void main(String[] args) {
		
		//���� money�� 10 ~ 5000������ ������ �����
		//�� 3200, 2140���� ���� 1���ڸ� ���ڴ� ����� 0�� �Ǿ�� �Ѵ�
		
		//money�� 500, 100��, 50��, 10��¥�� �������� �مf����
		//���� �������� ���� ������ ���
		//----------------------------
		//���� : 2590
		//500�� : 5
		//100�� : 0
		//50�� : 1
		//10�� : 4
		
		int[] coin = {500, 100, 50, 10};
		Random rnd = new Random();
		int money = (rnd.nextInt(500) + 1) * 10;
		
		System.out.println("���� : " + money);
		
		for( int i = 0; i < coin.length; i++ ) {
			int res = money / coin[i];
			
			System.out.printf("%d�� : %d\n", coin[i], res );
			
			money %= coin[i];
		}
		
	}//main
}
