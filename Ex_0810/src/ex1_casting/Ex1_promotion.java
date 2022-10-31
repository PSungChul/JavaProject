package ex1_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		
		//캐스팅(형변환)
		//1) 프로모션 캐스팅 - 큰 자료형에 작은 자료형이 대입되는 것(자동)
		double d = 100.5;//8byte
		int n = 200;//4byte
		d = n;
		System.out.println(d);
		
		System.out.println("------------------------------");
		
		char c = 'A';//2byte
		int i = 100;//4byte
		i = c;
		System.out.println(i);
	}//main
}
