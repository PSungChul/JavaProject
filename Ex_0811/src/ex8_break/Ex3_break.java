package ex8_break;

import java.util.Scanner;

public class Ex3_break {
	public static void main(String[] args) {
		
		//Ű���忡�� ���� �� ���� �Է¹޾� �� ���� �ּҰ������ ���ϱ�.
		//ex) ��1 : 2
		//    ��2 : 5
		//    �ּҰ���� : 10
		Scanner sc = new Scanner(System.in);
		System.out.print("��1 : ");
		int su1 = sc.nextInt();
		
		System.out.print("��2 : ");
		int su2 = sc.nextInt();
		
		for( int i = 1; i <= su1 * su2; i++ ) {
			
			if( i % su1 == 0 && i % su2 == 0 ) {
				System.out.println("�ּҰ���� : " + i);
				break;
			}
			
		}
		
		
	}//main
}
