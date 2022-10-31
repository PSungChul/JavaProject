package ex02_abstract;

public class AbsMain {
	public static void main(String[] args) {
		
		//추상클래스는 실행불가능한 메서드를 가지고 있기 때문에
		//직접적으로 인스턴스를 가질 수 없다
		//AbsParent p = new AbsParent();
		
		AbsChild c = new AbsChild();
		c.setN(10);
		
	}//main
}
