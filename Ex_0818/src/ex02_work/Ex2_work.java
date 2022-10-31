package ex02_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		//String의 메서드와 2차원 배열을 사용하기
		//-------------------
		//검색할 배우 : lee
		//[lee]
		//레드
		//광해
		//백두산
		
		//검색할 배우 : jo
		//해당 배우가 존재하지 않습니다
		
		String[][] actor = {{"[song]", "박쥐", "괴물", "관상"},
							{"[lee]", "레드", "광해", "백두산"},
							{"[kim]", "도둑들", "수상한 그녀", "은밀하게 위대하게"}};
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 배우 : ");
		String name = sc.next();
		
		int cnt = 0;
		
		for( int i = 0; i < actor.length; i++ ) {
			
			if( actor[i][0].equals("["+name+"]") ) {
				for( int j = 0; j < actor[i].length; j++ ) {
					
					System.out.println(actor[i][j]);
					
				}//inner
			}else {
				
				cnt++;
				
				if( cnt == actor.length ) {
					System.out.println("해당 배우가 존재하지 않습니다");
				}
				
			}
			
		}//outer
		
	}//main
}
