package ex03_atm;

public class ATM {

	private int money;
	
	//�Ա�
	public void deposit(int money) {
		this.money += money;
		System.out.println("�ԱݿϷ�");
	}
	
	//���
	public int withdraw( int money ) {
		
		if( this.money - money < 0 ) {
			System.out.println("�ܾ׺���");
			return 0;
		}else {
			this.money -= money;
			System.out.println("��ݼ���");
			return money;
		}
		
	}
	
	//�ܾ�Ȯ��
	public void balance() {
		System.out.println("�ܾ� : " + money);
	}
	
}
