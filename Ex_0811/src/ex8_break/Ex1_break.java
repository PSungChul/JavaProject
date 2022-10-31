package ex8_break;

public class Ex1_break {
	public static void main(String[] args) {
		
		//break문 : 반복문 내에서 강제적으로 가장 가까운 반복문을 빠져나올때 사용
		for( int i = 1; i <= 3; i++ ) {
			
			for( int j = 1; j <= 10; j++ ) {
				
				if( j % 2 == 0 ) {
					//반복문 안에서만 사용가능하며,
					//가장 가까운 반복문을 빠져나간다
					break;
				}
				
				System.out.print(j + "\t");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
