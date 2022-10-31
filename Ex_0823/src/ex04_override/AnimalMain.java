package ex04_override;

public class AnimalMain {
	public static void main(String[] args) {
		
		Bear bear = new Bear();
		System.out.println("传 : " + bear.getEye());
		System.out.println("促府 : " + bear.getLeg());
		System.out.println("漂隆 : " + bear.woong);
		System.out.println("------------------------------");
		
		Cat cat = new Cat();
		System.out.println("传 : " + cat.getEye());
		System.out.println("促府 : " + cat.getLeg());
		System.out.println("漂隆 : " + cat.balance);
		System.out.println("------------------------------");
		
		Elephant ele = new Elephant();
		System.out.println("传 : " + ele.getEye());
		System.out.println("促府 : " + ele.getLeg());
		System.out.println("漂隆 : " + ele.nose);
		System.out.println("------------------------------");
		
		Snake snake = new Snake();
		System.out.println("传 : " + snake.getEye());
		System.out.println("促府 : " + snake.getLeg());
		System.out.println("漂隆 : " + snake.sensor);
		System.out.println("------------------------------");
		
	}//main
}
