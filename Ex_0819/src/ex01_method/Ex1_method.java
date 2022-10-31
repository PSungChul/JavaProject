package ex01_method;

public class Ex1_method {
	
	public void test1() {
		System.out.println("안녕하세요");
	}
	
	public int test2( int n ) {
		n += 50;
		System.out.println("n:"+n);
		
		//반환형이 void가 아닌경우
		//반드시 return코드가 필요
		return n;
	}
	
	public char test3(  int n ) {
		
		return (char)n;
		
	}
	
	public int sum( int n1, int n2 ) {
		return n1 + n2;
	}
	
}
