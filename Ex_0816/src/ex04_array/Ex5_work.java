package ex04_array;

import java.util.Random;

public class Ex5_work {
	public static void main(String[] args) {
		//1 ~ 45사이의 난수를 발생시키고 중복되지 않도록 lotto배열에 담아서 출력
		//--------------------
		//41 2 7 35 17 27
		
		int[] lotto = new int[6];
		Random rnd = new Random();
		
		outer : for( int i = 0; i < lotto.length; ) {
			
			lotto[i] = rnd.nextInt(45) + 1;
			
			//중복값을 비교하는 반복문
			for( int j = 0; j < i; j++ ) {
				if( lotto[i] == lotto[j] ) {
					continue outer;
				}
			}//inner
			
			System.out.print( lotto[i] + " " );
			i++;
			
		}//outer
		
	}//main
}
