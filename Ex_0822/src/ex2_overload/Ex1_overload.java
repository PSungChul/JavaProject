package ex2_overload;

public class Ex1_overload {
	//�޼����� �����ε�
	//'�޼����� �ߺ�����'��� �ϸ� �ϳ��� Ŭ�������� ���� �̸��� ���� �޼��尡
	//������ ���ǵǴ� ���� ���Ѵ�
	//-----------------------
	//�����ε��� ��Ģ
	//1) �Ķ������ ������ �޶�� �Ѵ�
	//2) �Ķ������ ������ ���ٸ� Ÿ���� �޶�� �Ѵ�
	//3) ������ ������ Ÿ���� ���ٸ� ������ �޶�� �Ѵ�

	public void result() {
		System.out.println("���ڰ� ���� �޼���");
	}
	
	public void result( int n ) {
		System.out.println("������ ���ڷ� �޴� �޼���");
	}
	
	public void result( char n ) {
		System.out.println("���ڸ� ���ڷ� �޴� �޼���");
	}
	
	public void result( String s ) {
		System.out.println("������ ���ڷ� �޴� �޼���");
	}
	
	public void result( String s, int n ) {
		System.out.println("����� ������ ���ڷ� �޴� �޼���");
	}
	
	public void result( int n, String s ) {
		System.out.println("������ ������ ���ڷ� �޴� �޼���");
	}
	
}
