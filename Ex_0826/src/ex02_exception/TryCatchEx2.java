package ex02_exception;

import java.util.Scanner;

public class TryCatchEx2 {
	public static void main(String[] args) {
		//���� : 5
		//��� : 5
		
		//���� : aa
		//������ �Է��� �� �ֽ��ϴ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		
		try {
			int n = sc.nextInt();
			System.out.print("��� : " + n);
			
		}catch (Exception e) {
			System.out.println("������ �Է��� �� �ֽ��ϴ�");
			
		}
		
		
	}//main
}
