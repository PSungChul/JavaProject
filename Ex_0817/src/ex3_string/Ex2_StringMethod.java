package ex3_string;

import java.util.Scanner;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		//StringŬ������ �޼����
		//�޼��� : Ư���� �۾��� �����ϱ� ���� ��ɹ����� ����
		String str = "Hong Gil Dong";
		int index = str.length();//***
		System.out.println("str�� ���� : " + index);
		
		index = str.indexOf('o');
		System.out.println("�� �� �ҹ��� o�� ��ġ : " + index);
		
		index = str.indexOf("Gil");
		System.out.println("���� Gil�� ���� ��ġ : " + index);
		
		index = str.lastIndexOf('o');
		System.out.println("������ ���� o�� ��ġ : " + index);
		
		char s = str.charAt(6);//***
		System.out.println("6��° ��ġ�� ���� : " + s);
		
		//Scanner sc = new Scanner(System.in);
		//String s1 = sc.next();
		String s2 = "apple";
		//String���� ���Ҷ� ==�� �ƴ� equals�� ���� ==�� �ּҰ��� ���Ҷ� ����Ѵ�
		//s2�� ���� '��'�� apple���� Ȯ�� ***
		if( s2.equals("apple") ) {
			System.out.println("�����ϴ�");
		}
		
		//��ҹ��� �������� �ܾ ������ true ***
		if( s2.equalsIgnoreCase("Apple") ) {
			System.out.println("�����ϴ�");
		}
		
		//���ܾ ��� �빮�ڷ� ����
		System.out.println( s2.toUpperCase() );
		
		//���ܾ ��� �ҹ��ڷ� ����
		System.out.println( str.toLowerCase() );
		
		String id = "     jyh1234     ";
		String t_id = id.trim();//���� �յ��� �ǹ̾��� ������ ���� ***
		if( t_id.equals("jyh1234") ) {
			System.out.println("�α��� ����");
		}
		
		String[] arr = str.split(" ");//" "�� �������� ������ ������
		for( int i = 0; i < arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		
		//��Ʈ�� Ŭ������ �޼���� �ƴ�����... ���� ����ϴ� �޼���
		String number = "10";
		//		���������� ���ڿ��� ���� ������ �������ִ� �޼���
		//		��, ����ó�� ���ܾ߸� �����ϸ� ������� 10a �̷��� �Ұ����ϴ�
		int n = Integer.parseInt(number);
		System.out.println(n + 1);
		
		//wrapperŬ������ ����
		//int - Integer
		//char - Character
		//boolean - Boolean
		//byte - Byte
		//short - Short
		//long - Long
		//float - Float
		//double - Double
	}//main
}
