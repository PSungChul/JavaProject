package ex02_input;

import java.io.IOException;
import java.util.Scanner;

public class Ex4_input {
	public static void main(String[] args) {
		
		byte[] read = new byte[100];
		
		Scanner sc = new Scanner(System.in);
		//��ĳ�ʸ� ������ Ǯ�� ���� ���
		System.out.print("�Է� : ");
		try {
			System.in.read( read );
			int n = Integer.parseInt( new String(read).trim() );
			System.out.println(n);
			
			System.out.print("���� : ");
			System.in.read(read);
			System.out.println( new String(read).trim() );
			
			//System.in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//sc.close();//��ĳ�� Ư���� ��Ʈ���迭�� ��ĳ�ʸ� close()�� ������� �ʴ´�
		
	}//main
}
