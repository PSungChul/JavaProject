package ex1_variable_arg;

public class VariableExam {

	public void test( int... n ) {
		
		//���ο��� �Ѱ��� �Ķ���Ͱ��� n�迭�� ���� ����
		
		for( int i = 0; i < n.length; i++ ) {
			System.out.println( n[i] );
		}
		
	}
	
}
