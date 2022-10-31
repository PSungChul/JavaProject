package ex04_work;

import java.util.Random;

public class Updown {
	//1 ~ 50사이의 난수를 만들어준다
	private int random = new Random().nextInt(50) + 1;
	private int count = 0;//몇회만에 정답을 맞혔는지 판단하기 위한 변수
	
	public int check( int n ) {
		count++;
		
		if( n < random ) {
			System.out.println("UP");
			return 0;
		}else if( n > random ) {
			System.out.println("DOWN");
			return 0;
		}else {
			System.out.println(count + "회 만에 정답!!");
			return 1;
		}
		
	}//check
}
