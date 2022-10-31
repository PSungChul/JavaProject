package ex2_multi_array;

public class Ex1_multiArray {
	public static void main(String[] args) {
		
		//다차원 배열 : 1차원 배열이 2개 모이면 2차원 배열
		//          1차원 배열이 3개 모이면 3차원 배열....
							//큰방,작은방
		int[][] test = new int[2][3];
		
		test[0][0] = 10;
		test[0][1] = 20;
		test[0][2] = 30;
		
		test[1][0] = 40;
		test[1][1] = 50;
		test[1][2] = 60;
		
		System.out.println( test[0][2] );
		
		System.out.println("------------------------------");
		
		//test.length : 큰 방의 갯수
		//test[i].length : 큰 방에 연결되어 있는 작은방들의  갯수
		for( int i = 0; i < test.length; i++ ) {
			
			for( int j = 0; j < test[i].length; j++ ) {
				
				System.out.print( test[i][j] + " " );
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("------------------------------");
		
		String[][] student = { {"영희", "99"},
				               {"철수", "23", "17"} };
		
		for( int i = 0; i < student.length; i++ ) {
			
			for( int j = 0; j < student[i].length; j++ ) {
				
				System.out.print( student[i][j] + " " );
				
			}//inner
			
			System.out.println();
		}//outer
		
	}//main
}
