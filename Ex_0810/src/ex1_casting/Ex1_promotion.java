package ex1_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		
		//ĳ����(����ȯ)
		//1) ���θ�� ĳ���� - ū �ڷ����� ���� �ڷ����� ���ԵǴ� ��(�ڵ�)
		double d = 100.5;//8byte
		int n = 200;//4byte
		d = n;
		System.out.println(d);
		
		System.out.println("------------------------------");
		
		char c = 'A';//2byte
		int i = 100;//4byte
		i = c;
		System.out.println(i);
	}//main
}
