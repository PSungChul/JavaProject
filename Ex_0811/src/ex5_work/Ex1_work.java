package ex5_work;

import java.util.Random;

public class Ex1_work {
	public static void main(String[] args) {
		
		//1 ~ 10 ������ ������ �����
		//1���� �Է¹��� ���������� ���� ���
		//--------------------
		//ex)���� 5�� �߻��ߴٸ�, 1 + 2 + 3 + 4 + 5�� ������� 15�� ��µǸ� �ȴ�
		//���� : 5
		//��� : 15
		Random rnd = new Random();
		int n = rnd.nextInt(10) + 1;
		int result = 0;
		
		for( int i = 1; i <= n; i++ ) {
			result += i;
		}
		
		System.out.println("���� : " + n);
		System.out.println("��� : " + result);
		
		//1 ~ 10������ ������ �� �� �����
		//����1���� ����2������ ������ ���� ���
		//ex) ���� 2�� 5�� �߻��ߴٸ� 2 + 3 + 4 + 5�� ������� 14�� ��µǸ� �ȴ�
		//��, ���� 5�� 2�� �߻��� ��쿡�� �Ȱ��� 14�� ������� ��µǵ��� ����
		//��1 : 5
		//��2 : 2
		//��� : 14
		int su1 = rnd.nextInt( 10 ) + 1;
		int su2 = rnd.nextInt( 10 ) + 1;
		int res = 0;
		
		//�� ������ ���� ��ȯ
		if( su1 > su2 ) {
			int su3 = su1;
			su1 = su2;
			su2 = su3;
		}
		
		for( int i = su1; i <= su2; i++ ) {
				res += i;
		}
		
		System.out.println("��1 : " + su1);
		System.out.println("��2 : " + su2);
		System.out.println("��� : " + res);
		
	}//main
}
