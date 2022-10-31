package ex1_work;

import java.util.Random;

public class Ex1_wokr {
	public static void main(String[] args) {
		
		//변수 money에 10 ~ 5000사이의 난수를 만든다
		//단 3200, 2140원과 같이 1의자리 숫자는 만드시 0이 되어야 한다
		
		//money를 500, 100원, 50원, 10원짜리 동전으로 바꿧을때
		//가장 적은수의 동전 갯수를 출력
		//----------------------------
		//난수 : 2590
		//500원 : 5
		//100원 : 0
		//50원 : 1
		//10원 : 4
		
		int[] coin = {500, 100, 50, 10};
		Random rnd = new Random();
		int money = (rnd.nextInt(500) + 1) * 10;
		
		System.out.println("난수 : " + money);
		
		for( int i = 0; i < coin.length; i++ ) {
			int res = money / coin[i];
			
			System.out.printf("%d원 : %d\n", coin[i], res );
			
			money %= coin[i];
		}
		
	}//main
}
