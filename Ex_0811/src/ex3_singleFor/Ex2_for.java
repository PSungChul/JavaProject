package ex3_singleFor;

public class Ex2_for {
	public static void main(String[] args) {
		//입력받은 dan에 해당되는 구구단을 출력
		//---------------------
		//6 * 1 = 6
		//	...
		//6 * 9 = 54
		int dan = 6;
		
		for ( int i = 1; i <= 9; i++ ) {
			
			System.out.println( dan + " * " + i + " = " + dan * i );
			
		}//for
		
	}//main
}
