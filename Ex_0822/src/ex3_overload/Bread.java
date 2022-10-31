package ex3_overload;

public class Bread {
	// 1번 makeBread()
	public void makeBread() {
		System.out.println("빵을 만들었습니다");
	}

	// 2번 makeBread()
	public void makeBread(int n) {
		for( int i = 0; i < n; i++ ) {
			System.out.println("빵을 만들었습니다");
		}
		
		System.out.println("요청하신 " + n + "개의 빵을 완성함");
	}

	// 3번 makeBread()
	public void makeBread(String name, int n) {
		for( int i = 0; i < n; i++ ) {
			System.out.printf("%s를 만들었습니다\n", name);
		}
		System.out.printf("%s을 %d개 완성함\n", name, n);
	}
}
