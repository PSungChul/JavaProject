package ex1_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		
		//2)디모션 : 작은 자료형에 큰 자료형을 대입하는 것
		char c = 'A';
		int n = c;
		c = (char)n;
		System.out.println(c);
		
		float f = 5.5f;
		int i = 10;
		i = (int)f;
		System.out.println(i);
	}//main
}
