package ex1_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		
		//2)���� : ���� �ڷ����� ū �ڷ����� �����ϴ� ��
		char c = 'A';
		int n = c;
		c = (char)n;
		System.out.println(c);
		
		float f = 5.5f;
		int i = 10;
		i = (int)f;
		System.out.println(i);
	}//main
}
