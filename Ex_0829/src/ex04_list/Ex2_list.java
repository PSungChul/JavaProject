package ex04_list;

import java.util.ArrayList;

public class Ex2_list {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("유리");
		list.add("태연");
		list.add("지코");
		list.add("윤아");
		
		System.out.println(list);
		
		list.remove(0);
		list.set(1, "유리");
		list.add(2, "티파니");
		list.add("효연");
		
		System.out.println(list);
	}//main
}
