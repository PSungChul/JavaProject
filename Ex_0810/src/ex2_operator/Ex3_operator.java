package ex2_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		
		//증감연산자
		//1씩 증가시키거나 1씩 감소시키는 연산자
		//선행증감과 후행증감의 차이점을 알아두자!!!
		int a = 10;
		System.out.println("a : " + ++a);
		
		int b = 10;
		System.out.println("b : " + b++);
		System.out.println(b);
		
		--b;
		++b;
		b++;
		b++;
		b--;
		++b;
		--b;
		b++;
		System.out.println(b--);
		
		//2이상 증가나 감소를 원한다면 대입연산자를 써야 한다
		a += 2;
		
		System.out.println("------------------------------");
		
		a = 10;
		b = 12;
		boolean res = ++a >= b || 2 + 7 <= b && 13 - b >= 0 && ( a += b ) - ( a % b ) > 12;
		System.out.println(res);
	}//main

}
