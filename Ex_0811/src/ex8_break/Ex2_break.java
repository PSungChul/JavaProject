package ex8_break;

public class Ex2_break {
	
	public static void main(String[] args) {
		
		for( int i = 0; i <= 2; i++ ) {
			
			switch( i ) {
			case 0:
				System.out.println("�ȳ�");
				break;//switch�� ������ break�� �ݺ����� �ƴ� ���� switch�� ���� ����
			
			case 1:
				System.out.println("�ݰ���");
				break;
			
			case 2:
				System.out.println("��");
				break;
			}//switch
			
		}//for
		
		System.out.println("------------------------------");
		
		int n = 1;
		
		while( true ) {
			
			System.out.println(n);
			n++;
			
			if( n > 3 ) {
				break;
			}
			
		}//while
		
	}//main
	
}
