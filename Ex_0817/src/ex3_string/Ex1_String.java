package ex3_string;

public class Ex1_String {
	public static void main(String[] args) {
		
		//�ڹٿ��� ���� ��ǥ���� Ŭ������ StringŬ����
		//--String Ŭ������ �� ������ Ư¡�� ������ �ִ�.
		//1) ��ü �������� �� ����(�Ͻ���, �����) - �������� �� �����ΰ� String�� ����!!
		//2) �� �� ������ ���ڿ��� ������ ������ �ʴ´�(�Ҹ��� Ư¡)
		
		//�Ͻ��� - ���� �ּҰ��� ���
		String s1 = "abc";
		String s2 = "abc";
		
		//����� - new�� �پ��ִ� ���, ������ �ּҰ��� �ٸ� �� �ּҰ��� �ο��޴´� - String�� ������ ��� Ŭ������ new�� ����Ѵ�
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		//==�� Ŭ�������� �񱳽� ���� �ƴ� �ּҰ��� ���Ѵ�
		if( s1 == s2 ) {
			System.out.println("�ּҰ� �����ϴ�");
		}else {
			System.out.println("�ּҰ� �ٸ��ϴ�");
		}
		
		System.out.println("------------------------------");
		
		String greet = "�ȳ�";
		String greet2 = "�ȳ�";
		greet += "�ϼ���";
		System.out.println(greet);
		System.out.println(greet2);
		
	}//main
}
