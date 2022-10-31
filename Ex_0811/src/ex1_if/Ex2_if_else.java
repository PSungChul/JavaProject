package ex1_if;

public class Ex2_if_else {
	
	public static void main(String[] args) {
		
		//if_else문 : 하나의 조건식을 가지고 참과 거짓을 모두 커버하는 조건식
		//if( 조건식 ){
		//	조건식이 참일때 실행되는 영역
		//}else{
		//	조건식이 거짓일 때 실행되는 영역
		//}
		int n = 49;
		String str = "";
		
		if( ++n >= 50 ) {
			str = "50이상의 수";
		}else {
			//위의 조건이 거짓이라면 '반드시' 실행되는 영역
			str = "50미만의 수";
		}
		
		System.out.println(str);
		
		System.out.println("------------------------------");
		
		//변수 age에 나이를 대입하고
		//30세 이상이면 '드실만큼 드셨군요'를 그렇지 않으면 '좀 더 드셔도 됨'을
		//출력하는 if문을 만드시오
		int age = 28;
		
		if( age >= 30 ) {
			System.out.println("드실만큼 드셨군요");
		}else {
			System.out.println("더 드셔도 됨");
		}
		
		System.out.println("------------------------------");
		
		//위의 if-else문을 삼항연산자로 변경해보자
		String res = age >= 30 ? "드실만큼 드셨군요" : "더 드뎌도 됨";		
		System.out.println(res);		
	}//main
	
}
