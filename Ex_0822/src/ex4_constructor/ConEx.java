package ex4_constructor;

public class ConEx {
	
	private String brand;
	private String name;
	
	//생성자 : 객체가 생성될 때 멤버변수의 초기화 및 메모리할당을 위해 호출되는 영역
	//ConEx con = new ConEx();
	public ConEx() {
		brand = "apple";
		name = "iphone";
	}
	
	public ConEx(String brand, String name) {
		this.brand = brand;
		this.name = name;
	}
	
	public void getIphone() {
		System.out.println("브랜드 : " + brand);
		System.out.println("이름 : " + name);
		System.out.println("----------------");
	}
	
}
