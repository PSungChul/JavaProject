package ex01_static;

public class Ex1_static {
	//static���� ����� ������ �޼���� ��ü�� �ƹ��� ���� �����Ǿ
	//�޸𸮻� �� �Ѱ��� ����� ����.
	//static�� private�δ� ���� �ȸ����
	
	int n;
	static String str;
	
	public static void test2() {
		
		//static�޼��� ���ο����� static������ ������ �� ����
		//static int aa = 10;
		
		str = "�ȳ�";//static�޼��忡���� static������ ������ ����� �� �ִ�.
		
		int n = 10;
		//n = 100;//static�޼��忡���� �Ϲ� ������ �����ϴ� ���� �Ұ���.
		
	}
	
	public void test() {
		//�Ϲ� �޼��忡���� static������ �Ϲݺ����� �������� ����� ����
		n = 100;
		str = "�ȳ�";
		
		//static int a = 10;
	}
}
