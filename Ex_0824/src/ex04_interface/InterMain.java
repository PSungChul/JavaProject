package ex04_interface;

public class InterMain {
	public static void main(String[] args) {
		
		//�������̽��� ���������� ��üȭ �� �� ����.
		//InterTest it = new InterTest();
		
		InterChild ic = new InterChild();
		System.out.println( ic.getA() );
		
	}//main
}
