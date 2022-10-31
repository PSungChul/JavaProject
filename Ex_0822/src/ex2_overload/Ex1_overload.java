package ex2_overload;

public class Ex1_overload {
	//메서드의 오버로딩
	//'메서드의 중복정의'라고 하며 하나의 클래스에서 같은 이름을 가진 메서드가
	//여러개 정의되는 것을 말한다
	//-----------------------
	//오버로딩의 규칙
	//1) 파라미터의 갯수가 달라야 한다
	//2) 파라미터의 갯수가 같다면 타입이 달라야 한다
	//3) 인자의 갯수와 타입이 같다면 순서가 달라야 한다

	public void result() {
		System.out.println("인자가 없는 메서드");
	}
	
	public void result( int n ) {
		System.out.println("정수를 인자로 받는 메서드");
	}
	
	public void result( char n ) {
		System.out.println("문자를 인자로 받는 메서드");
	}
	
	public void result( String s ) {
		System.out.println("문장을 인자로 받는 메서드");
	}
	
	public void result( String s, int n ) {
		System.out.println("문장과 정수를 인자로 받는 메서드");
	}
	
	public void result( int n, String s ) {
		System.out.println("정수와 문장을 인자로 받는 메서드");
	}
	
}
