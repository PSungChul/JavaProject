package ex1_variable_arg;

public class VariableExam {

	public void test( int... n ) {
		
		//메인에서 넘겨준 파라미터값을 n배열로 만들어서 저장
		
		for( int i = 0; i < n.length; i++ ) {
			System.out.println( n[i] );
		}
		
	}
	
}
