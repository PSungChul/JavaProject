package ex2_switch;

public class Ex3_switch {
	public static void main(String[] args) {
		//switch문의 비교값으로는
		//정수(long제외), 문자, 문자열 타입만 사용이 가능
		String str = "B";
		String res = "";
		
		switch( str ) {
		case "A":
			res = "90 ~ 100";
			//break; <-- break가 없다면 비교값과 조건값이 일치하지 않더라도
			//break문법을 찾아서 아래로 진행된다
			
		case "B":
			res = "80 ~ 89";
			//break;
			
		case "C":
			res = "70 ~ 79";
			break;
			
		case "D":
			res = "60 ~ 69";
			break;
			
		case "F":
			res = "59점 이하";
			break;
			
		default:
			System.out.println("올바른 성적을 입력하세요");
			break;
		}//switch
		
		System.out.println(res);
		
	}//main

}
