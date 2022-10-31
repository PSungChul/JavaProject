package ex03_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		
		Child c = new Child();
		//자식클래스는 부모의 자원을 마음대로 가져다가 사용할 수 있다. 단, private는 제외!!
		System.out.println( c.money );
		System.out.println( c.car );
		
		if( c instanceof Parent ) {
			System.out.println("c는 Parent의 자식");
		}
		
		System.out.println("------------------------------");
		
		Parent p = new Parent();
		//부모자식 관계에서도 부모클래스는 자식의 자원을 가져다가 사용할 수 없다.
		System.out.println( p.money );
		
		if( p instanceof Object ) {
			System.out.println("오브젝트는 p의 부모다");
		}
		
	}//main
}
