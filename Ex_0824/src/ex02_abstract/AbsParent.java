package ex02_abstract;

public abstract class AbsParent {
	//추상메서드를 한개라도 가지고 있는 클래스는
	//abstract를 통해서 추상클래스임을 명시해줘야 한다
	
	int n = 100;
	String str = "hi";
	
	public int getN() {
		return n;
	}
	
	//메서드의 실행영역(body)이 없는 '미완성된 메서드' 를 추상메서드
	//단, 추상메서드는 abstract키워드를 가지고 있어야 한다.
	abstract public void setN(int n);
	
}
