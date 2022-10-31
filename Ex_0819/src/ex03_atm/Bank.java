package ex03_atm;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ATM atm = new ATM();
		
		w : while( true ) {
			
			System.out.println("1.입      금 : ");
			System.out.println("2.출      금 : ");
			System.out.println("3.잔액확인 : ");
			System.out.println("etc.종  료 : ");
			System.out.print(">> ");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1://입금
				System.out.print("입금액 : ");
				atm.deposit( sc.nextInt() );
				break;
				
			case 2://출금
				System.out.println("출금액 : ");
				int money = atm.withdraw( sc.nextInt() );
				break;
				
			case 3://잔액
				atm.balance();
				break;
				
			default:
				System.out.println("atm을 종료합니다");
				//return;
				break w;
			}//switch
			
		}//while
		
		
	}//main
}
