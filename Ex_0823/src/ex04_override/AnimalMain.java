package ex04_override;

public class AnimalMain {
	public static void main(String[] args) {
		
		Bear bear = new Bear();
		System.out.println("�� : " + bear.getEye());
		System.out.println("�ٸ� : " + bear.getLeg());
		System.out.println("Ư¡ : " + bear.woong);
		System.out.println("------------------------------");
		
		Cat cat = new Cat();
		System.out.println("�� : " + cat.getEye());
		System.out.println("�ٸ� : " + cat.getLeg());
		System.out.println("Ư¡ : " + cat.balance);
		System.out.println("------------------------------");
		
		Elephant ele = new Elephant();
		System.out.println("�� : " + ele.getEye());
		System.out.println("�ٸ� : " + ele.getLeg());
		System.out.println("Ư¡ : " + ele.nose);
		System.out.println("------------------------------");
		
		Snake snake = new Snake();
		System.out.println("�� : " + snake.getEye());
		System.out.println("�ٸ� : " + snake.getLeg());
		System.out.println("Ư¡ : " + snake.sensor);
		System.out.println("------------------------------");
		
	}//main
}
