package ex02_static;

public class BankMain {
	public static void main(String[] args) {
		
		Bank b1 = new Bank("����", "02-111-1111");
		
		//static�� Ŭ������. �� ���� �ٷ� ȣ���� ����
		Bank.interest = 0.1f;
		
		Bank b2 = new Bank("ȫ��", "02-222-2222");
		
		Bank b3 = new Bank("����", "02-333-3333");
		
		b1.getBank();
		b2.getBank();
		b3.getBank();
	}//main
}
