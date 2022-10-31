package ex1_first;

public class Ex1_print {
	public static void main( String[] args ) {
		//주석 : 실행시 JVM은 인식하지 못하는, 개발자들간의 메모작성을 위한 개념
		//main메서드 : 프로그램 실행시 가장먼저 호출되는 영역
		System.out.println(100);
		System.out.println(100 + 10);
		System.out.println(50 - 1);
		System.out.println("안녕하세요");
		
		//""뒤에 있는 +기호는 '더한다'가 아닌 '이어붙인다'의 의미
		System.out.println("hi" + 100);
		System.out.println("hi" + "hello");
		
		System.out.println("1 + 1 = " + (1 + 1));
		System.out.println("2 * 2 = " + 2 * 2);
		
		System.out.println(1 + 1 + "1 + 1" + 1 + 1);
		System.out.println("" + 1 + 1 + 1);
	}
}
