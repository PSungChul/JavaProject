package ex2_multi_array;

public class Ex1_multiArray {
	public static void main(String[] args) {
		
		//������ �迭 : 1���� �迭�� 2�� ���̸� 2���� �迭
		//          1���� �迭�� 3�� ���̸� 3���� �迭....
							//ū��,������
		int[][] test = new int[2][3];
		
		test[0][0] = 10;
		test[0][1] = 20;
		test[0][2] = 30;
		
		test[1][0] = 40;
		test[1][1] = 50;
		test[1][2] = 60;
		
		System.out.println( test[0][2] );
		
		System.out.println("------------------------------");
		
		//test.length : ū ���� ����
		//test[i].length : ū �濡 ����Ǿ� �ִ� ���������  ����
		for( int i = 0; i < test.length; i++ ) {
			
			for( int j = 0; j < test[i].length; j++ ) {
				
				System.out.print( test[i][j] + " " );
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("------------------------------");
		
		String[][] student = { {"����", "99"},
				               {"ö��", "23", "17"} };
		
		for( int i = 0; i < student.length; i++ ) {
			
			for( int j = 0; j < student[i].length; j++ ) {
				
				System.out.print( student[i][j] + " " );
				
			}//inner
			
			System.out.println();
		}//outer
		
	}//main
}
