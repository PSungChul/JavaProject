package ex3_overload;

public class BreadMain {
	public static void main(String[] args) {
		
		Bread bread = new Bread();
		
		//1�� makeBread()ȣ���...
		//���� ��������ϴ�
		bread.makeBread();
		
		System.out.println("------------------------------");
		
		//2�� makeBread()ȣ���...
		//���� ��������ϴ�
		//���� ��������ϴ�
		//��û�Ͻ� 2���� ���� �ϼ���
		bread.makeBread(2);
		
		System.out.println("------------------------------");
		
		//3�� makeBread()ȣ���...
		//ũ������ ��������ϴ�
		//ũ������ ��������ϴ�
		//ũ������ 2�� �ϼ���
		bread.makeBread("ũ����", 2);
		
	}//main
}
