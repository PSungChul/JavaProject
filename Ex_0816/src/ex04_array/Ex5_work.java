package ex04_array;

import java.util.Random;

public class Ex5_work {
	public static void main(String[] args) {
		//1 ~ 45������ ������ �߻���Ű�� �ߺ����� �ʵ��� lotto�迭�� ��Ƽ� ���
		//--------------------
		//41 2 7 35 17 27
		
		int[] lotto = new int[6];
		Random rnd = new Random();
		
		outer : for( int i = 0; i < lotto.length; ) {
			
			lotto[i] = rnd.nextInt(45) + 1;
			
			//�ߺ����� ���ϴ� �ݺ���
			for( int j = 0; j < i; j++ ) {
				if( lotto[i] == lotto[j] ) {
					continue outer;
				}
			}//inner
			
			System.out.print( lotto[i] + " " );
			i++;
			
		}//outer
		
	}//main
}
