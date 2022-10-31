package ex05_work;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {
		
		//0 ~ 9사이의 난수를 100개 만든다
		//만들어진 100개의 난수에서 0~9까지의 숫자가 각각 몇개씩 발생했는지를 출력
		//----------------
		//1098461823486392483057438720.........
		//0의 갯수 : ############ 12
		//1의 갯수 : ####### 7
		//	....
		//9의 갯수 : ########## 10
		
		int[] nArr = new int[10];
		Random rnd = new Random();
		
		for( int i = 0; i < 100; i++ ) {
			//0~9사이의 난수
			int r = rnd.nextInt(10);
			System.out.print(r);
			nArr[r]++;
		}//for
		
		System.out.println();
		
		PrintGraph pg = new PrintGraph();
		pg.print(nArr);
		
	}//main
}
