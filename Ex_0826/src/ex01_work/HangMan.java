package ex01_work;

import java.util.Random;
import java.util.Scanner;

public class HangMan {
	
	String[] word = {"apple", "test", "game"};
	int random = new Random().nextInt(word.length);
	
	//랜덤으로 선택된 단어를 *로 변형해서 출력
	char[] ast = new char[ word[random].length() ];
	
	int count = 0;
	//사용자가 입력한 문자가 단어에 포함되어 있는지를 판단
	boolean check = false;
	
	//게임이 끝났는지 판단하는 변수
	boolean isEnd = false;
	
	public void play() {
		
		Scanner sc = new Scanner(System.in);
		
		for( int i = 0; i < ast.length; i++ ) {
			ast[i] = '*';
		}
		
		label : while(true) {
			
			count++;
			
			System.out.print("word : ");
			for( int i = 0; i <ast.length; i++ ) {
				System.out.print(ast[i]);
			}
			System.out.print(">> ");
			
			String in = sc.next();
			
			check = false;
			isEnd = false;
			
			for( int i = 0; i< ast.length; i++ ) {
				
				if( in.charAt(0) == ast[i] ) {
					System.out.println(in + "은 이미 입력했습니다.");
					continue label;
				}
				
				if( in.charAt(0) == word[random].charAt(i) ) {
					ast[i] = in.charAt(0);
					check = true;
				}
				
				if( ast[i] == '*' ) {
					//아직 정답을 찾지 못한경우
					isEnd = true;
				}
				
			}//for
			
			if(!check) {
				System.out.println(in + "은 포함되어 있지 않습니다");
			}
			
			if(!isEnd) {
				System.out.println( word[random] + "정답" );
				System.out.println(count + "회만에 정답");
				break;
			}
			
		}//while
		
	}//play()
	
}
