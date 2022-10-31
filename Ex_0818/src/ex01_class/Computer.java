package ex01_class;

public class Computer {
	//컴퓨터의 설계도를 만드는 작업
	
	//클래스의 구성요소
	//1) 변수(속성, 멤버 등...)
	//2) 기능(메서드, 함수 등..)
	private String brand = "apple";
	public int ssd = 2;
	int ram = 512;
	float cpu = 3.0f;
	String color = "white";
	
	//메서드란 어떠한 작업을 수행하기 위한 명령문들의 집합
	public void myCom() {
		System.out.println("브랜드 : " + brand);
		System.out.println("ssd : " + ssd + "TB");
		System.out.println("ram : " + ram + "GB");
		System.out.println("cpu : " + cpu + "GHz");
		System.out.println("color : " + color);
		System.out.println("------------------------------");
	}
	
	//접근제한자	반환형	메서드명
	//public	void	myCom( 파라미터, 인자 ){ 실행영역 }
	
	//접근제한자
	//1) public : 같은 프로젝트내의 모든클래스에서 접근을 허용
	//2) private : 현재 클래스에서만 사용을 허용
	//3) protected : 상속관계의 객체들에게만 접근을 허용
	//4) default : 같은 패키지내의 클래스에게만 접근을 허용
}
