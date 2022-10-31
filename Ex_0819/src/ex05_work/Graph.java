package ex05_work;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {
		
		//0 ~ 9������ ������ 100�� �����
		//������� 100���� �������� 0~9������ ���ڰ� ���� ��� �߻��ߴ����� ���
		//----------------
		//1098461823486392483057438720.........
		//0�� ���� : ############ 12
		//1�� ���� : ####### 7
		//	....
		//9�� ���� : ########## 10
		
		int[] nArr = new int[10];
		Random rnd = new Random();
		
		for( int i = 0; i < 100; i++ ) {
			//0~9������ ����
			int r = rnd.nextInt(10);
			System.out.print(r);
			nArr[r]++;
		}//for
		
		System.out.println();
		
		PrintGraph pg = new PrintGraph();
		pg.print(nArr);
		
	}//main
}
