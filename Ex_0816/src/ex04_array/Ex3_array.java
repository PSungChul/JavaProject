package ex04_array;

public class Ex3_array {
	public static void main(String[] args) {
		//�迭 arr�� ��� ��� ���� �հ� ���(�Ҽ��� ���ڸ�����)�� ���
		//��� : 108
		//��� : 21.6
		
		int[] arr = {1, 5, 10, 42, 50};
		int result = 0;
		float avg = 0;
		
		//for( int i = 0; i < arr.length; i++ ) {
			//result += arr[i];
		//}
		
		for( int i : arr ) {
			result += i;
		}
		
		System.out.println("���� : " + result);
		avg = (float)result / arr.length;
		System.out.printf("��� : %.1f", avg);
	}//main
}
