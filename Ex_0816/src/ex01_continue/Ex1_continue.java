package ex01_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
		//continue�� : �ݺ��� ������ Ư�� ������ ������ �ǳʶٰ��� �� ��
		for( int i = 1; i <= 2; i++ ) {
			
			for( int j = 1; j <= 5;  ) {
				
				j++;
				
				if( j % 2 == 0 ) {
					//for�� ������ continue�� ���� ����� for����
					//���������� �ǳʶڴ�.
					//��, for���� �������� ���ٸ� ���ǽ����� �ǳʶڴ�
					continue;
					//continue�ٷ� �Ʒ����� ��ڵ嵵 �߰��� �� ����
					//System.out.println("ddddd");
				}
				
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("------------------------------");
		
		int n = 0;
		while( n < 10 ) {
			n++;
			
			if( n % 2 == 0 ) {
				//while�� ������ continue�� while�� ���ǽ����� �ǳʶڴ�
				continue;
			}
			
			System.out.println(n);
			
		}//while
		
	}//main
}
