package ex04_array;

public class Ex2_array {
	public static void main(String[] args) {
		
		//�迭�� ���� �� ����
		char[] ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		//ch[4] = '!';
		
		//����, ����, �ʱ�ȭ�� �ѹ���
		char[] ch2 = {'J', 'A', 'V', 'A'};
		
		//�迭 ch2�� ���� ���� ��� ����Ͻÿ�
		for( int i = 0; i < ch2.length; i++ ) {
			System.out.println(ch2[i]);
		}
		
		System.out.println("------------------------------");
		
		//������ for��
		for( char c : ch ) {
			System.out.print(c);
		}
		
	}//main
}
