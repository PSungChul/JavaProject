package ex10_work;

public class Ex1_wokr {
	public static void main(String[] args) {
		//��1) 2�� for���� ������ �Ʒ��� ����� �ϼ��Ͻÿ�
		
		//1 2 3 4 5 6 7 8 9 10
		//2 3 4 5 6 7 8 9 10 1
		//3 4 5 6 7 8 9 10 1 2
		//	  ..........
		//10 1 2 3 4 5 6 7 8 9
		for( int i = 1; i <= 10; i++ ) {
			
			for( int j = 0; j < 10; j++ ) {
				
				int num = i + j;
				
				if( num > 10 ) {
					num -= 10;
				}
				
				System.out.print(num + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("------------------------------");
		
		//��2) 2�� for���� ������ �Ʒ��� ����� �ϼ��Ͻÿ�
		
		//        *
		//      * * *
		//    * * * * *
		//  * * * * * * *
		//* * * * * * * * *
		for( int i = 0; i < 5; i++ ) {
			
			for( int j = 0; j < 5+i; j++ ) {
				
				if( i + j > 3 ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
