package ex2_valueType;

public class Ex1_valueType {
	
	public static void main(String[] args) {
		
		//�⺻�ڷ���(valueType)
		/*
		 ���� : boolean ....... 1bit
		 ������ : char .......... 2byte
		 ������ : byte .......... 1byte( -128 ~ 127 )
		       short ......... 2byte( -32768 ~ 32767 )
		       int ........... 4byte( -21�� ~ 21�� )
		       long .......... 8byte( -900�� ~ 900�� )
		 �Ǽ��� : float ......... 4.x byte
		       double ........ 8.x byte
		 */
		
		//���� : Ư�� ���� �����ϱ� ���� ����
		//���� �̸������� ��Ģ
		//1) ���ڷ� ������ �� ����
		//2) �ҹ��ڷ� �����Ѵ�
		//3) _�� �����ϰ� Ư�����ڸ� ����� �� ����
		
		//���� ���� ��Ģ
		//�ڷ��� ������;(����)
		//������ = ��;(����)
		//�ڷ��� ������ = ��;(�ʱ�ȭ)
		
		//����
		//������ true, false�� �� ���� ������ ����
		boolean b1 = true;
		boolean b2 = false;
		b1 = false;
		
		//boolean b1; <-- �ߺ��� ���� �̸��� ������ �� ����
		
		System.out.println( "b1 : " + b1 );
		System.out.println( "b2 : " + b2 );
		
		System.out.println("------------------------------");
		
		//������ : Ȭ����ǥ �ȿ� �� �ѱ��ڸ� ���� ������ �ڷ���
		char ch = 'A';
		System.out.println("ch : " + ch);
		
		ch = 'B';
		System.out.println("ch : " + ch);
		
		//�������� ������ charŸ�Կ� �µ��� �ƽ�Ű�ڵ带 ���ؼ� �ѱ���¥�� ���ڷ� ��ȯ�Ͽ� ����
		ch = 65 + 1;
		System.out.println("ch : " + ch);
		
		System.out.println("------------------------------");
		
		//������ : �Ҽ����� ���� �ڿ����� �����ϴ� �ڷ���
		//byte b = 128; <-- byte�� ǥ�������� ����� ���� ����
		int n = 2100000000;
		long lo = 2200000000L;
		
		System.out.println("------------------------------");
		
		//�Ǽ��� : �Ҽ����� �����ϰ� �ִ� ���� �����ϴ� �ڷ���
		float f = 3.14f;
		double d = 3.14;
		
		f = 100;
		d = 100;
		
		System.out.println(f);
		System.out.println(d);
	}//main

}
