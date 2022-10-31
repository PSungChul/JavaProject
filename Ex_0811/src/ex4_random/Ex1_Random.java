package ex4_random;

import java.util.Random;

public class Ex1_Random {
	public static void main(String[] args) {
		//난수를 만들기 위해 필요한 Random클래스
		Random rnd = new Random();
		
		//1253 ~ 2517사이의 난수
		//int random = rnd.nextInt( 발생시킬 난수의 범위 ) + 시작수;
		//int random = rnd.nextInt( 끝 수 - 시작 수 + 1 ) + 시작수;
		int random = rnd.nextInt( 2517 - 1253 + 1 ) + 1253;
		System.out.println(random);
		
		//난수를 사용하여 A ~ Z사이의 값 중 하나를 랜덤으로 출력
		int r = rnd.nextInt( 90 - 65 + 1 ) + 65;
		System.out.println((char)r);
		
		int r2 = rnd.nextInt( 'Z' - 'A' + 1 ) + 'A';
		System.out.println((char)r2);
		
		char c = (char)(rnd.nextInt( 'Z' - 'A' + 1 ) + 'A');
		System.out.println(c);
	}//main
}
