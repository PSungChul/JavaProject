package ex02_static;

public class Bank {

	private String point;//은행위치
	private String tel;//전화번호
	public static float interest = 10f;//이자율
	
	public Bank( String point, String tel ) {
		this.point = point;
		this.tel = tel;
	}
	
	public void getBank() {
		System.out.println("지점 : " + point);
		System.out.println("전화 : " + tel);
		System.out.println("이자율 : " + interest + "%");
		System.out.println("------------------------------");
	}
	
}
