package ex2_multi_array;

public class Ex2_multiArray {
	public static void main(String[] args) {
		
		//arr�� ��� ��� ���� �հ� ���(�Ҽ��� ���ڸ�����)�� ���
		//���� : 162
		//��� : 13.5
		
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
		
		System.out.println("���� : " + total);
		avg = (float)total / cnt;
		System.out.printf("��� : %.1f", avg);
		
	}//main
}
