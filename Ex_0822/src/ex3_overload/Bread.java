package ex3_overload;

public class Bread {
	// 1�� makeBread()
	public void makeBread() {
		System.out.println("���� ��������ϴ�");
	}

	// 2�� makeBread()
	public void makeBread(int n) {
		for( int i = 0; i < n; i++ ) {
			System.out.println("���� ��������ϴ�");
		}
		
		System.out.println("��û�Ͻ� " + n + "���� ���� �ϼ���");
	}

	// 3�� makeBread()
	public void makeBread(String name, int n) {
		for( int i = 0; i < n; i++ ) {
			System.out.printf("%s�� ��������ϴ�\n", name);
		}
		System.out.printf("%s�� %d�� �ϼ���\n", name, n);
	}
}
