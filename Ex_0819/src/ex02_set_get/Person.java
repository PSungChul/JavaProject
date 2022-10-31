package ex02_set_get;

public class Person {

	private String name;
	private String phone;
	private int age;
	
	public void setFriend(String name, String phone, int age) {
		//this : 현재 클래스
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
