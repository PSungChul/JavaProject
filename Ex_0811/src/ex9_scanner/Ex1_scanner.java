package ex9_scanner;

import java.util.Scanner;

public class Ex1_scanner {
	public static void main(String[] args) {
		//Ű���忡�� ���� �о�� �� �ֵ��� �� �ִ� Ŭ���� Scanner
		Scanner sc = new Scanner( System.in );
		
		System.out.print("���� : ");
		int n = sc.nextInt();
		System.out.println("���� �� : " + n);
		
		System.out.print("�� ���� : ");
		int n2 = sc.nextInt();
		System.out.println("�� �� : " + n2);
		
		System.out.print("���� : ");
		String s1 = sc.next();
		System.out.println(s1);
	}//main
}
