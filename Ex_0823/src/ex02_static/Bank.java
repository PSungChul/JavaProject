package ex02_static;

public class Bank {

	private String point;//������ġ
	private String tel;//��ȭ��ȣ
	public static float interest = 10f;//������
	
	public Bank( String point, String tel ) {
		this.point = point;
		this.tel = tel;
	}
	
	public void getBank() {
		System.out.println("���� : " + point);
		System.out.println("��ȭ : " + tel);
		System.out.println("������ : " + interest + "%");
		System.out.println("------------------------------");
	}
	
}
