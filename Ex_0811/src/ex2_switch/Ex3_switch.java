package ex2_switch;

public class Ex3_switch {
	public static void main(String[] args) {
		//switch���� �񱳰����δ�
		//����(long����), ����, ���ڿ� Ÿ�Ը� ����� ����
		String str = "B";
		String res = "";
		
		switch( str ) {
		case "A":
			res = "90 ~ 100";
			//break; <-- break�� ���ٸ� �񱳰��� ���ǰ��� ��ġ���� �ʴ���
			//break������ ã�Ƽ� �Ʒ��� ����ȴ�
			
		case "B":
			res = "80 ~ 89";
			//break;
			
		case "C":
			res = "70 ~ 79";
			break;
			
		case "D":
			res = "60 ~ 69";
			break;
			
		case "F":
			res = "59�� ����";
			break;
			
		default:
			System.out.println("�ùٸ� ������ �Է��ϼ���");
			break;
		}//switch
		
		System.out.println(res);
		
	}//main

}
