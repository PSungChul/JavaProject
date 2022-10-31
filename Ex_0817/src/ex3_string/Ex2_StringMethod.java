package ex3_string;

import java.util.Scanner;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		//String클래스의 메서드들
		//메서드 : 특정한 작업을 수행하기 위한 명령문들의 집합
		String str = "Hong Gil Dong";
		int index = str.length();//***
		System.out.println("str의 길이 : " + index);
		
		index = str.indexOf('o');
		System.out.println("맨 앞 소문자 o의 위치 : " + index);
		
		index = str.indexOf("Gil");
		System.out.println("문장 Gil의 시작 위치 : " + index);
		
		index = str.lastIndexOf('o');
		System.out.println("마지막 문자 o의 위치 : " + index);
		
		char s = str.charAt(6);//***
		System.out.println("6번째 위치의 문자 : " + s);
		
		//Scanner sc = new Scanner(System.in);
		//String s1 = sc.next();
		String s2 = "apple";
		//String값을 비교할땐 ==가 아닌 equals를 쓰며 ==는 주소값을 비교할때 사용한다
		//s2가 가진 '값'이 apple인지 확인 ***
		if( s2.equals("apple") ) {
			System.out.println("같습니다");
		}
		
		//대소문자 구별없이 단어만 같으면 true ***
		if( s2.equalsIgnoreCase("Apple") ) {
			System.out.println("같습니다");
		}
		
		//영단어를 모두 대문자로 변경
		System.out.println( s2.toUpperCase() );
		
		//영단어를 모두 소문자로 변경
		System.out.println( str.toLowerCase() );
		
		String id = "     jyh1234     ";
		String t_id = id.trim();//문장 앞뒤의 의미없는 공백을 제거 ***
		if( t_id.equals("jyh1234") ) {
			System.out.println("로그인 성공");
		}
		
		String[] arr = str.split(" ");//" "을 기준으로 문장을 나눈다
		for( int i = 0; i < arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		
		//스트링 클래스의 메서드는 아니지만... 자주 사용하는 메서드
		String number = "10";
		//		정수형태의 문자열을 실제 정수로 변경해주는 메서드
		//		단, 정수처럼 생겨야만 가능하며 예를들어 10a 이런건 불가능하다
		int n = Integer.parseInt(number);
		System.out.println(n + 1);
		
		//wrapper클래스의 종류
		//int - Integer
		//char - Character
		//boolean - Boolean
		//byte - Byte
		//short - Short
		//long - Long
		//float - Float
		//double - Double
	}//main
}
