package ex01_method;

public class Ex1_methodMain {
	public static void main(String[] args) {
		
		Ex1_method m1 = new Ex1_method();
		m1.test1();
		m1.test2(10);
		
		int su = 100;
		su = m1.test2(su);
		System.out.println("su:"+su);
		
		char res = m1.test3(97);
		System.out.println(res);
		
		int n1 = 10;
		int n2 = 50;
		System.out.println(m1.sum(n1, n2));
		
	}//main
	
}
