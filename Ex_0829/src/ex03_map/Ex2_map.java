package ex03_map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2_map {
	public static void main(String[] args) {
		
		//id : kim
		//pw : 1234
		//아이디가 존재하지 않습니다
		
		//id : jo
		//pw : 3333
		//비밀번호가 불일치
		
		//id : han
		//pw : 3333
		//han님 환영합니다
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("hong", 1111);
		map.put("jo", 2222);
		map.put("han", 3333);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		String id = sc.next();
		
		System.out.print("pw : ");
		int pw  = sc.nextInt();
		
		if( !map.containsKey(id) ) {
			System.out.println("아이디가 존재하지 않습니다");
		}else {
			//아이디가 존재하는 경우
			if( map.get(id) == pw ) {
				System.out.println(id + "로그인성공");
			}else {
				System.out.println("비밀번호 불일치");
			}
		}
		
	}//main
}
