package ex2_operator;

public class Ex1_operator {
	public static void main(String[] args) {
		
		//������(operator)
		/*
		 1.�ְ����� : . , ()
		 2.���������� : ++ , --
		 3.��������� : + , - , * , / , %
XXX		 4.����Ʈ������ : >> , <<
		 5.�񱳿����� : > , < , >= , <= , == , !=
XXX		 6.��Ʈ������ : & , | , ^
		 7.�������� : && , || , !
		 8.����(����)������ : ? , :
		 9.���Կ����� : = , *= , /= , %= , += , -=
		 */
		
		//���������
		//4Ģ����� ������ �����ڸ� ������ �ִ�
		int n1 = 20;
		int n2 = 7;
		int n3 = n1 + n2;
		System.out.println("+ : " + n3);
		
		n3 = n1 / n2;//������ ������ : ��
		System.out.println("/ : " + n3);
		
		n3 = n1 % n2;//������ ������ : ������
		System.out.println("% : " + n3);
		
		System.out.println("------------------------------");
		
		//���Կ�����
		//Ư�� ���� ������ �����Ͽ� ����ų �� ����ϴ� ������
		int i1 = 10;
		int i2 = 7;
		i1 += i2; //i1 = i1 + i2;
		System.out.println("+= : " + i1);
		
		i1 -= 3; //i1 = i1 - 3;
		System.out.println("-= : " + i1);
		
		i1 /= i2; //i1 = i1 / i2;
		System.out.println("/= : " + i1);
		
		System.out.println("------------------------------");
		
		//�񱳿�����
		//�ε�ȣ�� ����Ͽ� ���� ���� ������ �Ǵ��ϴ� ������
		int a1 = 10;
		int a2 = 20;
		boolean res = a1 < a2;
		System.out.println(res);
		
		res = a1 == a2;
		System.out.println(res);
		
		res = a1 != a2;
		System.out.println(res);
	}//main

}
