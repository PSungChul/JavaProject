package ex8_break;

import java.util.Scanner;

public class Ex3_break {
	public static void main(String[] args) {
		
		//키보드에서 숫자 두 개를 입력받아 두 수의 최소공배수를 구하기.
		//ex) 수1 : 2
		//    수2 : 5
		//    최소공배수 : 10
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 : ");
		int su1 = sc.nextInt();
		
		System.out.print("수2 : ");
		int su2 = sc.nextInt();
		
		for( int i = 1; i <= su1 * su2; i++ ) {
			
			if( i % su1 == 0 && i % su2 == 0 ) {
				System.out.println("최소공배수 : " + i);
				break;
			}
			
		}
		
		
	}//main
}
