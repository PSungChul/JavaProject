package ex03_map;

import java.util.HashMap;

public class Ex1_map {
	public static void main(String[] args) {
		//Map : key와 value(값)를 묶어서 하나의 데이터로 저장.
		//key만 알고 있으면 원하는 value를 얻어올수 있기 때문에 많은 양의 데이터를 검색하는데
		//아주 뛰어난 성능을 발휘
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		//map은 들어간 순서대로 순차적으로 방이 만들어진다
		//Set과 똑같이 index는 없지만 특정값을 빠르게 찾아낼수있는 장점이 있다
		//그러기에 Set과 다르게 많이 쓰인다
		//map은 value의 중복은 허용하지만
		//key의 중복은 허용하지 않는다
		//같은 키값에 다른 value값이 들어온다면 더 나중에 들어온 value값으로 갱신된다
		map1.put('A', 100);
		map1.put('B', 200);
		map1.put('C', 100);
		map1.put('A', 150);
		//key의 존재 확인
		boolean b = map1.containsKey('B');
		System.out.println(b);
		//value의 존재 확인
		b = map1.containsValue(100);
		System.out.println(b);
		
		System.out.println(map1.size());
		int res = map1.get('A');
		System.out.println(res);
		
		System.out.println( map1 );
		
		//맵이 가진 모든 내용을 삭제
		//map1.clear();
		
		System.out.println("------------------------------");
		
		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		map2.put(0, 10);
		map2.put(1, 20);
		map2.put(2, 30);
		//key를 정수로 설정했을경우에만 가능
		//이런방식은 잘 사용은 안한다
		for( int i = 0; i < map2.size(); i++ ) {
			System.out.println( map2.get(i) );
		}
		
	}//main
}
