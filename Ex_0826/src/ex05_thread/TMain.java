package ex05_thread;

import java.util.Scanner;

public class TMain {
	public static void main(String[] args) {
		//��ĳ�ʿ��� ������ �ް�
		//�Է¹��� ���ڸ� ������ Ŭ������ �ѱ��
		//1�� �������� ���ҵǴ� ���� ����ϴٰ�
		//0�� �Ǿ��� �� �����Ͻÿ�.
		//-------------------------
		//�� : 5
		//5
		//4
		//3
		//2
		//1
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		
		int n = sc.nextInt();
		
		ThreadCount tc = new ThreadCount();
		tc.setN(n);
		tc.start();
		
	}//main
}
