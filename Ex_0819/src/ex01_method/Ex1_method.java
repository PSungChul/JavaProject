package ex01_method;

public class Ex1_method {
	
	public void test1() {
		System.out.println("�ȳ��ϼ���");
	}
	
	public int test2( int n ) {
		n += 50;
		System.out.println("n:"+n);
		
		//��ȯ���� void�� �ƴѰ��
		//�ݵ�� return�ڵ尡 �ʿ�
		return n;
	}
	
	public char test3(  int n ) {
		
		return (char)n;
		
	}
	
	public int sum( int n1, int n2 ) {
		return n1 + n2;
	}
	
}
