package ex04_interface;

public class InterMain {
	public static void main(String[] args) {
		
		//인터페이스는 직접적으로 객체화 할 수 없다.
		//InterTest it = new InterTest();
		
		InterChild ic = new InterChild();
		System.out.println( ic.getA() );
		
	}//main
}
