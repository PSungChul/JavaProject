package ex04_array;

public class Ex1_array {
	public static void main(String[] args) {
		
		//배열 : '같은 자료형 끼리 모아둔 하나의 묶음'이다.
		//효율적인 자료관리를 위해 반드시 필요한 개념
		int s1 = 100;
		int s2 = 200;
		int s3 = 300;
		int s4 = 400;
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("------------------------------");
		
		//많은 양의 자원들을 쉽게 관리하고 사용하기 위해 배열을 사용
		//1) 배열 선언
		int[] arr;
		
		//2) 배열 생성
		arr = new int[4];
		
		//3) 배열 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		//arr[3] = "안녕";
		arr[3] = 40;
		
		//배열에 존재하지 않는 방에는 값을 추가할 수 없다.
		//arr[4] = 50;
		
		//배열 arr이 가진 모든 값을 출력
		//arr.length : arr배열의 index수
		for( int i = 0; i < arr.length; i++ ) {
			System.out.println( arr[i] );	
		}
		
	}//main
}
