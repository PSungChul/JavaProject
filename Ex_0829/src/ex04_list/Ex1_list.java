package ex04_list;

import java.util.ArrayList;

public class Ex1_list {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		//set�� �ٸ��� list�� ���� �������� ���������� �����ȴ�
		//���� ū ������ index��ȣ�� �����ȴ�
		//������ �ߺ����� ����Ѵ�
		list1.add(10);
		list1.add(9);
		list1.add(21);
		list1.add(10);
		list1.remove(1);//1�� index�� ���� / �ε����� �ֱ⿡ �����ϸ� ������ �ε����� ���� ���ŵǰ� �ڿ��ִ� ������ ������ �������
		list1.add(1, 5);//1�� index�� ������ �ڸ��� ���� / ���ϴ� index�� �����ؼ� ���� ���� �� �ִ�
		list1.set(3, 11);//3�� index�� ���� ���� / ���ϴ� index�� �����ؼ� ���� ������ �� �ִ�
		System.out.println(list1.size());
		System.out.println(list1);
		//System.out.println(list1.get(1)); //1�� index�� ���� ������
		
		//list1.clear(); ����Ʈ�� ��� ������ ����
		
	}//main
}
