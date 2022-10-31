package ex2_switch;

public class Ex2_switch {
	public static void main(String[] args) {
		
		char ch = '이';
		
		//비교값과 조건값의 타입은 반드시 일치해야 한다
		switch( ch ) {//비교값
		case '김'://조건값
			System.out.println("26%");
			break;
			
		case '이':
			System.out.println("14%");
			break;
			
		case '박':
			System.out.println("7%");
			break;
			
		case '최':
			System.out.println("5%");
			break;
			
		default:
			System.out.println("순위권 밖에 있습니다");
			break;
		}//switch
		
	}//main
}
