package ex02_label;

public class Ex1_label_break {
	public static void main(String[] args) {
		//label : ���� ����� �ݺ����� �ƴ�, �ָ� ������ �ݺ����� �����ϱ�����
		//�̸�ǥ ������ �ĺ��ڸ� �ο��ϴ� ��
		out : for( int i = 1; i <= 3; i++ ) {
			
			for( int j = 1; j <= 10; j++ ) {
				
				if( j % 2 == 0 ) {
					//out�̶�� �̸��� label�� ���� �ݺ����� ��°�� ����������
					break out;
				}
				
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
