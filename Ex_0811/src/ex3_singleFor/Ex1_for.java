package ex3_singleFor;

public class Ex1_for {
	public static void main(String[] args) {
		
		//for�� : Ư�� ���๮�� ������ �ݺ��� �� �ֵ��� �� �ִ� ���
		//for( �ʱ��; ���ǽ�; ������ ){
		//	���ǽ��� ���϶� ����Ǵ� ����
		//}
		//int i = 0; //��������
		for( int i = 0; i < 3; i++ ) {
			//i�� for�� ���ο����� ��� ������ ��������
			
			System.out.println(i);
			
		}//for
		
		System.out.println("------------------------------");
		
		//10 ~ 1���� ���ҵǴ� ���� ����ϴ� for���� �ۼ�
		for( int i = 10; i >= 1; i-- ) {
			System.out.println(i);
		}//for
		
		System.out.println("------------------------------");
		
		//1���� 100���� �ݺ��Ǵ� for������ 3�� ����� ���
		/*for( int i = 1; i < 100; i++ ) {
			i += 2; 
			System.out.println(i);
		}*/
		
		for( int i = 1; i <=100; i++ ) {
			
			if( i % 3 == 0 ) {
				System.out.println(i);
			}
			
		}
		
	}//main
}
