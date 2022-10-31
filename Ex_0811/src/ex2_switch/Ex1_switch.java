package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		//switch : 비교값과 조건값을 통해서 결과를 얻어내는 제어문
		//switch( 비교값 ){
		// case 조건값:
		//		비교값과 조건값이 일치하면 실행되는 영역
		//		break;
		//}
		
		int n = 2;
		switch( n ) {//비교값
		case 1://조건값
			System.out.println("1.게임시작");
			break;//switch문을 강제로 빠져나가는 키워드
			
		case 2:
			System.out.println("2.게임소개");
			break;
			
		case 3:
			System.out.println("3.게임종료");
			break;
			
		default:
			//비교값과 조건값이 한개도 일치하지 않는경우 반드시 호출되는 영역
			System.out.println("1, 2, 3중 한가지만 입력하세요");
			break;
		}//switch
		
	}//main
}
