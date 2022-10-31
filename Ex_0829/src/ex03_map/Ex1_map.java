package ex03_map;

import java.util.HashMap;

public class Ex1_map {
	public static void main(String[] args) {
		//Map : key�� value(��)�� ��� �ϳ��� �����ͷ� ����.
		//key�� �˰� ������ ���ϴ� value�� ���ü� �ֱ� ������ ���� ���� �����͸� �˻��ϴµ�
		//���� �پ ������ ����
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		//map�� �� ������� ���������� ���� ���������
		//Set�� �Ȱ��� index�� ������ Ư������ ������ ã�Ƴ����ִ� ������ �ִ�
		//�׷��⿡ Set�� �ٸ��� ���� ���δ�
		//map�� value�� �ߺ��� ���������
		//key�� �ߺ��� ������� �ʴ´�
		//���� Ű���� �ٸ� value���� ���´ٸ� �� ���߿� ���� value������ ���ŵȴ�
		map1.put('A', 100);
		map1.put('B', 200);
		map1.put('C', 100);
		map1.put('A', 150);
		//key�� ���� Ȯ��
		boolean b = map1.containsKey('B');
		System.out.println(b);
		//value�� ���� Ȯ��
		b = map1.containsValue(100);
		System.out.println(b);
		
		System.out.println(map1.size());
		int res = map1.get('A');
		System.out.println(res);
		
		System.out.println( map1 );
		
		//���� ���� ��� ������ ����
		//map1.clear();
		
		System.out.println("------------------------------");
		
		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		map2.put(0, 10);
		map2.put(1, 20);
		map2.put(2, 30);
		//key�� ������ ����������쿡�� ����
		//�̷������ �� ����� ���Ѵ�
		for( int i = 0; i < map2.size(); i++ ) {
			System.out.println( map2.get(i) );
		}
		
	}//main
}
