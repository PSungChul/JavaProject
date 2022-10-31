package ex04_list;

import java.util.ArrayList;

public class Ex1_list {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		//set과 다르게 list는 방이 뒤쪽으로 순차적으로 생성된다
		//가장 큰 장점은 index번호가 생성된다
		//단점은 중복값을 허용한다
		list1.add(10);
		list1.add(9);
		list1.add(21);
		list1.add(10);
		list1.remove(1);//1번 index를 삭제 / 인덱스가 있기에 가능하며 삭제된 인덱스에 값이 제거되고 뒤에있는 값들이 앞으로 당겨진다
		list1.add(1, 5);//1번 index에 강제로 자리를 차지 / 원하는 index를 지정해서 값을 넣을 수 있다
		list1.set(3, 11);//3번 index의 값을 수정 / 원하는 index를 지정해서 값을 수정할 수 있다
		System.out.println(list1.size());
		System.out.println(list1);
		//System.out.println(list1.get(1)); //1번 index의 값을 가져와
		
		//list1.clear(); 리스트의 모든 내용을 제거
		
	}//main
}
