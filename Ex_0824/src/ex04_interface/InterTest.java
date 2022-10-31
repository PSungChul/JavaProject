package ex04_interface;

public interface InterTest {
	//인터페이스 : 서비스 요청에 따른 중개자 역할을 하는 클래스
	//인터페이스 내부에는 상수와 추상메서드 이외의 데이터를 넣을 수 없다.
	
	//상수 : 최초로 세팅된 값이 이후에 절대로 변하지 않는 변수
	//앞에 final이 붙으며, 변수명은 모두 대문자로 쓴다
	final int VALUE = 10;
	abstract public int getA();
}
