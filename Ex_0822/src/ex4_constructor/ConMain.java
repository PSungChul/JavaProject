package ex4_constructor;

public class ConMain {
	public static void main(String[] args) {
		ConEx con = new ConEx("apple", "iphone 15");
		//�����ڴ� ����� ��ü������ ���� �� �ѹ��� ȣ��Ǹ�,
		//���Ŀ��� ����� ȣ���� �� ����
		//con.ConEx();
		con.getIphone();
		
		ConEx con1 = new ConEx();
		con1.getIphone();
		
		ConEx con2 = new ConEx("apple", "iphone 14 pro");
		con2.getIphone();
		
	}//main
}
