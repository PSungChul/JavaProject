package ex3_singleFor;

public class Ex1_for {
	public static void main(String[] args) {
		
		//for문 : 특정 수행문을 여러번 반복할 수 있도록 해 주는 제어문
		//for( 초기식; 조건식; 증감식 ){
		//	조건식이 참일때 실행되는 영역
		//}
		//int i = 0; //전역변수
		for( int i = 0; i < 3; i++ ) {
			//i는 for문 내부에서만 사용 가능한 지역변수
			
			System.out.println(i);
			
		}//for
		
		System.out.println("------------------------------");
		
		//10 ~ 1까지 감소되는 값을 출력하는 for문을 작성
		for( int i = 10; i >= 1; i-- ) {
			System.out.println(i);
		}//for
		
		System.out.println("------------------------------");
		
		//1부터 100까지 반복되는 for문에서 3의 배수만 출력
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
