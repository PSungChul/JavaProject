package ex1_if;

public class Ex3_work {
	public static void main(String[] args) {
		
		/*
		 과수원이 있다.
		 배, 사과, 오렌지가 있는데 하루 생산량은 각각
		 5, 7, 5개다.
		 과수원에서 하루에 생산되는 과일의 총 갯수를 출력하고
		 시간당 전체과일의 평균 생산갯수를 출력.
		 단, 과일의 갯수를 담을 변수와 총합은 int,
		 평균 생산갯수를 저장하는 변수는 float타입으로 만들 것.
		 --------------------------------
		 하루생산량 : 17
		 시간당평균 : 0.7083333...
		 */
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int total = pear + apple + orange;
		System.out.println("하루생산량 : " + total + "개");
		
		float avg = (float)total / 24;
		//float avg = total / 24f;
		System.out.println("시간당평균 : " + avg + "개");
		
	}//main

}
