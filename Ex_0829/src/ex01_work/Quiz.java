package ex01_work;

import java.util.Random;
import java.util.Scanner;

public class Quiz extends Thread{
	
	Scanner sc = new Scanner(System.in);
	Random rnd = new Random();
	int su1, su2;
	int timer = 0;//게임진행시간을 계산하는 변수
	int playCount = 0;//5가 되면 게임이 종료
	boolean isCheck = true;//게임종료시 스레드를 멈추기 위한 변수
	
	public void startGame() {
		
		while(isCheck) {
			
			su1 = rnd.nextInt(100) + 1;
			su2 = rnd.nextInt(100) + 1;
			//생성된 두개의 난수를 더하는 문제를 출제
			System.out.print( su1 + " + " + su2 + " = " );
			
			//정답이라고 생각되는 값을 키보드에서 받아준다
			int result = sc.nextInt();
			
			if( su1 + su2 == result ) {
				System.out.println("정답!!");
				playCount++;
			}else {
				System.out.println("오답...");
			}
			
			//5문제가 정답처리 되었는지 확인
			if(playCount == 5) {
				System.out.println("결과 : " + timer + "초");
				isCheck = false;
			}
			
		}//while
		
	}//stertGame()
	
	@Override
	public void run() {
		
		//1초 간격으로 카운트를 하는 기능
		while(isCheck) {
			try {
				Thread.sleep(1000);
				timer++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}//run()
	
}
