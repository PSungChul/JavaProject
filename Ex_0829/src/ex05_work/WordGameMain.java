package ex05_work;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGameMain {
	public static void main(String[] args) {
		//ArrayList를 만들어서 3초 간격으로 data배열에 준비된 단어들 중 하나를 랜덤으로 추가
		//추가된 단어를 화면에 띄워주고
		//사용자가 일치하는 값을 입력했을때 단어를 지워나가는 형태로
		//모든 단어가 삭제되면 프로그램이 종료되도록 하시오.
		
		//-------------------------------
		
		//[grape]
		//>> grape
		//[apple, banana]
		//>> banana
		//[apple]
		//>> apple
		//[orange]
		//>> orange
		//[banana, banana, grape]
		//>> banana
		//[banana, grape]
		//>> grape
		//[banana]
		//>> banana
		//클리어!!
		ArrayList<String> arr = new ArrayList<String>();
		
		WordGame wg = new WordGame(arr);
		wg.start();//스레드에서 3초 간격으로 단어를 추가
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//게임종료 판단
			if(arr.size() == 0) {
				System.out.println("클리어");
				wg.setPlaying(false);//스레드를 정지하는 코드
				break;
			}
			
			System.out.println( arr );
			System.out.print(">> ");
			
			String in = sc.next();
			
			//사용자가 입력한 단어와 list담겨진 단어가 일치하는 경우
			for( int i = 0; i < arr.size(); i++ ) {
				if( in.equalsIgnoreCase( arr.get(i) ) ) {
					arr.remove(i);
					break;
				}
			}
			
		}//while
		
	}//main
}
