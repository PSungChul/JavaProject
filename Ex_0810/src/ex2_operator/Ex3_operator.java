package ex2_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		
		//����������
		//1�� ������Ű�ų� 1�� ���ҽ�Ű�� ������
		//���������� ���������� �������� �˾Ƶ���!!!
		int a = 10;
		System.out.println("a : " + ++a);
		
		int b = 10;
		System.out.println("b : " + b++);
		System.out.println(b);
		
		--b;
		++b;
		b++;
		b++;
		b--;
		++b;
		--b;
		b++;
		System.out.println(b--);
		
		//2�̻� ������ ���Ҹ� ���Ѵٸ� ���Կ����ڸ� ��� �Ѵ�
		a += 2;
		
		System.out.println("------------------------------");
		
		a = 10;
		b = 12;
		boolean res = ++a >= b || 2 + 7 <= b && 13 - b >= 0 && ( a += b ) - ( a % b ) > 12;
		System.out.println(res);
	}//main

}
