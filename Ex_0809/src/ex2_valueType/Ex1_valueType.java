package ex2_valueType;

public class Ex1_valueType {
	
	public static void main(String[] args) {
		
		//기본자료형(valueType)
		/*
		 논리형 : boolean ....... 1bit
		 문자형 : char .......... 2byte
		 정수형 : byte .......... 1byte( -128 ~ 127 )
		       short ......... 2byte( -32768 ~ 32767 )
		       int ........... 4byte( -21억 ~ 21억 )
		       long .......... 8byte( -900경 ~ 900경 )
		 실수형 : float ......... 4.x byte
		       double ........ 8.x byte
		 */
		
		//변수 : 특정 값을 저장하기 위한 공간
		//변수 이름짓기의 규칙
		//1) 숫자로 시작할 수 없다
		//2) 소문자로 시작한다
		//3) _를 제외하고 특수문자를 사용할 수 없다
		
		//변수 선언 규칙
		//자료형 변수명;(선언)
		//변수명 = 값;(대입)
		//자료형 변수명 = 값;(초기화)
		
		//논리형
		//논리형은 true, false의 두 가지 값만을 저장
		boolean b1 = true;
		boolean b2 = false;
		b1 = false;
		
		//boolean b1; <-- 중복된 변수 이름은 지정할 수 없다
		
		System.out.println( "b1 : " + b1 );
		System.out.println( "b2 : " + b2 );
		
		System.out.println("------------------------------");
		
		//문자형 : 홑따옴표 안에 딱 한글자만 저장 가능한 자료형
		char ch = 'A';
		System.out.println("ch : " + ch);
		
		ch = 'B';
		System.out.println("ch : " + ch);
		
		//정수값이 들어오면 char타입에 맞도록 아스키코드를 통해서 한글자짜리 문자로 변환하여 대입
		ch = 65 + 1;
		System.out.println("ch : " + ch);
		
		System.out.println("------------------------------");
		
		//정수형 : 소수점이 없는 자연수를 저장하는 자료형
		//byte b = 128; <-- byte의 표현범위를 벗어나는 값은 오류
		int n = 2100000000;
		long lo = 2200000000L;
		
		System.out.println("------------------------------");
		
		//실수형 : 소수점을 포함하고 있는 값을 저장하는 자료형
		float f = 3.14f;
		double d = 3.14;
		
		f = 100;
		d = 100;
		
		System.out.println(f);
		System.out.println(d);
	}//main

}
