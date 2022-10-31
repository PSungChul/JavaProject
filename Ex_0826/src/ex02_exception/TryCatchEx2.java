package ex02_exception;

import java.util.Scanner;

public class TryCatchEx2 {
	public static void main(String[] args) {
		//정수 : 5
		//결과 : 5
		
		//정수 : aa
		//정수만 입력할 수 있습니다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		
		try {
			int n = sc.nextInt();
			System.out.print("결과 : " + n);
			
		}catch (Exception e) {
			System.out.println("정수만 입력할 수 있습니다");
			
		}
		
		
	}//main
}
