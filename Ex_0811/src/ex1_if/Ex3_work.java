package ex1_if;

public class Ex3_work {
	public static void main(String[] args) {
		
		/*
		 �������� �ִ�.
		 ��, ���, �������� �ִµ� �Ϸ� ���귮�� ����
		 5, 7, 5����.
		 ���������� �Ϸ翡 ����Ǵ� ������ �� ������ ����ϰ�
		 �ð��� ��ü������ ��� ���갹���� ���.
		 ��, ������ ������ ���� ������ ������ int,
		 ��� ���갹���� �����ϴ� ������ floatŸ������ ���� ��.
		 --------------------------------
		 �Ϸ���귮 : 17
		 �ð������ : 0.7083333...
		 */
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int total = pear + apple + orange;
		System.out.println("�Ϸ���귮 : " + total + "��");
		
		float avg = (float)total / 24;
		//float avg = total / 24f;
		System.out.println("�ð������ : " + avg + "��");
		
	}//main

}
