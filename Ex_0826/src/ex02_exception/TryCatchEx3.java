package ex02_exception;

import java.util.Scanner;

public class TryCatchEx3 {
	public static void main(String[] args) {
		//���� : 5
		//��� : 5
		
		//���� : aaa
		//aaa(��)�� ������ �ƴմϴ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		
		String str = "";
		
		try {
			
			str = sc.next();
			int n = Integer.parseInt(str);
			System.out.print("��� : " + str);
			
		}catch (Exception e) {
			System.out.print(str + "��(��) ������ �ƴմϴ�");
		}
		
	}//main
}
