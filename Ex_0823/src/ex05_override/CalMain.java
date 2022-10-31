package ex05_override;

public class CalMain {
	public static void main(String[] args) {
		
		Plus p = new Plus();
		Minus m = new Minus();
		
		System.out.println( p.getResult(10, 5) );//15
		System.out.println( m.getResult(10, 5) );//5
		
	}//main
}
