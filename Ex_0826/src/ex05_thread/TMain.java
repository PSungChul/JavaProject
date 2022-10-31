package ex05_thread;

import java.util.Scanner;

public class TMain {
	public static void main(String[] args) {
		//스캐너에서 정수를 받고
		//입력받은 숫자를 스레드 클래스로 넘기면
		//1초 간격으로 감소되는 값을 출력하다가
		//0이 되었을 때 종료하시오.
		//-------------------------
		//값 : 5
		//5
		//4
		//3
		//2
		//1
		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		
		int n = sc.nextInt();
		
		ThreadCount tc = new ThreadCount();
		tc.setN(n);
		tc.start();
		
	}//main
}
