package ex02_set;

import java.util.HashSet;
import java.util.Random;

public class Ex1_set {
	public static void main(String[] args) {
		//�÷��� �����ӿ�ũ : �迭�� ���� index�� ������ ������ ���� ���� Ŭ������
		//���ϴ� ��ŭ ���� �����ϰ� �ʿ��� ������ ã�Ƽ� ����� �� �ִ�.
		//1) Set
		//2) Map
		//3) List
		
		//<���ʸ�Ÿ��> : Ŭ���������� �����ͷν� ������ ����� ��ü��
		//� Ÿ���� ���� �����ϰ� ���� �������ִ� Ÿ��
		HashSet<Integer> hs = new HashSet<Integer>();
		//set�� ���� ū ������ �ߺ��� �˾Ƽ� �ɷ����ٴ°�
		//������ ������ ���������ʰ� �߱��������� ����
		//�׷��⿡ ���� ���������� �ʰ� �ּҰ� �������̸� index�� ���� ���� ȣ���� �Ұ��ϴ�
		//�׷��� �������� ������ �ʹ� Ŀ�� �� ������� �ʴ´�
		hs.add(45);
		hs.add(11);
		hs.add(20);
		hs.add(1);
		hs.add(11);
		
		System.out.println( hs.size() );
		System.out.println( hs );
		
		System.out.println("------------------------------");
		
		hs.clear();//set�� ��� ��� �����͸� ����
		
		Random rnd = new Random();
		
		while( true ) {
			
			int r = rnd.nextInt(45) + 1;
			hs.add(r);
			
			if( hs.size() == 6 ) {
				break;
			}
			
		}//while
		
		System.out.println(hs);
		//set�� ���ȣ�� ���ְų�, index�� �ο��Ҷ� ���� ���
		Integer[] arr = hs.toArray( new Integer[0] );
		
		for( int i = 0; i < arr.length; i++ ) {
			System.out.print( arr[i] + " " );
		}
		
	}//main
}
