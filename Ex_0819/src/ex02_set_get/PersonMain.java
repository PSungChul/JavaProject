package ex02_set_get;

public class PersonMain {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("ȫ�浿");
		System.out.println(p1.getName());
		
		p1.setPhone("010-111-1111");
		String phone = p1.getPhone();
		System.out.println(phone);
		
		p1.setAge(20);
		System.out.println( p1.getAge() );
		
		p1.setFriend("��浿", "011", 26);
		System.out.println(p1.getName());
		
	}//main
}
