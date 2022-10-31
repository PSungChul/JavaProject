package ex02_label;

public class Ex1_label_break {
	public static void main(String[] args) {
		//label : 가장 가까운 반복문이 아닌, 멀리 떨어진 반복문을 제어하기위해
		//이름표 형식의 식별자를 부여하는 것
		out : for( int i = 1; i <= 3; i++ ) {
			
			for( int j = 1; j <= 10; j++ ) {
				
				if( j % 2 == 0 ) {
					//out이라는 이름의 label을 가진 반복문을 통째로 빠져나간다
					break out;
				}
				
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
