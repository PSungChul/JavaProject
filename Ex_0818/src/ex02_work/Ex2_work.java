package ex02_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		//String�� �޼���� 2���� �迭�� ����ϱ�
		//-------------------
		//�˻��� ��� : lee
		//[lee]
		//����
		//����
		//��λ�
		
		//�˻��� ��� : jo
		//�ش� ��찡 �������� �ʽ��ϴ�
		
		String[][] actor = {{"[song]", "����", "����", "����"},
							{"[lee]", "����", "����", "��λ�"},
							{"[kim]", "���ϵ�", "������ �׳�", "�����ϰ� �����ϰ�"}};
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� ��� : ");
		String name = sc.next();
		
		int cnt = 0;
		
		for( int i = 0; i < actor.length; i++ ) {
			
			if( actor[i][0].equals("["+name+"]") ) {
				for( int j = 0; j < actor[i].length; j++ ) {
					
					System.out.println(actor[i][j]);
					
				}//inner
			}else {
				
				cnt++;
				
				if( cnt == actor.length ) {
					System.out.println("�ش� ��찡 �������� �ʽ��ϴ�");
				}
				
			}
			
		}//outer
		
	}//main
}
