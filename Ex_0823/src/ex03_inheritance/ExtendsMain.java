package ex03_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		
		Child c = new Child();
		//�ڽ�Ŭ������ �θ��� �ڿ��� ������� �����ٰ� ����� �� �ִ�. ��, private�� ����!!
		System.out.println( c.money );
		System.out.println( c.car );
		
		if( c instanceof Parent ) {
			System.out.println("c�� Parent�� �ڽ�");
		}
		
		System.out.println("------------------------------");
		
		Parent p = new Parent();
		//�θ��ڽ� ���迡���� �θ�Ŭ������ �ڽ��� �ڿ��� �����ٰ� ����� �� ����.
		System.out.println( p.money );
		
		if( p instanceof Object ) {
			System.out.println("������Ʈ�� p�� �θ��");
		}
		
	}//main
}
