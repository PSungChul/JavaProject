package ex8_break;

public class Ex1_break {
	public static void main(String[] args) {
		
		//break�� : �ݺ��� ������ ���������� ���� ����� �ݺ����� �������ö� ���
		for( int i = 1; i <= 3; i++ ) {
			
			for( int j = 1; j <= 10; j++ ) {
				
				if( j % 2 == 0 ) {
					//�ݺ��� �ȿ����� ��밡���ϸ�,
					//���� ����� �ݺ����� ����������
					break;
				}
				
				System.out.print(j + "\t");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
