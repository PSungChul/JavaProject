package ex04_array;

public class Ex4_array {
	public static void main(String[] args) {
		//arr�� ��� ���� �� ���� ū ���� ���
		//���� ū �� : 19
		
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
		
		System.out.println("ū �� : " + max);
		
		
	}//main
}
