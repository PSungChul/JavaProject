package ex4_constructor;

public class ConEx {
	
	private String brand;
	private String name;
	
	//������ : ��ü�� ������ �� ��������� �ʱ�ȭ �� �޸��Ҵ��� ���� ȣ��Ǵ� ����
	//ConEx con = new ConEx();
	public ConEx() {
		brand = "apple";
		name = "iphone";
	}
	
	public ConEx(String brand, String name) {
		this.brand = brand;
		this.name = name;
	}
	
	public void getIphone() {
		System.out.println("�귣�� : " + brand);
		System.out.println("�̸� : " + name);
		System.out.println("----------------");
	}
	
}
