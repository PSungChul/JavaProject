package ex01_static;

public class Ex1_static {
	//static으로 선언된 변수나 메서드는 객체가 아무리 많이 생성되어도
	//메모리상에 딱 한개만 만들어 진다.
	//static은 private로는 거의 안만든다
	
	int n;
	static String str;
	
	public static void test2() {
		
		//static메서드 내부에서는 static변수를 생성할 수 없다
		//static int aa = 10;
		
		str = "안녕";//static메서드에서는 static변수만 가져다 사용할 수 있다.
		
		int n = 10;
		//n = 100;//static메서드에서는 일반 변수를 참조하는 것은 불가능.
		
	}
	
	public void test() {
		//일반 메서드에서는 static변수나 일반변수의 구별없이 사용이 가능
		n = 100;
		str = "안녕";
		
		//static int a = 10;
	}
}
