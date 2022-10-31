package ex01_work;

import java.util.Random;
import java.util.Scanner;

public class HangMan {
	
	String[] word = {"apple", "test", "game"};
	int random = new Random().nextInt(word.length);
	
	//�������� ���õ� �ܾ *�� �����ؼ� ���
	char[] ast = new char[ word[random].length() ];
	
	int count = 0;
	//����ڰ� �Է��� ���ڰ� �ܾ ���ԵǾ� �ִ����� �Ǵ�
	boolean check = false;
	
	//������ �������� �Ǵ��ϴ� ����
	boolean isEnd = false;
	
	public void play() {
		
		Scanner sc = new Scanner(System.in);
		
		for( int i = 0; i < ast.length; i++ ) {
			ast[i] = '*';
		}
		
		label : while(true) {
			
			count++;
			
			System.out.print("word : ");
			for( int i = 0; i <ast.length; i++ ) {
				System.out.print(ast[i]);
			}
			System.out.print(">> ");
			
			String in = sc.next();
			
			check = false;
			isEnd = false;
			
			for( int i = 0; i< ast.length; i++ ) {
				
				if( in.charAt(0) == ast[i] ) {
					System.out.println(in + "�� �̹� �Է��߽��ϴ�.");
					continue label;
				}
				
				if( in.charAt(0) == word[random].charAt(i) ) {
					ast[i] = in.charAt(0);
					check = true;
				}
				
				if( ast[i] == '*' ) {
					//���� ������ ã�� ���Ѱ��
					isEnd = true;
				}
				
			}//for
			
			if(!check) {
				System.out.println(in + "�� ���ԵǾ� ���� �ʽ��ϴ�");
			}
			
			if(!isEnd) {
				System.out.println( word[random] + "����" );
				System.out.println(count + "ȸ���� ����");
				break;
			}
			
		}//while
		
	}//play()
	
}
