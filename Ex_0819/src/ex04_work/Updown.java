package ex04_work;

import java.util.Random;

public class Updown {
	//1 ~ 50������ ������ ������ش�
	private int random = new Random().nextInt(50) + 1;
	private int count = 0;//��ȸ���� ������ �������� �Ǵ��ϱ� ���� ����
	
	public int check( int n ) {
		count++;
		
		if( n < random ) {
			System.out.println("UP");
			return 0;
		}else if( n > random ) {
			System.out.println("DOWN");
			return 0;
		}else {
			System.out.println(count + "ȸ ���� ����!!");
			return 1;
		}
		
	}//check
}
