package ex02_exception;

public class TryCatchEx {
	public static void main(String[] args) {
		//try-catch(예외처리)
		//자바에서는 프로그램이 실행되는 도중에 예외(에러)가 발생하면 그 시점에서
		//프로그램이 강제적으로 종료된다.
		//그러나 때로는 예측 가능한 오류에 대해서 프로그램종료 없이 후반작업을 계속 진행해야 하는 경우가 있다.
		//예외처리를 통해서 프로그램의 비정상적인 종료를 줄여보자!!!!
		
		int n = 0;
		int result = 0;
		
		try {
			//try영역 내부에서 오류가 발생한 경우
			//catch구문을 실행한 뒤에 빠져나간다
			result = 10 / n;
			System.out.println("야호");
			
			int[] arr = new int[1];
			arr[0] = 1;
			arr[1] = 2;
			
		}catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("정수는 0으로 나눌수 없습니다");
			
		}catch( ArrayIndexOutOfBoundsException e ) {
			System.out.println("1번 index가 없습니다");
			
		}
		
		System.out.println(result);
		
		System.out.println("------------------------------");
		
		int[] arr = {1, 2, 3, 4, 5};
		
		//이런식으로 내 실수를 포장하기 위한 용도로 사용 금지
		try {
			
			for( int i = 0; i <= arr.length; i++ ) {
				System.out.println( arr[i] );
			}
		
		}catch (Exception e) {
			
		}
		
	}//main
}
