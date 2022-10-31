package ex9_scanner;

import java.util.Scanner;

public class Ex1_scanner {
	public static void main(String[] args) {
		//키보드에서 값을 읽어올 수 있도록 해 주는 클래스 Scanner
		Scanner sc = new Scanner( System.in );
		
		System.out.print("정수 : ");
		int n = sc.nextInt();
		System.out.println("받은 값 : " + n);
		
		System.out.print("또 정수 : ");
		int n2 = sc.nextInt();
		System.out.println("또 값 : " + n2);
		
		System.out.print("문장 : ");
		String s1 = sc.next();
		System.out.println(s1);
	}//main
}
