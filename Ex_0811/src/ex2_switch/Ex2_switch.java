package ex2_switch;

public class Ex2_switch {
	public static void main(String[] args) {
		
		char ch = '��';
		
		//�񱳰��� ���ǰ��� Ÿ���� �ݵ�� ��ġ�ؾ� �Ѵ�
		switch( ch ) {//�񱳰�
		case '��'://���ǰ�
			System.out.println("26%");
			break;
			
		case '��':
			System.out.println("14%");
			break;
			
		case '��':
			System.out.println("7%");
			break;
			
		case '��':
			System.out.println("5%");
			break;
			
		default:
			System.out.println("������ �ۿ� �ֽ��ϴ�");
			break;
		}//switch
		
	}//main
}
