package ex05_work;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGameMain {
	public static void main(String[] args) {
		//ArrayList�� ���� 3�� �������� data�迭�� �غ�� �ܾ�� �� �ϳ��� �������� �߰�
		//�߰��� �ܾ ȭ�鿡 ����ְ�
		//����ڰ� ��ġ�ϴ� ���� �Է������� �ܾ ���������� ���·�
		//��� �ܾ �����Ǹ� ���α׷��� ����ǵ��� �Ͻÿ�.
		
		//-------------------------------
		
		//[grape]
		//>> grape
		//[apple, banana]
		//>> banana
		//[apple]
		//>> apple
		//[orange]
		//>> orange
		//[banana, banana, grape]
		//>> banana
		//[banana, grape]
		//>> grape
		//[banana]
		//>> banana
		//Ŭ����!!
		ArrayList<String> arr = new ArrayList<String>();
		
		WordGame wg = new WordGame(arr);
		wg.start();//�����忡�� 3�� �������� �ܾ �߰�
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//�������� �Ǵ�
			if(arr.size() == 0) {
				System.out.println("Ŭ����");
				wg.setPlaying(false);//�����带 �����ϴ� �ڵ�
				break;
			}
			
			System.out.println( arr );
			System.out.print(">> ");
			
			String in = sc.next();
			
			//����ڰ� �Է��� �ܾ�� list����� �ܾ ��ġ�ϴ� ���
			for( int i = 0; i < arr.size(); i++ ) {
				if( in.equalsIgnoreCase( arr.get(i) ) ) {
					arr.remove(i);
					break;
				}
			}
			
		}//while
		
	}//main
}
