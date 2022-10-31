package ex2_operator;

public class Ex2_operator {
	public static void main(String[] args) {
		
		//논리연산자
		//비교연산자를 통한 연산이 두 개 이상 연결되어야 할 때
		int age = 22;
		int limit = 25;
		//%%(and)연산자 : &&연산은 앞의 결과가 false일 경우 뒤쪽 연산을 수행하지 않는다
		//true && true : true
		//true && false : false
		//false && true : false
		//false %% false : false
		boolean res = limit - age > 3 && (age += 2) > 25;
		System.out.println("&& : " + res);
		
		int n1 = 10;
		int n2 = 20;
		//||(or)연산자 : 앞의 연산이 참일경우 뒤쪽 연산을 수행하지 않는다
		//true || true : true
		//true || false : true
		//false || true : true
		//false || false : false
		res = ( n1 += 10 ) > 20 || n2 - 10 == 11;
		System.out.println("||연산 : " + res);
		
		//!(not) 연산자 : 참은 거짓으로,거짓은 참으로 변경해주는 연산자
		//!이 사용된 경우에만 값이 반전되고 사용하지 않은 경우에는 원래값을 유지
		System.out.println("!연산 : " + !res);
		
		//boolean변수의 값을 영우적으로 변경하고 싶을때
		res = !res;

		System.out.println(res);
		
	}//main

}
