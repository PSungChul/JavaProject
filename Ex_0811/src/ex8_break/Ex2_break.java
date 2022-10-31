package ex8_break;

public class Ex2_break {
	
	public static void main(String[] args) {
		
		for( int i = 0; i <= 2; i++ ) {
			
			switch( i ) {
			case 0:
				System.out.println("안녕");
				break;//switch문 내부의 break는 반복문이 아닌 현재 switch문 만을 제어
			
			case 1:
				System.out.println("반가워");
				break;
			
			case 2:
				System.out.println("끝");
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
