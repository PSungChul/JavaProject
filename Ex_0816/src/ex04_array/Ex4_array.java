package ex04_array;

public class Ex4_array {
	public static void main(String[] args) {
		//arr에 담긴 값들 중 가장 큰 값을 출력
		//가장 큰 값 : 19
		
		int[] arr = {4, 13, 7, 19, 1, 15};
		int max = arr[0];
		
		for( int i = 1; i < arr.length; i++ ) {
			
			if( arr[i] > max ) {
				max = arr[i];
			}

		}//for
		
		//for( int i : arr ) {
			//if( i > max ) {
				//max = i;
			//}
		//}
		
		System.out.println("큰 값 : " + max);
		
		
	}//main
}
