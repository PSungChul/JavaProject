package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		//switch : �񱳰��� ���ǰ��� ���ؼ� ����� ���� ���
		//switch( �񱳰� ){
		// case ���ǰ�:
		//		�񱳰��� ���ǰ��� ��ġ�ϸ� ����Ǵ� ����
		//		break;
		//}
		
		int n = 2;
		switch( n ) {//�񱳰�
		case 1://���ǰ�
			System.out.println("1.���ӽ���");
			break;//switch���� ������ ���������� Ű����
			
		case 2:
			System.out.println("2.���ӼҰ�");
			break;
			
		case 3:
			System.out.println("3.��������");
			break;
			
		default:
			//�񱳰��� ���ǰ��� �Ѱ��� ��ġ���� �ʴ°�� �ݵ�� ȣ��Ǵ� ����
			System.out.println("1, 2, 3�� �Ѱ����� �Է��ϼ���");
			break;
		}//switch
		
	}//main
}
