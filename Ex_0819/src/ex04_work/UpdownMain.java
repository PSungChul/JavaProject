package ex04_work;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Updown upd = new Updown();
		
		while( true ) {
			//Ű���忡�� �����̶�� �����Ǵ� ���� �޾Ƽ� Updown���� ����
			System.out.print("�Է� : ");
			
			//UpdownŬ�������� ��������, UP����, Down������ ������ ��
			//main���� ���ƿͼ� ����� �˷��ش�
			int res = upd.check(sc.nextInt());
			
			//������ �¾��� ��� while���� ����������
			//������ �ƴѰ�� �ٽ� ���ο� ���� �Է� �޴´�
			if( res == 1 ) {
				break;
			}
			
		}//while
		
	}//main
}
