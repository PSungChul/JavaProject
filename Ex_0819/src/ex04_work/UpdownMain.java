package ex04_work;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Updown upd = new Updown();
		
		while( true ) {
			//키보드에서 정답이라고 생각되는 값을 받아서 Updown으로 전달
			System.out.print("입력 : ");
			
			//Updown클래스에서 정답인지, UP인지, Down인지를 판한한 후
			//main으로 돌아와서 결과를 알려준다
			int res = upd.check(sc.nextInt());
			
			//정답이 맞았을 경우 while문을 빠져나간다
			//정답이 아닌경우 다시 새로운 값을 입력 받는다
			if( res == 1 ) {
				break;
			}
			
		}//while
		
	}//main
}
