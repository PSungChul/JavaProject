package ex03_map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2_map {
	public static void main(String[] args) {
		
		//id : kim
		//pw : 1234
		//���̵� �������� �ʽ��ϴ�
		
		//id : jo
		//pw : 3333
		//��й�ȣ�� ����ġ
		
		//id : han
		//pw : 3333
		//han�� ȯ���մϴ�
		
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
			System.out.println("���̵� �������� �ʽ��ϴ�");
		}else {
			//���̵� �����ϴ� ���
			if( map.get(id) == pw ) {
				System.out.println(id + "�α��μ���");
			}else {
				System.out.println("��й�ȣ ����ġ");
			}
		}
		
	}//main
}
