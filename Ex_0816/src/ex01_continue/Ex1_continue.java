package ex01_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
		//continue문 : 반복문 내에서 특정 문장을 강제로 건너뛰고자 할 때
		for( int i = 1; i <= 2; i++ ) {
			
			for( int j = 1; j <= 5;  ) {
				
				j++;
				
				if( j % 2 == 0 ) {
					//for문 내부의 continue는 가장 가까운 for문의
					//증감식으로 건너뛴다.
					//단, for문에 증감식이 없다면 조건식으로 건너뛴다
					continue;
					//continue바로 아래에는 어떤코드도 추가될 수 없다
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
				//while문 내부의 continue는 while의 조건식으로 건너뛴다
				continue;
			}
			
			System.out.println(n);
			
		}//while
		
	}//main
}
