package ex2_operator;

public class Ex2_operator {
	public static void main(String[] args) {
		
		//��������
		//�񱳿����ڸ� ���� ������ �� �� �̻� ����Ǿ�� �� ��
		int age = 22;
		int limit = 25;
		//%%(and)������ : &&������ ���� ����� false�� ��� ���� ������ �������� �ʴ´�
		//true && true : true
		//true && false : false
		//false && true : false
		//false %% false : false
		boolean res = limit - age > 3 && (age += 2) > 25;
		System.out.println("&& : " + res);
		
		int n1 = 10;
		int n2 = 20;
		//||(or)������ : ���� ������ ���ϰ�� ���� ������ �������� �ʴ´�
		//true || true : true
		//true || false : true
		//false || true : true
		//false || false : false
		res = ( n1 += 10 ) > 20 || n2 - 10 == 11;
		System.out.println("||���� : " + res);
		
		//!(not) ������ : ���� ��������,������ ������ �������ִ� ������
		//!�� ���� ��쿡�� ���� �����ǰ� ������� ���� ��쿡�� �������� ����
		System.out.println("!���� : " + !res);
		
		//boolean������ ���� ���������� �����ϰ� ������
		res = !res;

		System.out.println(res);
		
	}//main

}
