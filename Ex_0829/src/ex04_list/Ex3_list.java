package ex04_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_list {
	public static void main(String[] args) {
		//키보드에서 id를 입력받아, 순차적으로 출력하시오
		//단 id자리에 x를 입력받으면 프로그램을 종료
		
		//id : aaa
		//[aaa]
		//id : bbb
		//[aaa, bbb]
		//id : aaa
		//[aaa, bbb, aaa]
		//id : x
		//(프로그램 종료)
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
