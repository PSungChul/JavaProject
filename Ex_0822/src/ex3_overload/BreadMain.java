package ex3_overload;

public class BreadMain {
	public static void main(String[] args) {
		
		Bread bread = new Bread();
		
		//1번 makeBread()호출시...
		//빵을 만들었습니다
		bread.makeBread();
		
		System.out.println("------------------------------");
		
		//2번 makeBread()호출시...
		//빵을 만들었습니다
		//빵을 만들었습니다
		//요청하신 2개의 빵을 완성함
		bread.makeBread(2);
		
		System.out.println("------------------------------");
		
		//3번 makeBread()호출시...
		//크림빵을 만들었습니다
		//크림방을 만들었습니다
		//크림빵을 2개 완성함
		bread.makeBread("크림빵", 2);
		
	}//main
}
