package ex1_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		//Ű���忡�� Ȧ������ �Է¹ް� �׿� �ش��ϴ� ������ �����
		//�Է� : 3
		//08 01 06
		//03 05 07
		//04 09 02
		//���� : 01 22 10 20 11 02 12 00 21
		
		//�Է� : 5
		//17 24 01 08 15 00 00
		//23 05 07 14 16
		//04 06 13 20 22
		//10 12 19 21 03
		//11 18 25 02 09
		//���� : 02 43 34 20 11 21 12 
		Scanner sc = new Scanner( System.in );
		
		int[][] arr;
		int num = 1;//���ۼ�
		int size = 0;
		int y = 0;//��
		int x = 0;//��
		
		System.out.print("�� : ");
		size = sc.nextInt();
		arr = new int[size][size];
		
		x = size / 2;
		
		while( num <= size * size ) {
			
			arr[y][x] = num;
			
			if( num % size == 0 ) {
				y++;
			}else {
				y--;
				x++;
			}
			
			if( y < 0 ) { y = size - 1; }
			
			if( x == size ) { x = 0; }
			
			num++;
		}//while
		
		//2���� arr�� ��� ��� ���� ���
		for( int i = 0; i < size; i++ ) {
			
			for( int j = 0; j < size; j++ ) {
				
				System.out.printf("%02d ", arr[i][j]);
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
