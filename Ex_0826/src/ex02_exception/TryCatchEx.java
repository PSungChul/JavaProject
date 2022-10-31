package ex02_exception;

public class TryCatchEx {
	public static void main(String[] args) {
		//try-catch(����ó��)
		//�ڹٿ����� ���α׷��� ����Ǵ� ���߿� ����(����)�� �߻��ϸ� �� ��������
		//���α׷��� ���������� ����ȴ�.
		//�׷��� ���δ� ���� ������ ������ ���ؼ� ���α׷����� ���� �Ĺ��۾��� ��� �����ؾ� �ϴ� ��찡 �ִ�.
		//����ó���� ���ؼ� ���α׷��� ���������� ���Ḧ �ٿ�����!!!!
		
		int n = 0;
		int result = 0;
		
		try {
			//try���� ���ο��� ������ �߻��� ���
			//catch������ ������ �ڿ� ����������
			result = 10 / n;
			System.out.println("��ȣ");
			
			int[] arr = new int[1];
			arr[0] = 1;
			arr[1] = 2;
			
		}catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("������ 0���� ������ �����ϴ�");
			
		}catch( ArrayIndexOutOfBoundsException e ) {
			System.out.println("1�� index�� �����ϴ�");
			
		}
		
		System.out.println(result);
		
		System.out.println("------------------------------");
		
		int[] arr = {1, 2, 3, 4, 5};
		
		//�̷������� �� �Ǽ��� �����ϱ� ���� �뵵�� ��� ����
		try {
			
			for( int i = 0; i <= arr.length; i++ ) {
				System.out.println( arr[i] );
			}
		
		}catch (Exception e) {
			
		}
		
	}//main
}
