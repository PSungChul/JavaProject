package ex01_class;

public class Computer {
	//��ǻ���� ���赵�� ����� �۾�
	
	//Ŭ������ �������
	//1) ����(�Ӽ�, ��� ��...)
	//2) ���(�޼���, �Լ� ��..)
	private String brand = "apple";
	public int ssd = 2;
	int ram = 512;
	float cpu = 3.0f;
	String color = "white";
	
	//�޼���� ��� �۾��� �����ϱ� ���� ��ɹ����� ����
	public void myCom() {
		System.out.println("�귣�� : " + brand);
		System.out.println("ssd : " + ssd + "TB");
		System.out.println("ram : " + ram + "GB");
		System.out.println("cpu : " + cpu + "GHz");
		System.out.println("color : " + color);
		System.out.println("------------------------------");
	}
	
	//����������	��ȯ��	�޼����
	//public	void	myCom( �Ķ����, ���� ){ ���࿵�� }
	
	//����������
	//1) public : ���� ������Ʈ���� ���Ŭ�������� ������ ���
	//2) private : ���� Ŭ���������� ����� ���
	//3) protected : ��Ӱ����� ��ü�鿡�Ը� ������ ���
	//4) default : ���� ��Ű������ Ŭ�������Ը� ������ ���
}
