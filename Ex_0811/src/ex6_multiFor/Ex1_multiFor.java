package ex6_multiFor;

public class Ex1_multiFor {
	public static void main(String[] args) {
		
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
		
		//����for�� : for�� �ȿ� for���� ���ԵǾ� �ִ� ���
		for( int i = 1; i <= 3; i++ ) {//y��
			
			for( int j = 1; j <= 5; j++ ) {//x��
				
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();//�ٹٲ�
			
		}//outer
		
		System.out.println("------------------------------");
		
		//A B C D
		//E F G H
		//I J K L
		char ch = 'A';
		for( int i = 1; i <= 3; i++ ) {
			
			for( int j = 1; j <= 4; j++ ) {
				
				System.out.print(ch++ + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("------------------------------");
		
		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		for( int i = 1; i <= 5; i++ ) {
			
			for( int j = 0; j < i; j++ ) {
				
				System.out.print("* ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
