package ex05_interface;

//인터페이스는 다중구현이 가능하다
//public class Kitchen implements Menu1, Menu2, Menu3{
public class Kitchen implements Menu3{

	@Override
	public String jjajang() {
		return "중면 + 춘장소스 + 양파";
	}

	@Override
	public String jjambbong() {
		return "홍합 + 오징어 + 고추기름";
	}

	@Override
	public String tangsuyuck() {
		return "돼지고기 + 당근 + 목이버섯";
	}

	@Override
	public String mandu() {
		return "밀가루 + 만두소";
	}

	@Override
	public String boggembab() {
		return "밥 + 달걀 + 당근";
	}

}
