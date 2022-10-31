package ex02_abstract;

public class AbsChild extends AbsParent{

	//추상클래스를 상속받는 자식클래스는
	//부모의 미완성 메서드를 상속받아 완성시키는 것이 조건이 된다.
	@Override
	public void setN(int n) {
		System.out.println("n:" + n);
	}
	
}
