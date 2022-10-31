package ex2_multi_array;

public class Ex2_multiArray {
	public static void main(String[] args) {
		
		//arr에 담긴 모든 값의 합과 평균(소수점 한자리까지)을 출력
		//총합 : 162
		//평균 : 13.5
		
		int[][] arr = {{4, 6, 1, 11},
				       {50, 16},
				       {9},
				       {23, 17, 8, 15, 2}};
		
		int total = 0;
		float avg = 0;
		int cnt = 0;
		
		for( int i = 0; i < arr.length; i++ ) {
			
			for( int j = 0; j < arr[i].length; j++ ) {
				
				total += arr[i][j];
				cnt++;
				
			}//inner
			
		}//outer
		
		System.out.println("총합 : " + total);
		avg = (float)total / cnt;
		System.out.printf("평균 : %.1f", avg);
		
	}//main
}
