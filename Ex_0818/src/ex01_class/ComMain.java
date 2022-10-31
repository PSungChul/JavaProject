package ex01_class;

public class ComMain {
	public static void main(String[] args) {
		
		Computer s1 = new Computer();
		s1.myCom();
		
		Computer s2 = new Computer();
		s2.ssd = 4;
		//private으로 만들어진 brand변수는 다른 클래스에서 접근이 불가
		//s2.brand = "삼성";
		s2.myCom();
		
		Computer s3 = new Computer();
		s3.myCom();
	}//main
}
