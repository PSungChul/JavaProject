package ex04_override;

public class Snake extends Animal{

	String sensor = "밤에도 잘봄";
	
	//오버라이드
	//'메서드의 재정의'의 의미를 가지며, 상속관계의 객체에서
	//부모의 함수를 그대로 가져오되, 자식의 사정에 맞게 내용만 재정의 하는것을 의미한다.
	@Override
	public int getLeg() {
		return 0;
	}
	
}
