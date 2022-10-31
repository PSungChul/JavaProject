package ex02_static;

public class BankMain {
	public static void main(String[] args) {
		
		Bank b1 = new Bank("신촌", "02-111-1111");
		
		//static은 클래스명. 을 통해 바로 호출이 가능
		Bank.interest = 0.1f;
		
		Bank b2 = new Bank("홍대", "02-222-2222");
		
		Bank b3 = new Bank("서강", "02-333-3333");
		
		b1.getBank();
		b2.getBank();
		b3.getBank();
	}//main
}
