package ex04_array;

public class Ex1_array {
	public static void main(String[] args) {
		
		//�迭 : '���� �ڷ��� ���� ��Ƶ� �ϳ��� ����'�̴�.
		//ȿ������ �ڷ������ ���� �ݵ�� �ʿ��� ����
		int s1 = 100;
		int s2 = 200;
		int s3 = 300;
		int s4 = 400;
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("------------------------------");
		
		//���� ���� �ڿ����� ���� �����ϰ� ����ϱ� ���� �迭�� ���
		//1) �迭 ����
		int[] arr;
		
		//2) �迭 ����
		arr = new int[4];
		
		//3) �迭 �ʱ�ȭ
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		//arr[3] = "�ȳ�";
		arr[3] = 40;
		
		//�迭�� �������� �ʴ� �濡�� ���� �߰��� �� ����.
		//arr[4] = 50;
		
		//�迭 arr�� ���� ��� ���� ���
		//arr.length : arr�迭�� index��
		for( int i = 0; i < arr.length; i++ ) {
			System.out.println( arr[i] );	
		}
		
	}//main
}
