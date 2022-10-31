package ex3_string;

public class Ex1_String {
	public static void main(String[] args) {
		
		//자바에서 가장 대표적인 클래스인 String클래스
		//--String 클래스는 두 가자의 특징을 가지고 있다.
		//1) 객체 생성법이 두 가지(암시적, 명시적) - 생성법이 두 가지인건 String이 유일!!
		//2) 한 번 생성된 문자열의 내용은 변하지 않는다(불면의 특징)
		
		//암시적 - 같은 주소값을 사용
		String s1 = "abc";
		String s2 = "abc";
		
		//명시적 - new가 붙어있는 경우, 무조건 주소값이 다른 새 주소값을 부여받는다 - String을 제외한 모든 클래스는 new를 사용한다
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		//==은 클래스간의 비교시 값이 아닌 주소값을 비교한다
		if( s1 == s2 ) {
			System.out.println("주소가 같습니다");
		}else {
			System.out.println("주소가 다릅니다");
		}
		
		System.out.println("------------------------------");
		
		String greet = "안녕";
		String greet2 = "안녕";
		greet += "하세요";
		System.out.println(greet);
		System.out.println(greet2);
		
	}//main
}
