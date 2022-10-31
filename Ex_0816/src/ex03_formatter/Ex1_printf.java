package ex03_formatter;

public class Ex1_printf {
	public static void main(String[] args) {
		
		int age = 23;
		//���� ���̴� 23�� �Դϴ�
		System.out.println( "���� ���̴� " + age + "�� �Դϴ�" );
		System.out.printf("���� ���̴� %d�� �Դϴ�\n", age);
		
		int su1 = 10;
		int su2 = 5;
		System.out.printf("%d + %d = %d\n", su1, su2, su1+su2);
		
		int year = 2022;
		int month = 8;
		int day = 16;
		//2022-8-16
		//2022.08.09
		//2022/08/16
		System.out.printf("%d.%02d.%02d\n", year, month, day);
		
		//���� ����� 32.7�� �̸�, ������ 60.3%�Դϴ�
		System.out.printf("���� ����� %.1f�� �̸�, ������ %.2f%%�Դϴ�\n", 32.7, 60.3);
		
		//���� �达�̰� �������� A�� �Դϴ�.
		System.out.printf("���� %c���̰� �������� %c�� �Դϴ�\n", '��', 'A');
		
		//���� �����Դϴ�
		System.out.printf("���� %s�Դϴ�\n", "����");
		
		//����� true�Դϴ�
		System.out.printf("����� %b�Դϴ�", true);
		
		//formatter�� ����
		//%d : ����
		//%f : �Ǽ�
		//%c : ����
		//%s : ����
		//%b : boolean
		//%% : %��ȣ ���
	}//main
}
