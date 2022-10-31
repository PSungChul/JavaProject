package ex03_formatter;

public class Ex1_printf {
	public static void main(String[] args) {
		
		int age = 23;
		//저의 나이는 23세 입니다
		System.out.println( "저의 나이는 " + age + "세 입니다" );
		System.out.printf("저의 나이는 %d세 입니다\n", age);
		
		int su1 = 10;
		int su2 = 5;
		System.out.printf("%d + %d = %d\n", su1, su2, su1+su2);
		
		int year = 2022;
		int month = 8;
		int day = 16;
		//2022-8-16
		//2022.08.09
		//2022/08/16
		System.out.printf("%d.%02d.%02d\n", year, month, day);
		
		//현재 기온은 32.7도 이며, 습도는 60.3%입니다
		System.out.printf("현재 기온은 %.1f도 이며, 습도는 %.2f%%입니다\n", 32.7, 60.3);
		
		//저는 김씨이고 혈액형은 A형 입니다.
		System.out.printf("저는 %c씨이고 혈액형은 %c형 입니다\n", '김', 'A');
		
		//저는 남자입니다
		System.out.printf("저는 %s입니다\n", "남자");
		
		//결과는 true입니다
		System.out.printf("결과는 %b입니다", true);
		
		//formatter의 종류
		//%d : 정수
		//%f : 실수
		//%c : 문자
		//%s : 문장
		//%b : boolean
		//%% : %기호 출력
	}//main
}
