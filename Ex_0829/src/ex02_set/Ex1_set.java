package ex02_set;

import java.util.HashSet;
import java.util.Random;

public class Ex1_set {
	public static void main(String[] args) {
		//컬렉션 프레임워크 : 배열과 같이 index의 갯수가 정해져 있지 않은 클래스들
		//원하는 만큼 값을 저장하고 필요한 값들을 찾아서 사용할 수 있다.
		//1) Set
		//2) Map
		//3) List
		
		//<제너릭타입> : 클래스형태의 데이터로써 앞으로 사용할 객체가
		//어떤 타입의 값을 관리하게 될지 결정해주는 타입
		HashSet<Integer> hs = new HashSet<Integer>();
		//set은 가장 큰 장점이 중복이 알아서 걸러진다는것
		//단점은 순서가 정해지지않고 중구난방으로 들어간다
		//그러기에 값이 순차적이지 않고 주소가 제각각이며 index도 없어 따로 호출이 불가하다
		//그래서 장점보단 단점이 너무 커서 잘 사용하진 않는다
		hs.add(45);
		hs.add(11);
		hs.add(20);
		hs.add(1);
		hs.add(11);
		
		System.out.println( hs.size() );
		System.out.println( hs );
		
		System.out.println("------------------------------");
		
		hs.clear();//set에 담긴 모든 데이터를 삭제
		
		Random rnd = new Random();
		
		while( true ) {
			
			int r = rnd.nextInt(45) + 1;
			hs.add(r);
			
			if( hs.size() == 6 ) {
				break;
			}
			
		}//while
		
		System.out.println(hs);
		//set에 대괄호를 없애거나, index를 부여할때 쓰는 방식
		Integer[] arr = hs.toArray( new Integer[0] );
		
		for( int i = 0; i < arr.length; i++ ) {
			System.out.print( arr[i] + " " );
		}
		
	}//main
}
