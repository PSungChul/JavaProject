package ex2_operator;

public class Ex4_operator {
	public static void main(String[] args) {
		
		//삼항(조건) 연산자
		//하나의 조건식을 주고, 참일경우와 거짓일 경우에 대한 결과를 다르게 돌려받을 수 있는 연산자
		int a = 10;
		int b = 15;
		boolean res = ++a >= b ? true : false;
		System.out.println(res);
		
		int n1 = 10;
		int n2 = 20;
		char res2 = ( n1 += n1 ) == n2 ? 'O' : 'X';
		System.out.println(res2);
	}//main

}
