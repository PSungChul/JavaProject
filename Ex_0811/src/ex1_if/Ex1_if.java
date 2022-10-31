package ex1_if;

public class Ex1_if {
	public static void main(String[] args) {
		//제어문 : 프로그램의 흐름을 제어하는 문장
		//분기문과 반복문으로 나뉜다
		
		//분기문 : if, switch
		//반복문 : for, while
		
		//if문 : 하나의 조건을 제시하여 조건이 참일때 코드를 수행하는 문법
		//if( 조건식 ){
		//	조건식이 참일때 실행되는 영역
		//}
		
		int n = 51;
		String str = "";
		
		if( n == 50 ) {
			str = "50입니다";
		}
		
		if( n != 50 ) {
			str = "50이 아님";
		}
		
		System.out.println(str);
		
	}//main
}
