package ex1_if;

public class Ex4_else_if {
	public static void main(String[] args) {
		
		//else-if문 : 여러개의 조건 비교가 필요한 경우
		int num = 75;
		String str = "";
		
		if( num >= 90 ) {
			str = "A";
		}else if( num >= 80 ){
			str = "B";
		}else if( num >= 70 ){
			str = "C";
		}else if( num >= 60 ){
			str = "D";
		}else {
			//위에 준비해둔 모든 조건식이 거짓일 경우
			//else영역을 반드시 거쳐서 빠져나온다
			str = "F";
		}
		
		System.out.println(str);
		
	}//main

}
