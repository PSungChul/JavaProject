package ex04_array;

public class Ex2_array {
	public static void main(String[] args) {
		
		//배열의 선언 및 생성
		char[] ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		//ch[4] = '!';
		
		//선언, 생성, 초기화를 한번에
		char[] ch2 = {'J', 'A', 'V', 'A'};
		
		//배열 ch2가 가진 값을 모두 출력하시오
		for( int i = 0; i < ch2.length; i++ ) {
			System.out.println(ch2[i]);
		}
		
		System.out.println("------------------------------");
		
		//개선된 for문
		for( char c : ch ) {
			System.out.print(c);
		}
		
	}//main
}
