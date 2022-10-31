package ex4_constructor;

public class ConMain {
	public static void main(String[] args) {
		ConEx con = new ConEx("apple", "iphone 15");
		//생성자는 명시적 객체생성을 통해 딱 한번만 호출되며,
		//이후에는 절대로 호출할 수 없다
		//con.ConEx();
		con.getIphone();
		
		ConEx con1 = new ConEx();
		con1.getIphone();
		
		ConEx con2 = new ConEx("apple", "iphone 14 pro");
		con2.getIphone();
		
	}//main
}
