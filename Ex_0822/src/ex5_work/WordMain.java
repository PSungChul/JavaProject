package ex5_work;

import java.util.Scanner;

public class WordMain {
	public static void main(String[] args) {
		
		Word word = new Word();
		String answer = word.getAnswer();//����
		String question = word.getScramble();//����
		
		System.out.println("���� : " + question);
		
		Scanner sc = new Scanner(System.in);
		
		while( true ) {
			
			System.out.print(">> ");
			String str = sc.next();
			
			if( str.equalsIgnoreCase( answer ) ) {
				System.out.println(str + "����!!");
				break;
			}else {
				System.out.println(str + "����...");
			}
			
		}//while
		
	}//main
}
