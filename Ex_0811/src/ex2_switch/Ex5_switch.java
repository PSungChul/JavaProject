package ex2_switch;

public class Ex5_switch {
	public static void main(String[] args) {
		
		//10 * 25 = 250
		
		int su1 = 10;
		int su2 = 25;
		String op = "*";
		
		switch( op ) {
		case "+":
			System.out.println( su1 + " + " + su2 + " = " + (su1+su2) );
			break;
			
		case "-":
			System.out.println( su1 + " - " + su2 + " = " + (su1-su2) );
			break;
			
		case "*":
			System.out.println( su1 + " * " + su2 + " = " + (su1*su2) );
			break;
		
		case "/":
			System.out.println( su1 + " / " + su2 + " = " + (su1/su2) );
			break;
			
		default:
			System.out.println(op + "�� �ùٸ� �����ڰ� �ƴմϴ�");
			break;
		}//switch
		
	}//main
}
