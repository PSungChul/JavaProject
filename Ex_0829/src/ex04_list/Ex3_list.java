package ex04_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_list {
	public static void main(String[] args) {
		//Ű���忡�� id�� �Է¹޾�, ���������� ����Ͻÿ�
		//�� id�ڸ��� x�� �Է¹����� ���α׷��� ����
		
		//id : aaa
		//[aaa]
		//id : bbb
		//[aaa, bbb]
		//id : aaa
		//[aaa, bbb, aaa]
		//id : x
		//(���α׷� ����)
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		
		while(true) {
			
			System.out.print("id : ");
			String id = sc.next();
			
			if( id.equalsIgnoreCase("x") ) {
				break;
			}
			
			arr.add(id);
			
			System.out.println(arr);
			
		}//while
		
	}//main
}
