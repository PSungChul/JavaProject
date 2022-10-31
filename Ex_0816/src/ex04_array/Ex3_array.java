package ex04_array;

public class Ex3_array {
	public static void main(String[] args) {
		//배열 arr에 담긴 모든 값의 합과 평균(소수점 한자리까지)을 출력
		//결과 : 108
		//평균 : 21.6
		
		int[] arr = {1, 5, 10, 42, 50};
		int result = 0;
		float avg = 0;
		
		//for( int i = 0; i < arr.length; i++ ) {
			//result += arr[i];
		//}
		
		for( int i : arr ) {
			result += i;
		}
		
		System.out.println("총점 : " + result);
		avg = (float)result / arr.length;
		System.out.printf("평균 : %.1f", avg);
	}//main
}
