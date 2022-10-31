package ex5_work;

import java.util.Scanner;

public class WordMain {
	public static void main(String[] args) {
		
		Word word = new Word();
		String answer = word.getAnswer();//정답
		String question = word.getScramble();//문제
		
		System.out.println("문제 : " + question);
		
		Scanner sc = new Scanner(System.in);
		
		while( true ) {
			
			System.out.print(">> ");
			String str = sc.next();
			
			if( str.equalsIgnoreCase( answer ) ) {
				System.out.println(str + "정답!!");
				break;
			}else {
				System.out.println(str + "오답...");
			}
			
		}//while
		
	}//main
}
