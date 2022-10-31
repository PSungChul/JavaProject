package ex02_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		//String클래스의 메서드 활용하기
		
		//키보드에서 값을 입력받고, 입력받은 값이 회문(수)인지를 판단하시오
		//-------------
		//입력 : a123a
		//a123a(은)는 회문수가 아닙니다
		
		//입력 : aabaa
		//aabaa(은)는 회문수 입니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String ori = sc.next();//원본데이터
		String rev = "";//원본을 뒤집어서 저장할 변수
		
		//ori의 값을 뒤집어서 rev에 저장하는 과정
		for( int i = ori.length()-1; i >= 0; i-- ) {
			
			rev += ori.charAt(i);
			
		}
		
		if( ori.equals(rev) ) {
			System.out.println(ori + "(은)는 회문수 입니다");
		}else {
			System.out.println(ori + "(은)는 회문수가 아닙니다");
		}
		
	}//main
}
