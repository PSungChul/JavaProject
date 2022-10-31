package ex5_work;

import java.util.Random;

public class Ex1_work {
	public static void main(String[] args) {
		
		//1 ~ 10 사이의 난수를 만들고
		//1부터 입력받은 난수까지의 합을 출력
		//--------------------
		//ex)난수 5가 발생했다면, 1 + 2 + 3 + 4 + 5의 결과값인 15가 출력되면 된다
		//난수 : 5
		//결과 : 15
		Random rnd = new Random();
		int n = rnd.nextInt(10) + 1;
		int result = 0;
		
		for( int i = 1; i <= n; i++ ) {
			result += i;
		}
		
		System.out.println("난수 : " + n);
		System.out.println("결과 : " + result);
		
		//1 ~ 10사이의 난수를 두 개 만든다
		//난수1부터 난수2사이의 값들의 합을 출력
		//ex) 난수 2와 5가 발생했다면 2 + 3 + 4 + 5의 결과값인 14가 출력되면 된다
		//단, 난수 5와 2가 발생한 경우에도 똑같이 14의 결과값이 출력되도록 하자
		//수1 : 5
		//수2 : 2
		//결과 : 14
		int su1 = rnd.nextInt( 10 ) + 1;
		int su2 = rnd.nextInt( 10 ) + 1;
		int res = 0;
		
		//두 변수의 값을 교환
		if( su1 > su2 ) {
			int su3 = su1;
			su1 = su2;
			su2 = su3;
		}
		
		for( int i = su1; i <= su2; i++ ) {
				res += i;
		}
		
		System.out.println("수1 : " + su1);
		System.out.println("수2 : " + su2);
		System.out.println("결과 : " + res);
		
	}//main
}
