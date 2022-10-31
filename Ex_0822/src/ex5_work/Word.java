package ex5_work;

import java.util.Random;

public class Word {
	//strArr�迭���� �ܾ��ϳ��� �������� ��󳽴�.
	//��� �ܾ �������� ��� ������ �����ϰ�, ������ ��������!!
	
	//���� : PEALP
	//>> ealpp
	//ealpp ����...
	//>> apple
	//apple ����!!

	String[] strArr = {"CHANGE", "JAVA", "SPRING", "ANDROID", "APPLE"};
	private String answer;//������ ������ ����
	private String shake = "";//������ ����� ����
	
	//���� ��ȯ �޼���
	public String getAnswer() {
		int idx = new Random().nextInt( strArr.length );
		answer = strArr[idx];
		return answer;
	}
	
	//������ ��� ������ ����� �޼���
	public String getScramble() {
		
		//���� �ܾ ���� ������ ��� ����
		int[] inArr = new int[answer.length()];
		
		//inArr�迭�� �ߺ����� �ʴ� ������ �ִ´�
		outer : for( int i = 0; i < inArr.length; ) {
			
			inArr[i] = new Random().nextInt(answer.length());
			
			for( int j = 0; j < i; j++ ) {
				if( inArr[i] == inArr[j] ) {
					continue outer;
				}
			}//inner
			
			i++;
		}//outer
		
		for( int i = 0; i < answer.length(); i++ ) {
			shake += answer.charAt( inArr[i] );
		}//for
		
		return shake;
		
	}//getScramble()
}
