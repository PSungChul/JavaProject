package ex02_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		//StringŬ������ �޼��� Ȱ���ϱ�
		
		//Ű���忡�� ���� �Է¹ް�, �Է¹��� ���� ȸ��(��)������ �Ǵ��Ͻÿ�
		//-------------
		//�Է� : a123a
		//a123a(��)�� ȸ������ �ƴմϴ�
		
		//�Է� : aabaa
		//aabaa(��)�� ȸ���� �Դϴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String ori = sc.next();//����������
		String rev = "";//������ ����� ������ ����
		
		//ori�� ���� ����� rev�� �����ϴ� ����
		for( int i = ori.length()-1; i >= 0; i-- ) {
			
			rev += ori.charAt(i);
			
		}
		
		if( ori.equals(rev) ) {
			System.out.println(ori + "(��)�� ȸ���� �Դϴ�");
		}else {
			System.out.println(ori + "(��)�� ȸ������ �ƴմϴ�");
		}
		
	}//main
}
