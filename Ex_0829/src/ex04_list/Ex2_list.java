package ex04_list;

import java.util.ArrayList;

public class Ex2_list {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("�¿�");
		list.add("����");
		list.add("����");
		
		System.out.println(list);
		
		list.remove(0);
		list.set(1, "����");
		list.add(2, "Ƽ�Ĵ�");
		list.add("ȿ��");
		
		System.out.println(list);
	}//main
}
