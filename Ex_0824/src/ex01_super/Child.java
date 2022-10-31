package ex01_super;

public class Child extends Parent{
	
	//super : 부모클래스
	//super의 사용처
	//부모의 생성자를 호출
	public Child() {
		//부모클래스에서 인자값이 없다면 생략가능하지만, 인자값이 있다면 필요하다
		super(10); //Parent();
		System.out.println("Child의 생성자");
	}
	
	//부모의 변수를 호출
	public void test( int num ) {
		super.num = num;
	}
	
	//부모의 메서드를 호출
	@Override
	public int getNum() {
		//     Parent.getNum();
		return super.getNum();
	}
	
}
