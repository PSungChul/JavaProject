package ex2_operator;

public class Ex4_operator {
	public static void main(String[] args) {
		
		//����(����) ������
		//�ϳ��� ���ǽ��� �ְ�, ���ϰ��� ������ ��쿡 ���� ����� �ٸ��� �������� �� �ִ� ������
		int a = 10;
		int b = 15;
		boolean res = ++a >= b ? true : false;
		System.out.println(res);
		
		int n1 = 10;
		int n2 = 20;
		char res2 = ( n1 += n1 ) == n2 ? 'O' : 'X';
		System.out.println(res2);
	}//main

}
