package ex01_class;

public class ComMain {
	public static void main(String[] args) {
		
		Computer s1 = new Computer();
		s1.myCom();
		
		Computer s2 = new Computer();
		s2.ssd = 4;
		//private���� ������� brand������ �ٸ� Ŭ�������� ������ �Ұ�
		//s2.brand = "�Ｚ";
		s2.myCom();
		
		Computer s3 = new Computer();
		s3.myCom();
	}//main
}
