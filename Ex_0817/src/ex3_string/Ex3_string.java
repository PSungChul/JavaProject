package ex3_string;

import java.util.Scanner;

public class Ex3_string {
	public static void main(String[] args) {
		
		//키보드에서 아무값이나 받는다
		//입력받는 값에 소문자 a의 갯수를 출력
		
		//입력 : 
		//a의 갯수 : 
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();
		
		int cnt = 0;
		
		for( int i = 0; i < str.length(); i++ ) {
			
			if( str.charAt(i) == 'a' ) {
				cnt++;
			}
			
		}//for
		
		System.out.println("a의 갯수 : " + cnt);
		
	}//main
}
