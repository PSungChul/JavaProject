package ex3_string;

import java.util.Scanner;

public class Ex3_string {
	public static void main(String[] args) {
		
		//Ű���忡�� �ƹ����̳� �޴´�
		//�Է¹޴� ���� �ҹ��� a�� ������ ���
		
		//�Է� : 
		//a�� ���� : 
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String str = sc.next();
		
		int cnt = 0;
		
		for( int i = 0; i < str.length(); i++ ) {
			
			if( str.charAt(i) == 'a' ) {
				cnt++;
			}
			
		}//for
		
		System.out.println("a�� ���� : " + cnt);
		
	}//main
}
