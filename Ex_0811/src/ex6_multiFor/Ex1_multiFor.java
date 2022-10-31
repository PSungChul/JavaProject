package ex6_multiFor;

public class Ex1_multiFor {
	public static void main(String[] args) {
		
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
		
		//다중for문 : for문 안에 for문이 포함되어 있는 경우
		for( int i = 1; i <= 3; i++ ) {//y축
			
			for( int j = 1; j <= 5; j++ ) {//x축
				
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();//줄바꿈
			
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
