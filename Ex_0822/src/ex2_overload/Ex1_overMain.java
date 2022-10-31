package ex2_overload;

public class Ex1_overMain {
	public static void main(String[] args) {
		Ex1_overload ov = new Ex1_overload();
		ov.result();
		ov.result(10);
		ov.result('A');
		ov.result("hi");
		ov.result("hello", 10);
		ov.result(10, "hi");
		
	}//main
}
