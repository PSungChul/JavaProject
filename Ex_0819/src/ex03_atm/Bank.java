package ex03_atm;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ATM atm = new ATM();
		
		w : while( true ) {
			
			System.out.println("1.��      �� : ");
			System.out.println("2.��      �� : ");
			System.out.println("3.�ܾ�Ȯ�� : ");
			System.out.println("etc.��  �� : ");
			System.out.print(">> ");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1://�Ա�
				System.out.print("�Աݾ� : ");
				atm.deposit( sc.nextInt() );
				break;
				
			case 2://���
				System.out.println("��ݾ� : ");
				int money = atm.withdraw( sc.nextInt() );
				break;
				
			case 3://�ܾ�
				atm.balance();
				break;
				
			default:
				System.out.println("atm�� �����մϴ�");
				//return;
				break w;
			}//switch
			
		}//while
		
		
	}//main
}
